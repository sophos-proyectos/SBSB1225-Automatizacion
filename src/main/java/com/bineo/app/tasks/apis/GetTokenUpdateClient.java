package com.bineo.app.tasks.apis;

import com.bineo.app.enums.apis.Apis;
import com.bineo.app.enums.apis.EndPoints;
import com.bineo.app.utilities.AddAbilityActor;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetTokenUpdateClient implements Task {
    private final String host;

    public GetTokenUpdateClient(String host) {
        this.host = host;
    }

    public static GetTokenUpdateClient withHost(String host) {
        return instrumented(GetTokenUpdateClient.class, host);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AddAbilityActor.callAnApi(actor, host);
        actor.attemptsTo(
                Post.to(EndPoints.TOKEN_CLIENT.resource())
                        .with(request -> request.header("Content-Type", ContentType.JSON)
                                .queryParams("grant_type", "password",
                                        "client_id", "3MVG9aFryxgomHTZBf2tPqyBm7YMGBPsaUmTeYJ23HOwn_ZlHQPECesVD.J.K8AFi67Q2.aqw62PGtS1M9.M7",
                                        "client_secret", "19ABB0788BFA998A72A88ABE4B857B75117269436D5C6E170AD4416EF706FB79",
                                        "username", "miguel.herrera@sophossolutions.com.fullcopy",
                                        "password", "Miguel1234")
                        )
        );
        actor.remember(Apis.SAVE_TOKEN_UPDATE_CLIENT.value(), SerenityRest.lastResponse().jsonPath().getObject("access_token", String.class));
    }
}