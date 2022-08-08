package com.bineo.app.stepsdefinitions;

import static com.bineo.app.enums.TittlePages.OTP_LOGIN_PAGE;
import static com.bineo.app.ui.LoginPage.LOGIN_OTP_TITTLE_PAGE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.bineo.app.factories.UserFactory;
import com.bineo.app.models.UserModel;
import com.bineo.app.tasks.AddPermissionsOfUbication;
import com.bineo.app.tasks.login.Login;
import com.bineo.app.tasks.login.LoginDatatable;
import com.bineo.app.tasks.login.SelectAccessOption;

import net.serenitybdd.screenplay.ensure.Ensure;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.E;
import cucumber.api.java.es.Entonces;
import cucumber.api.DataTable;

public class LoginSteps {
    private UserModel userModel;

    @Dado("^(.*) desea ingresar a la aplicacion$")
    public void deseaIngresarALaAplicacion(String name) {
        theActorCalled(name).wasAbleTo(
                AddPermissionsOfUbication.inIos(),
                SelectAccessOption.selectAccessOption()
        );
    }
    @E("^ingreso con la siguiente informacion$")
    public void ingresoConLaSigueienteInformacion(DataTable table) {
        theActorInTheSpotlight().attemptsTo(LoginDatatable.loginDatatable(table));
    }

    @E("^ingresa con el correo (.*)$")
    public void ingresaElCorreoYLaContraseña(String code) {
        userModel = UserFactory.with(code);
        theActorInTheSpotlight().attemptsTo(Login.withData(userModel)
        );
    }

    @Entonces("^valido que el ingreso exitoso$")
    public void validoQueElIngresoExitoso() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LOGIN_OTP_TITTLE_PAGE.of(OTP_LOGIN_PAGE.message())).isDisplayed()
        );
    }
}