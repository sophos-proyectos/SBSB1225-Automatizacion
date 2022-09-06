package com.sophos.app.ui;

import static co.com.devco.automation.mobile.locator.ElementFinder.dynamicElement;
import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;

import net.serenitybdd.screenplay.targets.Target;

import co.com.devco.automation.mobile.locator.Locator;

public final class CreatePasscodePage {

    private static final Locator LOGIN_CREATE_PASSCODE_LOCATOR = Locator.locator()
            .withAndroidXpathDynamic("//*[@text='{0}']")
            .withIosXpathStatic("");

    public static final Target LOGIN_CREATE_PASSCODE = Target.the("Mensaje Pantalla Create Passcode").locatedBy(dynamicElement(LOGIN_CREATE_PASSCODE_LOCATOR));

}
