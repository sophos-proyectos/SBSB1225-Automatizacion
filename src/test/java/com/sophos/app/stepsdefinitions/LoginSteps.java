package com.sophos.app.stepsdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophos.app.enums.TittlePages;
import com.sophos.app.questions.ValueLogin;
import com.sophos.app.tasks.AddPermissionsOfUbication;
import com.sophos.app.tasks.login.LoginUser;
import com.sophos.app.ui.LoginPage;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.ensure.Ensure;

import cucumber.api.DataTable;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.E;
import cucumber.api.java.es.Entonces;

public class LoginSteps {

    @Dado("^(.*) desea ingresar a la aplicacion$")
    public void usuarioDeseaIngresarALaAplicacion(String name){
        theActorCalled(name).wasAbleTo(
                AddPermissionsOfUbication.inIos()
        );
    }

    @E("^ingresa un usuario y una contraseña$")
    public void ingresaUnUsuarioYUnaContraseña(DataTable usuario){
        theActorInTheSpotlight().attemptsTo(LoginUser.loginUser(usuario));
    }

    @Entonces("^valido que el ingreso sea exitoso$")
    public void validoQueElIngresoSeaExitoso(){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValueLogin.verify()));
    }
}