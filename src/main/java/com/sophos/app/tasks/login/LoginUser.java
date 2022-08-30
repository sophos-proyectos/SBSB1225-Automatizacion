package com.sophos.app.tasks.login;

import com.sophos.app.models.UserModel;
import com.sophos.app.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import cucumber.api.DataTable;

public class LoginUser implements Task {

    List<UserModel> userModelList;

    public LoginUser(DataTable userLogin) {
        userModelList = userLogin.asList(UserModel.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userModelList.get(0).getUsername()).into(LoginPage.LOGIN_USERNAME),
                Enter.theValue(userModelList.get(0).getPassword()).into(LoginPage.LOGIN_PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    public static LoginUser loginUser (DataTable user){
        return Tasks.instrumented(LoginUser.class,user);
    }
}
