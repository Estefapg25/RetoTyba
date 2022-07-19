package co.com.advantageshopping.stepdefinitions;

import co.com.advantageshopping.questions.*;
import co.com.advantageshopping.tasks.CreateAccount;
import co.com.advantageshopping.tasks.CreateNewAccount;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class CreateAccountStepDefinitions {

    @Given("^he enters the option to create new account$")
    public void heEntersTheOptionToCreateNewAccount() {
        theActorInTheSpotlight().attemptsTo(CreateNewAccount.inPage());
    }
    @When("^he enters the required information$")
    public void heEntersTheRequiredInformation(DataTable dataTable) {
        List<String> data =dataTable.values();
        theActorInTheSpotlight().attemptsTo(CreateAccount.newUser(data));
    }

    @Then("^the customer can see the logged-in$")
    public void theCustomerCanSeeTheHomePage(DataTable dataTable) {
        List<String> data =dataTable.values();
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateLogin.inMenu(data)));
    }

    @Then("^the customer can see the error message on screen (.+)$")
    public void theCustomerCanSeeTheErrorMessageOnScreen(String message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateErrorUserExists.inTheSystem(), containsString(message)));
    }






}
