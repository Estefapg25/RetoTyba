package co.com.advantageshopping.tasks;

import co.com.advantageshopping.interactions.Wait;
import co.com.advantageshopping.userinterfaces.NewAccount;
import co.com.advantageshopping.userinterfaces.Products;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SelectProducts implements Task {

    private final List<String> data;

    public SelectProducts(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.onMoment(500),
                Click.on(Products.LNK_PRODUCT_DIEZ),
                Click.on(Products.TXT_QUANTITY),
                Click.on(Products.TXT_QUANTITY),
                Click.on(Products.BTN_ADD_TO_CART),
                Wait.onMoment(600),
                WaitUntil.the(Products.BTN_CHECKOUT, isEnabled()).forNoMoreThan(300).seconds(),
                Click.on(Products.BTN_CHECKOUT),
                Click.on(Products.BTN_NEXT),
                Wait.onMoment(200),
                Enter.theValue(data.get(0)).into(Products.TXT_SAFEPAY_NAME),
                Enter.theValue(data.get(1)).into(Products.TXT_SAFEPAY_PASSWORD),
                Click.on(Products.BTN_PAY_NOW),
                WaitUntil.the(Products.LBL_ORDER, isVisible()).forNoMoreThan(300).seconds(),
                Wait.onMoment(500));


    }

    public static SelectProducts inPopularItems(List<String> data) {
        return Tasks.instrumented(SelectProducts.class, data);
    }
}
