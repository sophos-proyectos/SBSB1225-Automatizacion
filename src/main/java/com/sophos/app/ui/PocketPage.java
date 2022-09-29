package com.sophos.app.ui;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;

import net.serenitybdd.screenplay.targets.Target;

import co.com.devco.automation.mobile.locator.Locator;

public class PocketPage {

    private static final Locator POCKET_LOCATOR = Locator.locator()
            .withAndroidId("Pendiente")
            .withIosXpathStatic("");

    private static final Locator ADD_POCKET_LOCATOR = Locator.locator()
            .withAndroidId("Pendiente")
            .withIosXpathStatic("");
    private static final Locator SELECT_TYPE_POCKET_LOCATOR = Locator.locator()
            .withAndroidId("Pendiente")
            .withIosXpathStatic("");
    private static final Locator NAME_POCKET_LOCATOR = Locator.locator()
            .withAndroidId("Pendiente")
            .withIosXpathStatic("");
    private static final Locator BUTTON_CONTINUE_1_LOCATOR = Locator.locator()
            .withAndroidId("Pendiente")
            .withIosXpathStatic("");
    private static final Locator GOAL_AMOUNT_LOCATOR = Locator.locator()
            .withAndroidId("Pendiente")
            .withIosXpathStatic("");
    private static final Locator BUTTON_CONTINUE_2_LOCATOR = Locator.locator()
            .withAndroidId("Pendiente")
            .withIosXpathStatic("");

    private static final Locator BUTTON_CONFIRM_POCKET_LOCATOR = Locator.locator()
            .withAndroidId("Pendiente")
            .withIosXpathStatic("");

    private static final Locator BUTTON_VIEW_POCKET_LOCATOR = Locator.locator()
            .withAndroidId("Pendiente")
            .withIosXpathStatic("");

    public static final Target POCKET = Target.the("Boton Pocket").located(theElementBy(POCKET_LOCATOR));
    public static final Target ADD_POCKET = Target.the("Boton Add Pocket").located(theElementBy(ADD_POCKET_LOCATOR));
    public static final Target SELECT_TYPE_POCKET = Target.the("Seleccionar tipo de Pocket").located(theElementBy(SELECT_TYPE_POCKET_LOCATOR));
    public static final Target NAME_POCKET = Target.the("Nombre Pocket").located(theElementBy(NAME_POCKET_LOCATOR));
    public static final Target BUTTON_CONTINUE_1 = Target.the("Boton Continue 1").located(theElementBy(BUTTON_CONTINUE_1_LOCATOR));
    public static final Target GOAL_AMOUNT = Target.the("Goal Amount").located(theElementBy(GOAL_AMOUNT_LOCATOR));
    public static final Target BUTTON_CONTINUE_2 = Target.the("Boton Continue 2").located(theElementBy(BUTTON_CONTINUE_2_LOCATOR));
    public static final Target BUTTON_CONFIRM_POCKET = Target.the("Boton Confirm Pocket").located(theElementBy(BUTTON_CONFIRM_POCKET_LOCATOR));
    public static final Target BUTTON_VIEW_POCKET = Target.the("Boton View Pocket").located(theElementBy(BUTTON_VIEW_POCKET_LOCATOR));

}
