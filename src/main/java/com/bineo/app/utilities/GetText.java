package com.bineo.app.utilities;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class GetText {

    private GetText() {
    }

    public static String elementAsString(Target target, Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }
}