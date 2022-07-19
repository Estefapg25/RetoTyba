package co.com.advantageshopping.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Wait implements Interaction {
    private int waitingTime;

    public Wait(int waitingTime) {
        super();
        this.waitingTime = waitingTime;
    }


    public static Wait onMoment(int waitingTime) {
        return instrumented(Wait.class, waitingTime);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(waitingTime);
    }

}
