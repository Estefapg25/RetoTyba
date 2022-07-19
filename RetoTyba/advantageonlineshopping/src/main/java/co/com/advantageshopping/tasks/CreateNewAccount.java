package co.com.advantageshopping.tasks;

import co.com.advantageshopping.interactions.Wait;
import co.com.advantageshopping.userinterfaces.LoginShopping;
import co.com.advantageshopping.userinterfaces.NewAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class CreateNewAccount implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginShopping.BTN_USER),
                Wait.onMoment(200),
                WaitUntil.the(NewAccount.BTN_NEW_ACCOUNT, isEnabled()).forNoMoreThan(300).seconds(),
                Click.on(NewAccount.BTN_NEW_ACCOUNT));
    }

    public static CreateNewAccount inPage() {
        return new CreateNewAccount();
    }
}
