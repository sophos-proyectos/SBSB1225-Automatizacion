package com.sophos.app.questions;

import com.sophos.app.enums.TittlePages;
import com.sophos.app.ui.CreatePasscodePage;
import com.sophos.app.ui.LoginPage;
import com.sophos.app.utilities.Constants;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValueLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Constants.CREATE_PASSCODE.equals(Text.of(CreatePasscodePage.LOGIN_CREATE_PASSCODE).viewedBy(actor).asString());
    }

    public static ValueLogin verify(){
        return new ValueLogin();
    }
}
