package co.com.advantageshopping.tasks;

import co.com.advantageshopping.interactions.Wait;
import co.com.advantageshopping.userinterfaces.Products;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class SelectProductsMasterCard implements Task {

    private final List<String> data;

    public SelectProductsMasterCard(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Products.LNK_POPULAR_ITEMS),
                Wait.onMoment(200),
                Click.on(Products.LNK_PRODUCT),
                Click.on(Products.LNK_COLOR),
                Click.on(Products.TXT_QUANTITY),
                Click.on(Products.TXT_QUANTITY),
                Click.on(Products.TXT_QUANTITY),
                Click.on(Products.BTN_ADD_TO_CART),
                Click.on(Products.BTN_CHECKOUT),
                Click.on(Products.BTN_NEXT),
                Click.on(Products.RDB_MASTERCARD),
                Wait.onMoment(200),
                Enter.theValue(data.get(0)).into(Products.TXT_CARD_NUMBER),
                Enter.theValue(data.get(1)).into(Products.TXT_CVV),
                Wait.onMoment(200),
                Click.on(Products.LST_MM),
                Click.on(Products.SELECT_MM.of(data.get(2))),
                Click.on(Products.LST_YYYY),
                Click.on(Products.SELECT_YYYY.of(data.get(3))),
                Enter.theValue(data.get(4)).into(Products.TXT_CARDHOLDER),
                Click.on(Products.BTN_PAY_NOW_MANUAL));

    }

    public static SelectProductsMasterCard inPopularItems(List<String> data) {
        return Tasks.instrumented(SelectProductsMasterCard.class, data);
    }
}
