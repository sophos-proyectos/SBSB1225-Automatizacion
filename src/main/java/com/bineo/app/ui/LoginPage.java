package com.bineo.app.ui;

import co.com.devco.automation.mobile.locator.Locator;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.dynamicElement;
import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public final class LoginPage {

    private static final Locator TYPE_SELECTOR_ID_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.Button[contains(@text,'Ya soy usuario')]")
            .withIosXpathStatic("//XCUIElementTypeStaticText[@name=\"Ya soy usuario\"]");
    private static final Locator EMAIL_TEXT_FIELD_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.EditText[contains(@text,'Usuario')]")
            .withIosXpathStatic("//XCUIElementTypeTextField[@name=\"register.usernameInput.textInput.textField\"]");
    private static final Locator PASSWORD_TEXT_FIELD_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.EditText[contains(@text,'Contraseña')]")
            .withIosXpathStatic("//XCUIElementTypeSecureTextField[@name=\"register.passwordInput.textInput.textField\"]");

    private static final Locator BTN_START_SESSION_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.Button[contains(@text,'Iniciar sesión')]")
            .withIosXpathStatic("//XCUIElementTypeButton[@name=\"register.loginButton\"]");

    private static final Locator BTN_ENVIAR_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.Button[contains(@text,'Enviar')]")
            .withIosXpathStatic("//XCUIElementTypeButton[@name=\"otpInput.submitButton\"]");

    private static final Locator LOGIN_OTP_TITTLE_AND_MESSAGE_LOCATOR = locator()
            .withAndroidXpathDynamic("//*[@text='{0}']")
            .withIosXpathDynamic("//XCUIElementTypeStaticText[@value='{0}']");

    private static final Locator LOGIN_PASSCODE_TITTLE_AND_MESSAGE_LOCATOR = locator()
            .withAndroidXpathDynamic("//*[@text='{0}']")
            .withIosXpathDynamic("//XCUIElementTypeStaticText[@value='{0}']");


    private static final Locator OTP_TEXT_FIELD_LOCATOR = locator()
            .withAndroidXpathStatic("")
            .withIosId("");

    public static final Target TYPE_SELECTOR_ID = Target.the("select as login").located(theElementBy(TYPE_SELECTOR_ID_LOCATOR));
    public static final Target EMAIL_TEXT_FIELD = Target.the("name text field").located(theElementBy(EMAIL_TEXT_FIELD_LOCATOR));
    public static final Target PASSWORD_TEXT_FIELD = Target.the("name text field").located(theElementBy(PASSWORD_TEXT_FIELD_LOCATOR));
    public static final Target OTP_TEXT_FIELD = Target.the("name text field").located(theElementBy(PASSWORD_TEXT_FIELD_LOCATOR));
    public static final Target BTN_START_SESSION = Target.the("name text field").located(theElementBy(BTN_START_SESSION_LOCATOR));
    public static final Target BTN_ENVIAR = Target.the("name text field").located(theElementBy(BTN_ENVIAR_LOCATOR));
    public static final Target LOGIN_OTP_TITTLE_PAGE = Target.the("page tittle").locatedBy(dynamicElement(LOGIN_OTP_TITTLE_AND_MESSAGE_LOCATOR));
    public static final Target LOGIN_PASSCODE_TITTLE_PAGE = Target.the("page tittle").locatedBy(dynamicElement(LOGIN_PASSCODE_TITTLE_AND_MESSAGE_LOCATOR));

    private LoginPage() {
    }
}