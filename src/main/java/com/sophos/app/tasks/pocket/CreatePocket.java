package com.sophos.app.tasks.pocket;

import com.sophos.app.models.PocketModel;
import com.sophos.app.models.UserModel;
import com.sophos.app.tasks.login.LoginUser;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

import cucumber.api.DataTable;

public class CreatePocket implements Task {

    List<PocketModel> pocketModelList;

    public CreatePocket(DataTable pocket) {
        pocketModelList = pocket.asList(PocketModel.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static CreatePocket createPocket (DataTable pocket) {
        return Tasks.instrumented(CreatePocket.class,pocket);
    }
}
