package com.sophos.app.tasks.pocket;

import com.sophos.app.models.PocketModel;
import com.sophos.app.models.UserModel;
import com.sophos.app.tasks.login.LoginUser;
import com.sophos.app.ui.LoginPage;
import com.sophos.app.ui.PocketPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.ClearElement;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import cucumber.api.DataTable;

public class CreatePocket implements Task {

    List<PocketModel> pocketModelList;

    public CreatePocket(DataTable pocket) {
        pocketModelList = pocket.asList(PocketModel.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PocketPage.POCKET),
                Click.on(PocketPage.BUTTON_CONTINUE_1),
                Click.on(PocketPage.ADD_POCKET),
                Clear.field(PocketPage.NAME_POCKET),
                Enter.theValue(pocketModelList.get(0).getName()).into(PocketPage.NAME_POCKET),
                Click.on(PocketPage.BUTTON_CONTINUE_2),
                Enter.theValue(pocketModelList.get(0).getAmount()).into(PocketPage.GOAL_AMOUNT),
                Click.on(PocketPage.BUTTON_CONTINUE_3),
                Click.on(PocketPage.BUTTON_CONFIRM_POCKET),
                Click.on(PocketPage.BUTTON_VIEW_POCKET)
        );
    }

    public static CreatePocket createPocket (DataTable pocket) {
        return Tasks.instrumented(CreatePocket.class,pocket);
    }
}
