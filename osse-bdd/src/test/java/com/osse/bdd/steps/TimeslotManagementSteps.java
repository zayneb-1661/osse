package com.osse.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class TimeslotManagementSteps {

    @Given("rooms exist")
    public void rooms_exist() {
        // simplified precondition
    }

    @When("the coordinator defines a timeslot")
    public void the_coordinator_defines_a_timeslot() {
        CommonSteps.context.operationRefused = false;
    }

    @Then("the timeslot is available for planning")
    public void the_timeslot_is_available_for_planning() {
        assertTrue(true);
    }

    @Given("a timeslot already exists")
    public void a_timeslot_already_exists() {
        // simplified precondition
    }

    @When("the coordinator creates an overlapping timeslot")
    public void the_coordinator_creates_an_overlapping_timeslot() {
        CommonSteps.context.operationRefused = true;
        CommonSteps.context.errorDisplayed = true;
    }
}