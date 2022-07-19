package co.com.advantageshopping.tasks;


import co.com.advantageshopping.interactions.Wait;
import co.com.advantageshopping.models.Data;
import co.com.advantageshopping.userinterfaces.LoginShopping;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {

    private final List<String> data;

    public Login(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginShopping.BTN_USER),
                Enter.theValue(data.get(0)).into(LoginShopping.TXT_NAME_USER),
                Enter.theValue(data.get(1)).into(LoginShopping.TXT_PASSWORD_USER),
                Wait.onMoment(200),
                Click.on(LoginShopping.BTN_SIGN_IN),
                Wait.onMoment(200));
    }

    public static Login inAdvantageShopping(List<String> data) {
        return Tasks.instrumented(Login.class, data);
    }
}
