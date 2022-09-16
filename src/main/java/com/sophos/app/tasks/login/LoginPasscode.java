package com.sophos.app.tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class LoginPasscode implements Task {
    private final String code;

    public LoginPasscode(String code) {
        this.code = code;
    }

    public static LoginPasscode loginPasscode(String passcode) {
        return instrumented(LoginPasscode.class, passcode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterOtp.withCode(code)
        );
    }
}