package com.osse.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AuthenticationSteps {

    @Given("a registered user exists")
    public void a_registered_user_exists() {
        // simulate existing user in system
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        // simulate entering correct username/password
    }

    @When("the user enters invalid credentials")
    public void the_user_enters_invalid_credentials() {
        // simulate entering wrong username/password
    }

    @Then("the system authenticates the user")
    public void the_system_authenticates_the_user() {
        // simulate authentication success
    }

    @Then("redirects to the dashboard")
    public void redirects_to_the_dashboard() {
        // simulate redirect after successful login
    }

    @Then("the system refuses authentication")
    public void the_system_refuses_authentication() {
        // simulate login failure
    }
}