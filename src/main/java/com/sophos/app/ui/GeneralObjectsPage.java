package com.sophos.app.ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;


public class GeneralObjectsPage {

    public static final Target ALLOW_LOCATION_PERMISSIONS_IOS = Target.the("button allow location permissions").located(By.id("Allow While Using App"));

    private GeneralObjectsPage() {
    }
}