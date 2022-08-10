package com.bineo.app.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.bineo.app.models.UserModel;
import com.bineo.app.ui.LoginPage;

public class EnterDataLogin implements Task {
    private final UserModel userModel;

    public EnterDataLogin(UserModel userModel) {
        this.userModel = userModel;

    }

    public static EnterDataLogin withData(UserModel userModel) {
        return instrumented(EnterDataLogin.class, userModel);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.EMAIL_TEXT_FIELD, isVisible()),
                Ensure.that(LoginPage.EMAIL_TEXT_FIELD).silently().isDisplayed(),
                Enter.theValue(userModel.getEmail()).into(LoginPage.EMAIL_TEXT_FIELD),
                Enter.theValue(userModel.getPassword()).into(LoginPage.PASSWORD_TEXT_FIELD),
                Click.on(LoginPage.BTN_START_SESSION)

        );
    }
}
