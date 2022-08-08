package com.bineo.app.tasks.apis;

import com.bineo.app.enums.Values;
import com.bineo.app.enums.apis.Apis;
import com.bineo.app.enums.apis.EndPoints;
import com.bineo.app.enums.apis.Host;
import com.bineo.app.factories.apis.UpdateDataUserFactory;
import com.bineo.app.models.apis.updatedata.UpdateDataUserModel;
import com.bineo.app.utilities.AddAbilityActor;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ModifyClient implements Task {

    private final String idNumber;
    private final String idType;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final UpdateDataUserModel updateDataUserModel;
    private final int phoneRandom;

    public ModifyClient(String idNumber, String idType) {
        this.idNumber = idNumber;
        this.idType = idType;
        this.updateDataUserModel = UpdateDataUserFactory.withDataDefault();
        this.phoneRandom = new Random().nextInt(99999) + 103688541;
    }

    public static ModifyClient withData(String idNumber, String idType) {
        return instrumented(ModifyClient.class, idNumber, idType);
    }

    @Override
    @SneakyThrows
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                GetTokenConsultAccount.withHost(Host.HOST_CONSULT_ACCOUNT_TOKEN.url(), idNumber, idType),
                GetIdAccountClient.withData(idNumber, idType, Host.HOST_CONSULT_ACCOUNT.url()),
                GetTokenUpdateClient.withHost(Host.HOST_ACCOUNT_TOKEN.url())
        );

        AddAbilityActor.callAnApi(actor, Host.HOST_ACCOUNT.url());
        updateDataUserModel.setSalesforceId(actor.recall(Apis.SAVE_ID_CLIENT.value()));
        updateDataUserModel.getInformacionPerfil().setCellPhone(Values.INITIAL_CELL_PHONE_NUMBER.message().concat(String.valueOf(phoneRandom)));
        String json = objectMapper.writeValueAsString(updateDataUserModel);
        actor.attemptsTo(
                Put.to(EndPoints.CLIENT.resource())
                        .with(request -> request.auth().preemptive().oauth2(actor.recall(Apis.SAVE_TOKEN_UPDATE_CLIENT.value()))
                                .header("Content-Type", ContentType.JSON)
                                .body(json)
                        )
        );
        Logger.getAnonymousLogger().log(Level.INFO, "Estado: {0}", SerenityRest.lastResponse().jsonPath().getObject("responseMessage", String.class));
    }
}