package com.osse.bdd.steps;

import io.cucumber.java.en.*;

public class RoomManagementSteps {

    @Given("the admin is authenticated")
    public void the_admin_is_authenticated() {}

    @When("the admin registers a new room")
    public void the_admin_registers_a_new_room() {}

    @Then("the room becomes available for planning")
    public void the_room_becomes_available_for_planning() {}

    @Given("a room with the same name exists")
    public void a_room_with_the_same_name_exists() {}

    @When("the admin creates another room with the same name")
    public void the_admin_creates_another_room_with_the_same_name() {}
}