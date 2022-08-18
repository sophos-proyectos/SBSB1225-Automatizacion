package com.sophos.app.tasks.login.ios;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophos.app.ui.ios.KeyboardNumberPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OtpIos implements Task {

    private final String codeOtp;

    public OtpIos(String codeOtp) {
        this.codeOtp = codeOtp;
    }

    public static OtpIos withCode(String codeOtp) {
        return instrumented(OtpIos.class, codeOtp);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        char[] numbers = codeOtp.toCharArray();
        for (Character number : numbers) {
            switch (number.toString()) {
                case "1":
                    actor.attemptsTo(
                            Click.on(KeyboardNumberPage.OPTION_NUMBER_ONE)
                    );
                    break;
                case "2":
                    actor.attemptsTo(
                            Click.on(KeyboardNumberPage.OPTION_NUMBER_TWO)
                    );
                    break;
                case "3":
                    actor.attemptsTo(
                            Click.on(KeyboardNumberPage.OPTION_NUMBER_THREE)
                    );
                    break;
                case "4":
                    actor.attemptsTo(
                            Click.on(KeyboardNumberPage.OPTION_NUMBER_FOUR)
                    );
                    break;
                case "5":
                    actor.attemptsTo(
                            Click.on(KeyboardNumberPage.OPTION_NUMBER_FIVE)
                    );
                    break;
                case "6":
                    actor.attemptsTo(
                            Click.on(KeyboardNumberPage.OPTION_NUMBER_SIX)
                    );
                    break;
                default:
                    break;
            }
        }
    }
}