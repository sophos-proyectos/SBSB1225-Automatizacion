package com.sophos.app.tasks.login;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.app.tasks.login.ios.OtpIos;
import com.sophos.app.utilities.Properties;
import com.sophos.app.ui.GeneralObjectsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

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
        if (Properties.getPlatformName().equalsIgnoreCase(com.sophos.app.enums.Properties.PLATFORM_NAME.value())) {
            actor.attemptsTo(
                    Passcode.withCode(codeOtp)
            );
        } else {
            actor.attemptsTo(
                    OtpIos.withCode(codeOtp)
            );
            if (Boolean.TRUE.equals(Visibility.of(GeneralObjectsPage.ALLOW_LOCATION_PERMISSIONS_IOS).viewedBy(actor).asBoolean())) {
                actor.attemptsTo(
                        Click.on(GeneralObjectsPage.ALLOW_LOCATION_PERMISSIONS_IOS)
                );
            }
        }
    }
}