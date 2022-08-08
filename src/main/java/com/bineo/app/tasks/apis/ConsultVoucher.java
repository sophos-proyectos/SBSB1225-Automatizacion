package com.bineo.app.tasks.apis;

import com.bineo.app.enums.Values;
import com.bineo.app.enums.apis.Apis;
import com.bineo.app.enums.apis.EndPoints;
import com.bineo.app.utilities.AddAbilityActor;
import com.bineo.app.utilities.GetSubStringText;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import java.util.logging.Level;
import java.util.logging.Logger;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultVoucher implements Task {
    private final String codeBond;
    private final String host;
    private static final String AMOUNT = "monto";

    public ConsultVoucher(String codeBond, String host) {
        this.codeBond = codeBond;
        this.host = host;
    }

    public static ConsultVoucher withData(String codeBond, String host) {
        return instrumented(ConsultVoucher.class, codeBond, host);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AddAbilityActor.callAnApi(actor, host);
        actor.attemptsTo(
                Get.resource(EndPoints.CONSULT_VOUCHER.resource())
                        .with(request -> request
                                .header("Authorization", "Bearer " + actor.recall(Apis.SAVE_TOKEN_UPDATE_CLIENT.value()))
                                .params("origen", "EDS"
                                        , "pdv", "99981"
                                        , "voucher", codeBond
                                        , AMOUNT, "1000"
                                )
                        )
        );
        Logger.getAnonymousLogger().log(Level.INFO, "Price Bond: {0}", SerenityRest.lastResponse().jsonPath().getObject(AMOUNT, String.class));
        actor.remember(Apis.SAVE_PRICE_BOND.value(), GetSubStringText.text(SerenityRest.lastResponse().jsonPath().getObject(AMOUNT, String.class), Values.PRICE_BOND_SPLIT.message(), 0));
    }
}
