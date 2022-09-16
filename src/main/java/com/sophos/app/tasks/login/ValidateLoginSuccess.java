package com.sophos.app.tasks.login;

import static com.sophos.app.enums.TittlePages.MY_ACCOUNTS;
import static com.sophos.app.ui.LoginPage.MY_ACCOUNT_TITTLE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ValidateLoginSuccess implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(MY_ACCOUNT_TITTLE.of(MY_ACCOUNTS.message())).isDisplayed()
        );
    }

    public static ValidateLoginSuccess validateLoginPasscode() {
        return Tasks.instrumented(ValidateLoginSuccess.class);
    }
}