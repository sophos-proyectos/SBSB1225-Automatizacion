package com.bineo.app.utilities;


import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Properties {


    private static String platformName;
    private static String implicitlywait;

    private Properties() {
    }

    public static void serenity(EnvironmentVariables environmentVariables) {
        platformName = environmentVariables.getProperty("appium.platformName");
        implicitlywait = environmentVariables.getProperty("webdriver.timeouts.implicitlywait");
    }

    public static String getPlatformName() {
        return platformName;
    }


    public static void modifyImplicitWait() {
        WebDriver driver = getProxiedDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void defaultImplicitWait() {
        WebDriver driver = getProxiedDriver();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(implicitlywait), TimeUnit.MILLISECONDS);
    }
}
