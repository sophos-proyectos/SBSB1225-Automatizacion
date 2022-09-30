package com.sophos.app.ui;

import static co.com.devco.automation.mobile.locator.ElementFinder.dynamicElement;
import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;

import net.serenitybdd.screenplay.targets.Target;

import co.com.devco.automation.mobile.locator.Locator;

public class PocketPage {

    private static final Locator POCKET_LOCATOR = Locator.locator()
            .withAndroidXpathDynamic("//android.widget.FrameLayout[@content-desc=\"Pockets\"]/android.widget.FrameLayout/android.widget.ImageView")
            .withIosXpathStatic("");

    private static final Locator BUTTON_CONTINUE_1_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/pocketsJourney_tutorialScreen_nextAction")
            .withIosXpathStatic("");

    private static final Locator ADD_POCKET_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/icon")
            .withIosXpathStatic("");
    private static final Locator NAME_POCKET_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/pocketsJourney_createPocketImageAndNameScreen_textNameInput")
            .withIosXpathStatic("");
    private static final Locator BUTTON_CONTINUE_2_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/pocketsJourney_createPocketImageAndNameScreen_nextAction")
            .withIosXpathStatic("");
    private static final Locator GOAL_AMOUNT_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/pocketsJourney_createPocketGoalScreen_amountNumberInput")
            .withIosXpathStatic("");
    private static final Locator BUTTON_CONTINUE_3_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/pocketsJourney_createPocketGoalScreen_nextAction")
            .withIosXpathStatic("");
    private static final Locator BUTTON_CONFIRM_POCKET_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/pocketsJourney_pocketCreationReviewScreen_confirmAction")
            .withIosXpathStatic("");
    private static final Locator BUTTON_VIEW_POCKET_LOCATOR = Locator.locator()
            .withAndroidId("com.example.banking.debug:id/pocketsJourney_successScreen_button")
            .withIosXpathStatic("");

    public static final Target POCKET = Target.the("Boton Pocket").locatedBy(dynamicElement(POCKET_LOCATOR));
    public static final Target BUTTON_CONTINUE_1 = Target.the("Boton Continue 1").located(theElementBy(BUTTON_CONTINUE_1_LOCATOR));
    public static final Target ADD_POCKET = Target.the("Boton Add Pocket").located(theElementBy(ADD_POCKET_LOCATOR));
    public static final Target NAME_POCKET = Target.the("Nombre Pocket").located(theElementBy(NAME_POCKET_LOCATOR));
    public static final Target BUTTON_CONTINUE_2 = Target.the("Boton Continue 2").located(theElementBy(BUTTON_CONTINUE_2_LOCATOR));
    public static final Target GOAL_AMOUNT = Target.the("Goal Amount").located(theElementBy(GOAL_AMOUNT_LOCATOR));
    public static final Target BUTTON_CONTINUE_3 = Target.the("Boton Continue 3").located(theElementBy(BUTTON_CONTINUE_3_LOCATOR));
    public static final Target BUTTON_CONFIRM_POCKET = Target.the("Boton Confirm Pocket").located(theElementBy(BUTTON_CONFIRM_POCKET_LOCATOR));
    public static final Target BUTTON_VIEW_POCKET = Target.the("Boton View Pocket").located(theElementBy(BUTTON_VIEW_POCKET_LOCATOR));

}
