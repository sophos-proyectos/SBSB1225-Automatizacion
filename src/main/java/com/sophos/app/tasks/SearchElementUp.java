package com.sophos.app.tasks;

import com.sophos.app.interactions.Scroll;
import com.sophos.app.utilities.Properties;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchElementUp implements Task {
    private final Target target;
    private static final int ATTEMPTS = 5;
    private int intento = 1;

    public SearchElementUp(Target target) {
        this.target = target;
    }

    public static SearchElementUp inScreen(Target target) {
        return instrumented(SearchElementUp.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Properties.modifyImplicitWait();
        while (Boolean.FALSE.equals((Visibility.of(target).viewedBy(actor).asBoolean())) && intento <= ATTEMPTS) {
            actor.attemptsTo(
                    Scroll.up()
            );
            intento++;
        }
        Properties.defaultImplicitWait();
    }
}