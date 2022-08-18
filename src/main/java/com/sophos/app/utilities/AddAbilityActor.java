package com.sophos.app.utilities;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class AddAbilityActor {
    private AddAbilityActor() {
    }

    public static void callAnApi(Actor actor, String url) {
        actor.whoCan(CallAnApi.at(url));
    }
}