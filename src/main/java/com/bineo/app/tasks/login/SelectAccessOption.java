package com.bineo.app.tasks.login;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.bineo.app.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import co.com.devco.automation.mobile.actions.WaitFor;


public class SelectAccessOption implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.TYPE_SELECTOR_ID, isVisible()),
                Click.on(LoginPage.TYPE_SELECTOR_ID));
    }

    public static SelectAccessOption selectAccessOption() {
        return Tasks.instrumented(SelectAccessOption.class);
    }
}