package com.bineo.app.tasks.login;


import com.bineo.app.models.UserLoginModel;
import com.bineo.app.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import cucumber.api.DataTable;


public class LoginDatatable implements Task {

    List<UserLoginModel> userLoginList;

    public LoginDatatable(DataTable userLogin) {
        userLoginList = userLogin.asList(UserLoginModel.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(LoginPage.EMAIL_TEXT_FIELD).silently().isDisplayed(),
                Enter.theValue(userLoginList.get(0).getEmail()).into(LoginPage.EMAIL_TEXT_FIELD),
                Enter.theValue(userLoginList.get(0).getPassword()).into(LoginPage.PASSWORD_TEXT_FIELD),
                Click.on(LoginPage.BTN_START_SESSION)

        );
    }
    public static LoginDatatable loginDatatable(DataTable user) {
        return Tasks.instrumented(LoginDatatable.class, user);
    }
}
