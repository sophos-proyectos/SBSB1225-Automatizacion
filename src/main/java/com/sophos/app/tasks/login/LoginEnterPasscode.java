package com.sophos.app.tasks.login;

import static com.sophos.app.enums.TittlePages.CONFIRM_PASSCODE;
import static com.sophos.app.enums.TittlePages.CREATE_PASSCODE;
import static com.sophos.app.ui.LoginPage.LOGIN_PASSCODE_TITTLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LoginEnterPasscode implements Task {
    private final String code;

    public LoginEnterPasscode(String code) {
        this.code = code;
    }

    public static LoginEnterPasscode loginPasscode(String passcode) {
        return instrumented(LoginEnterPasscode.class, passcode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(LOGIN_PASSCODE_TITTLE.of(CREATE_PASSCODE.message())).text().isEqualTo(CREATE_PASSCODE.message()),
                EnterOtp.withCode(code),
                Ensure.that(LOGIN_PASSCODE_TITTLE.of(CONFIRM_PASSCODE.message())).text().isEqualTo(CONFIRM_PASSCODE.message()),
                EnterOtp.withCode(code)
        );
    }
}