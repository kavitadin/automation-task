package Steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

public class PostSteps {
    @RunWith(Cucumber.class)
    public class MyStepDefinitions {

        @Given("^browser is open$")
        public void browser_is_open() throws Throwable {
            System.out.println("browser is open");
        }

        @When("^user clicks on Monthly payment button$")
        public void user_clicks_on_monthly_payment_button() throws Throwable {
            System.out.println("user clicks on Monthly payment button");
        }

        @Then("^User should accept values and calculate$")
        public void user_should_accept_values_and_calculate() throws Throwable {
            System.out.println("User should accept values and calculate");
        }

        @And("^user is able to change the Monthly payment amount to $750$")
        public void user_is_able_to_change_the_monthly_payment_amount_to_$750() throws Throwable {
            System.out.println("user is able to change the Monthly payment amount to $750$");
        }

    }
}
