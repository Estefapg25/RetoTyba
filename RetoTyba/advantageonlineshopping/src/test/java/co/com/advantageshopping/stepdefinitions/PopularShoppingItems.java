package co.com.advantageshopping.stepdefinitions;


import co.com.advantageshopping.questions.ValidateErrorUserExists;
import co.com.advantageshopping.questions.ValidateMessageOrder;
import co.com.advantageshopping.tasks.CreateAccount;
import co.com.advantageshopping.tasks.Login;
import co.com.advantageshopping.tasks.SelectProducts;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class PopularShoppingItems {

    @Given("^enter your login data$")
    public void enterYourLoginData(DataTable dataTable) {
        List<String> data =dataTable.values();
        theActorInTheSpotlight().attemptsTo(Login.inAdvantageShopping(data));

    }

    @When("^select product characteristics and payment method$")
    public void selectProductCharacteristicsAndPaymentMethod(DataTable dataTable) {
        List<String> data =dataTable.values();
        theActorInTheSpotlight().attemptsTo(SelectProducts.inPopularItems(data));
    }

    @Then("^customer sees (.+) message on the payment order$")
    public void customerSeesThankYouForBuyingWithAdvantageMessageOnThePaymentOrder(String message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageOrder.inOrderPayment(), containsString(message)));
    }

    @Then("^the customer can see the error message SafePay username field is required$")
    public void theCustomerCanSeeTheErrorMessageSafePayUsernameFieldIsRequired() {

    }

}
