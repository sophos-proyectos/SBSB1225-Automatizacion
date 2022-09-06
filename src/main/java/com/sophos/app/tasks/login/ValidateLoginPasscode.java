package com.sophos.app.tasks.login;

import static com.sophos.app.enums.TittlePages.CREATE_PASSCODE;

import com.sophos.app.ui.CreatePasscodePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;

import cucumber.api.DataTable;

public class ValidateLoginPasscode implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(CreatePasscodePage.LOGIN_CREATE_PASSCODE.of(CREATE_PASSCODE.message())).text().isEqualTo(CREATE_PASSCODE.message())
        );
    }

    public static ValidateLoginPasscode validateLoginPasscode (){
        return Tasks.instrumented(ValidateLoginPasscode.class);
    }
}