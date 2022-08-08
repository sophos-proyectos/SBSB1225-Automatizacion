package com.bineo.app.utilities;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateListText {

    private ValidateListText() {
    }

    public static Boolean target(Target target, String textWait) {
        boolean filterCorrect = true;
        for (int i = 0; i < target.resolveAllFor(OnStage.theActorInTheSpotlight()).size(); i++) {
            if (filterCorrect) {
                filterCorrect = target.resolveAllFor(OnStage.theActorInTheSpotlight()).get(i).getText().contains(textWait);
            } else {
                break;
            }
        }
        return filterCorrect;
    }
}