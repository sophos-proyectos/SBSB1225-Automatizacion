package com.bineo.app.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bineo.app.models.UserModel;
import com.bineo.app.ui.LoginPage;

public class Login implements Task {
    private final UserModel userModel;

    public Login(UserModel userModel) {
        this.userModel = userModel;

    }

    public static Login withData(UserModel userModel) {
        return instrumented(Login.class, userModel);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(LoginPage.EMAIL_TEXT_FIELD).silently().isDisplayed(),
                Enter.theValue(userModel.getEmail()).into(LoginPage.EMAIL_TEXT_FIELD),
                Enter.theValue(userModel.getPassword()).into(LoginPage.PASSWORD_TEXT_FIELD),
                Click.on(LoginPage.BTN_START_SESSION)

        );
    }
}
