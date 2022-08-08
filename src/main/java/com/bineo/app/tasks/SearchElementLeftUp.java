package com.bineo.app.tasks;

import com.bineo.app.interactions.Move;
import com.bineo.app.utilities.Properties;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchElementLeftUp implements Task {

    private final Target target;
    private static final int ATTEMPTS = 5;
    public static final int START_POINT_UP = 45;
    private int intento = 1;

    public SearchElementLeftUp(Target target) {
        this.target = target;
    }

    public static SearchElementLeftUp inScreen(Target target) {
        return instrumented(SearchElementLeftUp.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Properties.modifyImplicitWait();
        while (Boolean.FALSE.equals((Visibility.of(target).viewedBy(actor).asBoolean())) && intento <= ATTEMPTS) {
            actor.attemptsTo(
                    Move.left(START_POINT_UP)
            );
            intento++;
        }
        Properties.defaultImplicitWait();
    }
}