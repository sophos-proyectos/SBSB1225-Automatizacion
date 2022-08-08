package com.bineo.app.utilities;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class GetBounds {
    private GetBounds() {
    }

    public static String element(Target target, Actor actor) {
        return String.valueOf(target.resolveFor(actor).getAttribute("bounds"));
    }
}