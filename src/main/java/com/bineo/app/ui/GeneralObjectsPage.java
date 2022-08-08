package com.bineo.app.ui;

import static co.com.devco.automation.mobile.locator.ElementFinder.dynamicElement;
import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

import co.com.devco.automation.mobile.locator.Locator;

public class GeneralObjectsPage {

    public static final Target ALLOW_LOCATION_PERMISSIONS_IOS = Target.the("button allow location permissions").located(By.id("Allow While Using App"));

    private GeneralObjectsPage() {
    }
}
