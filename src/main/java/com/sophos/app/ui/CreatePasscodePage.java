package com.sophos.app.ui;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;

import net.serenitybdd.screenplay.targets.Target;

import co.com.devco.automation.mobile.locator.Locator;

public final class CreatePasscodePage {

    private static final Locator LOGIN_CREATE_PASSCODE_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/authenticationJourney_passcodeScreen_titleView")
            .withIosXpathStatic("");

    public static final Target LOGIN_CREATE_PASSCODE = Target.the("Pantalla Create Passcode").located(theElementBy(LOGIN_CREATE_PASSCODE_LOCATOR));

}
