package com.sophos.app.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class OnboardingToApp implements Task {
    private final Target target;

    public OnboardingToApp(Target target) {
        this.target = target;
    }

    public static OnboardingToApp withOption(Target target) {
        return Tasks.instrumented(OnboardingToApp.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AddPermissionsOfUbication.inIos(),
                Ensure.that(target.waitingForNoMoreThan(Duration.ofSeconds(40))).silently().isDisplayed(),
                Click.on(target)
        );
    }
}