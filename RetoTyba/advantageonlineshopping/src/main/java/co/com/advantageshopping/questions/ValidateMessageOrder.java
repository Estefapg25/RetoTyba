package co.com.advantageshopping.questions;

import co.com.advantageshopping.interactions.Wait;
import co.com.advantageshopping.userinterfaces.Products;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ValidateMessageOrder implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(Wait.onMoment(500), WaitUntil.the(Products.LBL_ORDER, isPresent()).forNoMoreThan(300).seconds());
        return Products.LBL_ORDER.resolveFor(actor).getText();

    }

    public static ValidateMessageOrder inOrderPayment() {

        return new ValidateMessageOrder();
    }
}
