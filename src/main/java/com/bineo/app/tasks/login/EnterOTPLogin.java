package com.bineo.app.tasks.login;


import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bineo.app.models.UserModel;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class EnterOTPLogin implements Task {
    private final UserModel userModel;

    public EnterOTPLogin(UserModel userModel) {
        this.userModel = userModel;
    }

    public static EnterOTPLogin withUser(UserModel userModel) {
        return instrumented(EnterOTPLogin.class, userModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterOtp.withCode(userModel.getOtp())
        );
    }
}