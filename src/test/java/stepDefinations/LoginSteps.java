package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("Opening the login page...");
    }

    @When("I enter {string} and {string}")
    public void i_enter_username_and_password(String username, String password) {
        System.out.println("Entering username: " + username + " and password: " + password);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        System.out.println("Clicking on the login button...");
    }

    @Then("I should be logged into the application")
    public void i_should_be_logged_into_the_application() {
        System.out.println("Verifying successful login...");
    }
}
