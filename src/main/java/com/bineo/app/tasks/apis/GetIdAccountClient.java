package com.bineo.app.tasks.apis;

import com.bineo.app.enums.Values;
import com.bineo.app.enums.apis.Apis;
import com.bineo.app.enums.apis.EndPoints;
import com.bineo.app.utilities.AddAbilityActor;
import com.bineo.app.utilities.Encode64Base;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import java.util.logging.Level;
import java.util.logging.Logger;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetIdAccountClient implements Task {
    private final String idNumber;
    private final String host;
    private final String idType1;
    private String idType;

    public GetIdAccountClient(String idNumber, String idType, String host) {
        this.idNumber = idNumber;
        this.idType = idType;
        this.host = host;
        this.idType1 = idType;
    }

    public static GetIdAccountClient withData(String idNumber, String idType, String host) {
        return instrumented(GetIdAccountClient.class, idNumber, idType, host);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AddAbilityActor.callAnApi(actor, host);
        idType = (Boolean.TRUE.equals(idType.equalsIgnoreCase(Values.USER_REGISTER_TYPE_DOCUMENT.message()))) ? "Cédula de Ciudadanía" : "Cédula de Extranjería";
        String preferredUsername = (Boolean.TRUE.equals(idType1.equalsIgnoreCase(Values.USER_REGISTER_TYPE_DOCUMENT.message()))) ? "cc".concat(idNumber) : "ce".concat(idNumber);
        actor.attemptsTo(
                Get.resource(EndPoints.ACCOUNT.resource())
                        .with(request -> request.header("Authorization", "Bearer " + actor.recall(Apis.SAVE_TOKEN_CONSULT_CLIENT.value()))
                                .header("preferred_username", Encode64Base.encode(preferredUsername))
                                .header("Content-Type", ContentType.JSON)
                                .params("tipoDocumento", idType,
                                        "numeroDocumento", idNumber)
                        )
        );
        actor.remember(Apis.SAVE_ID_CLIENT.value(), SerenityRest.lastResponse().jsonPath().getObject("data.accountId", String.class));
        Logger.getAnonymousLogger().log(Level.INFO, "Id Cliente: {0}", SerenityRest.lastResponse().jsonPath().getObject("data.accountId", String.class));
    }
}