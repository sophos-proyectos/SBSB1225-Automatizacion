package com.sophos.app.tasks.login;

import static com.sophos.app.enums.TittlePages.CONFIRM_PASSCODE;
import static com.sophos.app.enums.TittlePages.CREATE_PASSCODE;
import static com.sophos.app.ui.LoginPage.LOGIN_PASSCODE_TITTLE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ValidateLoginEnterConfirmPasscode implements Task {

    private String passCode;

    public ValidateLoginEnterConfirmPasscode(String passCode) {
        this.passCode = passCode;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (passCode.equals("ingresar")) {
            actor.attemptsTo(
                    Ensure.that(LOGIN_PASSCODE_TITTLE.of(CREATE_PASSCODE.message())).text().isEqualTo(CREATE_PASSCODE.message())
            );
        } else {
            actor.attemptsTo(
                    Ensure.that(LOGIN_PASSCODE_TITTLE.of(CONFIRM_PASSCODE.message())).text().isEqualTo(CONFIRM_PASSCODE.message())
            );
        }
    }

    public static ValidateLoginEnterConfirmPasscode validateLoginEnterConfirmPasscode(String passCode) {
        return Tasks.instrumented(ValidateLoginEnterConfirmPasscode.class, passCode);
    }
}