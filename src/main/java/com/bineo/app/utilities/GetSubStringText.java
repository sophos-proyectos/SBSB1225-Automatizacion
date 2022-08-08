package com.bineo.app.utilities;

import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GetSubStringText {
    private static final String SPACE = " ";

    private GetSubStringText() {
    }

    public static String element(Target target, String split1, int positionToReturn) {
        String value = Text.of(target).viewedBy(theActorInTheSpotlight()).asString();
        String[] partirValor = value.split(split1);
        return partirValor[positionToReturn].trim();
    }

    public static String element(Target target, int positionToReturn, String... replaces) {
        String value = String.valueOf(Text.of(target));
        for (String valueReplace : replaces) {
            value = value.replace(valueReplace, SPACE);
        }
        String[] partirValor = value.split(SPACE);
        return partirValor[positionToReturn].trim();
    }

        public static String text(String text, String split1, int positionToReturn) {
        String chain = text.replace(split1, SPACE);
        String[] newText = chain.split(SPACE);
        return newText[positionToReturn].trim();
    }
}