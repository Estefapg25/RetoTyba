package co.com.advantageshopping.stepdefinitions.hooks;

import co.com.advantageshopping.utils.Constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ShoppingHook {

    @Managed(driver = "chrome")
    private WebDriver webdriver;

    @Before
    public void configureBaseUrl() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("actor");

    }


    @Given("^that the customer enters the shopping page$")
    public void theUserOpenApplication() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url(Constants.URL));
    }
}
