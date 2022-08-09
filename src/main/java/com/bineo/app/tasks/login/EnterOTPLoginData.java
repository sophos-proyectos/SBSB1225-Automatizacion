package com.bineo.app.tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

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
                EnterOtp.withCode(otp)
        );
    }
}