package com.sophos.app.stepsdefinitions;

import com.sophos.app.utilities.Properties;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;


import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class SetTheStage {

    @Managed(driver = "Appium")
    public static WebDriver thePhone;
    private static boolean beforeAll = true;
    public static EnvironmentVariables environmentVariables;

    @Before(order = 1)
    public void setUp() {
        if (beforeAll) {
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    thePhone.quit();
                    thePhone = null;
                }
            });
            beforeAll = false;
        }
        Properties.serenity(environmentVariables);
    }

    @Before(order = 2)
    public void prepareStage() {
        OnStage.setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(getProxiedDriver())));
    }

    @After
    public void logOut() {
        try {
            WebDriver facade = getProxiedDriver();
            ((AppiumDriver) facade).closeApp();
            ((AppiumDriver) facade).launchApp();
            System.out.print("Lance la app neuvamente");
        } catch (Exception ex) {
            Logger.getAnonymousLogger().log(Level.WARNING, "Could not close driver. AppiumDriver not found", ex);
        }
    }
}