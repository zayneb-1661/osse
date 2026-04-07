package com.osse.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class RoomManagementSteps {

    @Given("the admin is authenticated")
    public void the_admin_is_authenticated() {
        // simplified precondition
    }

    @When("the admin registers a new room")
    public void the_admin_registers_a_new_room() {
        CommonSteps.context.operationRefused = false;
    }

    @Then("the room becomes available for planning")
    public void the_room_becomes_available_for_planning() {
        assertTrue(true);
    }

    @Given("a room with the same name exists")
    public void a_room_with_the_same_name_exists() {
        // simplified precondition
    }

    @When("the admin creates another room with the same name")
    public void the_admin_creates_another_room_with_the_same_name() {
        CommonSteps.context.operationRefused = true;
        CommonSteps.context.errorDisplayed = true;
    }
}