package com.sophos.app.ui;

import static co.com.devco.automation.mobile.locator.ElementFinder.dynamicElement;
import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;

import net.serenitybdd.screenplay.targets.Target;

import co.com.devco.automation.mobile.locator.Locator;

public final class LoginPage {
    private static final Locator LOGIN_USERNAME_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/authenticationJourney_usernameScreen_usernameField")
            .withIosXpathStatic("");
    private static final Locator LOGIN_PASSWORD_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/authenticationJourney_usernameScreen_passwordField")
            .withIosXpathStatic("");
    private static final Locator LOGIN_BUTTON_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/authenticationJourney_usernameScreen_loginButton")
            .withIosXpathStatic("");
    private static final Locator LOGIN_FORGOT_USERNAME_LOCATOR = Locator.locator()
            .withAndroidXpathDynamic("//*[@text='{0}']")
            .withIosXpathStatic("");
    public static final Target LOGIN_USERNAME = Target.the("Ingresar usuario").located(theElementBy(LOGIN_USERNAME_LOCATOR));
    public static final Target LOGIN_PASSWORD = Target.the("Ingresar clave").located(theElementBy(LOGIN_PASSWORD_LOCATOR));
    public static final Target LOGIN_BUTTON = Target.the("Boton Log in").located(theElementBy(LOGIN_BUTTON_LOCATOR));
    public static final Target LOGIN_FORGOT_USERNAME = Target.the("Pantalla Forgot Username").locatedBy(dynamicElement(LOGIN_FORGOT_USERNAME_LOCATOR));
}
