package com.sophos.app.tasks.login;

import static com.sophos.app.ui.LoginPage.PASSCODE_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Passcode implements Task {

    private final String codeOtp;

    public Passcode(String codeOtp) {
        this.codeOtp = codeOtp;
    }

    public static Passcode withCode(String codeOtp) {
        return instrumented(Passcode.class, codeOtp);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        char[] numbers = codeOtp.toCharArray();
        for (char number : numbers) {
            actor.attemptsTo(
                    Click.on(PASSCODE_BUTTON.of(String.valueOf(number)))
            );
        }
    }
}