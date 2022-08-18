package com.sophos.app.tasks;

import com.sophos.app.interactions.Move;
import com.sophos.app.utilities.Properties;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchElementLeftDown implements Task {
    private final Target target;
    private static final int START_POINT_DOWN = 70;
    private static final int ATTEMPTS = 5;
    private int intento = 1;

    public SearchElementLeftDown(Target target) {
        this.target = target;
    }

    public static SearchElementLeftDown inScreen(Target target) {
        return instrumented(SearchElementLeftDown.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Properties.modifyImplicitWait();
        while (Boolean.FALSE.equals((Visibility.of(target).viewedBy(actor).asBoolean())) && intento <= ATTEMPTS) {
            actor.attemptsTo(
                    Move.left(START_POINT_DOWN)
            );
            intento++;
        }
        Properties.defaultImplicitWait();
    }
}