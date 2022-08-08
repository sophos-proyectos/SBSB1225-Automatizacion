package com.bineo.app.ui;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class StartPage {

    private StartPage() {
    }

    private static final Locator BTN_LOGIN_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.Button[contains(@text,'Iniciar sesión')]")
            .withIosId("PDTE1");
    private static final Locator BTN_REGISTER_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.Button[contains(@text,'Registrarse')]")
            .withIosId("PDTE2");

    public static final Target BTN_LOGIN = Target.the("login button").located(theElementBy(BTN_LOGIN_LOCATOR));
    public static final Target BTN_REGISTER = Target.the("register button").located(theElementBy(BTN_REGISTER_LOCATOR));

}
