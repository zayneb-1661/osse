package com.osse.bdd.steps;

import io.cucumber.java.en.*;

public class CommonSteps {

    @Given("a session exists")
    public void a_session_exists() {}

    @Given("the user is authenticated")
    public void the_user_is_authenticated() {}

    @Given("the user is authenticated as COORDINATOR")
    public void the_user_is_authenticated_as_coordinator() {}

    @Then("displays an error message")
    public void displays_an_error_message() {}

    @Then("notifications are sent")
    public void notifications_are_sent() {}

    @Then("access is denied")
    public void access_is_denied() {}

    @Then("valid rows are imported")
    public void valid_rows_are_imported() {}
}