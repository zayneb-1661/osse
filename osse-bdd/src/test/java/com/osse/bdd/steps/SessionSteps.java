package com.osse.bdd.steps;

import io.cucumber.java.en.*;

public class SessionSteps {

    @Given("the user has ADMIN or COORDINATOR role")
    public void the_user_has_admin_or_coordinator_role() {}

    @When("the user enters a valid name, type and coherent dates")
    public void valid_session_data() {}

    @When("submits the form")
    public void submits_the_form() {}

    @Then("the system creates the session")
    public void the_system_creates_the_session() {}

    @Then("the session status is {string}")
    public void the_session_status_is(String status) {}

    @When("the user enters an end date earlier than the start date")
    public void invalid_dates() {}

    @Then("the system refuses creation")
    public void the_system_refuses_creation() {}

    @Given("a session with the same name and period already exists")
    public void duplicate_session() {}

    @When("the user tries to create the session again")
    public void create_session_again() {}
}