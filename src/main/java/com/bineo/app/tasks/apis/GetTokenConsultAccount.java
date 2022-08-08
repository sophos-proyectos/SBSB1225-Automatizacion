package com.bineo.app.tasks.apis;

import com.bineo.app.enums.Values;
import com.bineo.app.enums.apis.Apis;
import com.bineo.app.enums.apis.EndPoints;
import com.bineo.app.factories.apis.ClientTokenFactory;
import com.bineo.app.models.apis.updatedata.ClientTokenModel;
import com.bineo.app.utilities.AddAbilityActor;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetTokenConsultAccount implements Task {

    private final String host;
    private final ClientTokenModel clientTokenModel;
    private final String idNumber;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private String idType;


    public GetTokenConsultAccount(String host, String idNumber, String idType) {
        this.host = host;
        this.clientTokenModel = ClientTokenFactory.withDataDefault();
        this.idNumber = idNumber;
        this.idType = idType;
    }

    public static GetTokenConsultAccount withHost(String host, String idNumber, String idType) {
        return instrumented(GetTokenConsultAccount.class, host, idNumber, idType);
    }

    @Override
    @SneakyThrows
    public <T extends Actor> void performAs(T actor) {

        AddAbilityActor.callAnApi(actor, host);
        idType = (Boolean.TRUE.equals(idType.equalsIgnoreCase(Values.USER_REGISTER_TYPE_DOCUMENT.message()))) ? "cc" : "ce";
        clientTokenModel.setTipoDocumento(idType);
        clientTokenModel.setNumeroDocumento(idNumber);
        String json = objectMapper.writeValueAsString(clientTokenModel);
        actor.attemptsTo(
                Post.to(EndPoints.TOKEN_OTP.resource()).with(request -> request.header("user_key", "48c2c7e8e08f81ea382e14d3a221ede6")
                        .header("Content-Type", ContentType.JSON)
                        .body(json)
                )
        );
        actor.remember(Apis.SAVE_TOKEN_CONSULT_CLIENT.value(), SerenityRest.lastResponse().jsonPath().getObject("tokenUser", String.class));
    }
}