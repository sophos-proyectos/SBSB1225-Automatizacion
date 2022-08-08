package com.bineo.app.tasks;

import static com.bineo.app.ui.GeneralObjectsPage.ALLOW_LOCATION_PERMISSIONS_IOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bineo.app.utilities.Properties;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

public class AddPermissionsOfUbication implements Task {

    public static AddPermissionsOfUbication inIos() {
        return instrumented(AddPermissionsOfUbication.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (Boolean.FALSE.equals(Properties.getPlatformName().equalsIgnoreCase(com.bineo.app.enums.Properties.PLATFORM_NAME.value()))
                && Boolean.TRUE.equals(Visibility.of(ALLOW_LOCATION_PERMISSIONS_IOS).viewedBy(actor).asBoolean())) {
            actor.attemptsTo(
                    Click.on(ALLOW_LOCATION_PERMISSIONS_IOS)
            );
        }
    }
}
