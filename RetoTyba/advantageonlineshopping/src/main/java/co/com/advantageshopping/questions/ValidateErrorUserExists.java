package co.com.advantageshopping.questions;

import co.com.advantageshopping.userinterfaces.NewAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateErrorUserExists implements Question<String> {



    @Override
    public String answeredBy(Actor actor) {

        return NewAccount.LBL_USER_EXISTS.resolveFor(actor).getText();

    }

    public static ValidateErrorUserExists inTheSystem() {

        return new ValidateErrorUserExists();
    }
}
