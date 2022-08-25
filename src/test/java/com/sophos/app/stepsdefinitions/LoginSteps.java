package com.sophos.app.stepsdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophos.app.tasks.AddPermissionsOfUbication;
import com.sophos.app.tasks.login.LoginUser;

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
        System.out.print("Punto de revisión");
    }

    @Entonces("^valido que el ingreso sea exitoso$")
    public void validoQueElIngresoSeaExitoso(){
    }

}
