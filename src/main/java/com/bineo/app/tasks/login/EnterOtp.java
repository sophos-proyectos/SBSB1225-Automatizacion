package com.bineo.app.tasks.login;

import static com.bineo.app.ui.GeneralObjectsPage.ALLOW_LOCATION_PERMISSIONS_IOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import com.bineo.app.tasks.login.ios.OtpIos;
import com.bineo.app.utilities.Properties;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class EnterOtp implements Task {
    private final String codeOtp;

    public EnterOtp(String codeOtp) {
        this.codeOtp = codeOtp;
    }

    public static EnterOtp withCode(String codeOtp) {
        return instrumented(EnterOtp.class, codeOtp);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (Properties.getPlatformName().equalsIgnoreCase(com.bineo.app.enums.Properties.PLATFORM_NAME.value())) {
            AppiumDriver<MobileElement> driver = getProxiedDriver();
            driver.getKeyboard().pressKey(codeOtp);
        } else {
            actor.attemptsTo(
                    OtpIos.withCode(codeOtp)
            );
            if (Boolean.TRUE.equals(Visibility.of(ALLOW_LOCATION_PERMISSIONS_IOS).viewedBy(actor).asBoolean())) {
                actor.attemptsTo(
                        Click.on(ALLOW_LOCATION_PERMISSIONS_IOS)
                );
            }
        }
    }
}