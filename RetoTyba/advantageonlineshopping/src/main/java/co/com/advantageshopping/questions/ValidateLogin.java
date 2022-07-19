package co.com.advantageshopping.questions;

import co.com.advantageshopping.interactions.Wait;
import co.com.advantageshopping.userinterfaces.NewAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ValidateLogin implements Question<Boolean> {

    private List<String> data;
    private String user;

    public ValidateLogin(List<String> data) {
        this.data = data;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        user = NewAccount.LBL_MY_ACCOUNT.of(data.get(0)).resolveFor(actor).getText();
        actor.attemptsTo(Wait.onMoment(200));
        if (user.contains(data.get(0))) {
            return true;
        }
        else
            return false;

    }


    public static ValidateLogin inMenu(List<String> data) {

        return new ValidateLogin(data);
    }
}
