package com.sophos.app.ui;

import static co.com.devco.automation.mobile.locator.ElementFinder.dynamicElement;
import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;

import net.serenitybdd.screenplay.targets.Target;

import co.com.devco.automation.mobile.locator.Locator;

public final class LoginPage {

    // Start Page
    private static final Locator LOGIN_USERNAME_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/authenticationJourney_usernameScreen_usernameField")
            .withIosXpathStatic("");
    private static final Locator LOGIN_PASSWORD_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/authenticationJourney_usernameScreen_passwordField")
            .withIosXpathStatic("");
    private static final Locator LOGIN_BUTTON_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/authenticationJourney_usernameScreen_loginButton")
            .withIosXpathStatic("");


    // Passcode and confirm Passcode Page
    private static final Locator LOGIN_PASSCODE_LOCATOR = Locator.locator()
            .withAndroidXpathDynamic("//*[@text='{0}']")
            .withIosXpathStatic("");
    private static final Locator PASSCODE_BUTTON_LOCATOR = Locator.locator()
            .withAndroidXpathDynamic("//*[@text='{0}']")
            .withIosXpathStatic("");
   private static final Locator MY_ACCOUNT_TITTLE_LOCATOR = Locator.locator()
            .withAndroidXpathDynamic("//android.widget.FrameLayout[@content-desc='{0}']")
            .withIosXpathStatic("");


    // Start Page
    public static final Target LOGIN_USERNAME = Target.the("Ingresar usuario").located(theElementBy(LOGIN_USERNAME_LOCATOR));
    public static final Target LOGIN_PASSWORD = Target.the("Ingresar clave").located(theElementBy(LOGIN_PASSWORD_LOCATOR));
    public static final Target LOGIN_BUTTON = Target.the("Boton Log in").located(theElementBy(LOGIN_BUTTON_LOCATOR));


    // Passcode and confirm Passcode Page
    public static final Target LOGIN_PASSCODE_TITTLE = Target.the("Mensaje Pantalla Create/Confirm Passcode").locatedBy(dynamicElement(LOGIN_PASSCODE_LOCATOR));
    public static final Target PASSCODE_BUTTON = Target.the("Botón número X").locatedBy(dynamicElement(PASSCODE_BUTTON_LOCATOR));
    public static final Target MY_ACCOUNT_TITTLE = Target.the("Mensaje My accounts").locatedBy(dynamicElement(MY_ACCOUNT_TITTLE_LOCATOR));
}
