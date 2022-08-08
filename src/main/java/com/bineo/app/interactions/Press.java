package com.bineo.app.interactions;

import com.bineo.app.utilities.Properties;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;
import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;


public class Press implements Interaction {
    private final Target targetEvaulated;
    private final List<Integer> coordenates;

    public Press(List<Integer> coordenates, Target targetEvaulated) {
        this.coordenates = coordenates;
        this.targetEvaulated = targetEvaulated;
    }

    public static Press inElementWithCoordenates(List<Integer> coordenates, Target targetEvaulated) {
        return Tasks.instrumented(Press.class, coordenates, targetEvaulated);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Properties.modifyImplicitWait();
        int attemps = 5;
        int intento = 1;
        while (Boolean.FALSE.equals((Visibility.of(targetEvaulated).viewedBy(actor).asBoolean())) && intento <= attemps) {
            new TouchAction<>(getProxiedDriver()).
                    tap(PointOption.point(coordenates.get(0), coordenates.get(1)))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .perform();
            intento++;
        }
        Properties.defaultImplicitWait();
    }
}
