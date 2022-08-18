package com.sophos.app.interactions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Dimension;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Move implements Interaction {

    private final double start;
    private final double end;
    private final int point;

    public Move(double start, double end, int point) {
        this.start = start;
        this.end = end;
        this.point = point;
    }


    public static Move right(int point) {
        return instrumented(Move.class, 0.1, 0.9, point);
    }

    public static Move left(int point) {
        return instrumented(Move.class, 0.9, 0.1, point);
    }


    @Override
    public <T extends Actor> void performAs(T t) {
        Dimension size = getProxiedDriver().manage().window().getSize();
        int height = (size.getHeight() * point) / 100;
        int startPoint = (int) (size.getWidth() * start);
        int endPoint = (int) (size.getWidth() * end);
        new TouchAction<>(getProxiedDriver())
                .press(PointOption.point(startPoint, height))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endPoint, height))
                .release().perform();
    }
}