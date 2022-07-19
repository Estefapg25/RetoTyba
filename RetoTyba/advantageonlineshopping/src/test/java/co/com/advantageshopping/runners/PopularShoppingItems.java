package co.com.advantageshopping.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/popular_shopping_items.feature",
        glue = "co.com.advantageshopping.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class PopularShoppingItems {
}
