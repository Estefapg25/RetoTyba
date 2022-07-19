package co.com.advantageshopping.tasks;

import co.com.advantageshopping.interactions.Wait;
import co.com.advantageshopping.userinterfaces.NewAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CreateAccount implements Task {

    private final List<String> data;

    public CreateAccount(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0)).into(NewAccount.TXT_USERNAME_REGISTER),
                Enter.theValue(data.get(1)).into(NewAccount.TXT_EMAIL),
                Enter.theValue(data.get(2)).into(NewAccount.TXT_PASSWORD),
                Enter.theValue(data.get(2)).into(NewAccount.TXT_CONFIRM_PASSWORD),
                WaitUntil.the(NewAccount.CHK_AGREE, isClickable()).forNoMoreThan(300).seconds(),
                Click.on(NewAccount.CHK_AGREE),
                Click.on(NewAccount.BTN_REGISTER));
        actor.attemptsTo(Wait.onMoment(200));
    }

    public static CreateAccount newUser(List<String> data) {
        return Tasks.instrumented(CreateAccount.class,data);
    }
}
