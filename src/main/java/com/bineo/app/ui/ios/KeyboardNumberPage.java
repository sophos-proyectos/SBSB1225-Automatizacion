package com.bineo.app.ui.ios;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class KeyboardNumberPage {

    public static final Target OPTION_NUMBER_ONE = Target.the("number one").located(By.id("1"));
    public static final Target OPTION_NUMBER_TWO = Target.the("number two").located(By.id("2"));
    public static final Target OPTION_NUMBER_THREE = Target.the("number three").located(By.id("3"));
    public static final Target OPTION_NUMBER_FOUR = Target.the("number four").located(By.id("4"));
    public static final Target OPTION_NUMBER_FIVE = Target.the("number five").located(By.id("5"));
    public static final Target OPTION_NUMBER_SIX = Target.the("number six").located(By.id("6"));

    private KeyboardNumberPage() {
    }
}
