package com.bineo.app.tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bineo.app.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EnterOTPLoginData implements Task {
    private final String otp;

    public EnterOTPLoginData(String otp) {
        this.otp = otp;
    }

    public static EnterOTPLoginData withCode(String otp) {
        return instrumented(EnterOTPLoginData.class, otp);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterOtp.withCode(otp),
                Click.on(LoginPage.BTN_ENVIAR)
        );
    }
}