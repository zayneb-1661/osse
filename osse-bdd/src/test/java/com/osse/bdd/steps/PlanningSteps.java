package com.osse.bdd.steps;

import io.cucumber.java.en.*;

public class PlanningSteps {

    @Given("juries, rooms and timeslots are defined")
    public void juries_rooms_timeslots_defined() {}

    @Given("student groups are available")
    public void student_groups_available() {}

    @When("the coordinator launches planning generation")
    public void generate_planning() {}

    @Then("the system proposes assignments")
    public void system_proposes_assignments() {}

    @Then("saves the planning as {string}")
    public void saves_planning(String status) {}

    @Given("a jury is already assigned to another soutenance in the same timeslot")
    public void jury_conflict() {}

    @When("planning generation is executed")
    public void planning_generation() {}

    @Then("the system lists the conflicts detected")
    public void list_conflicts() {}

    @When("the coordinator manually assigns a room already occupied at the same timeslot")
    public void manual_conflict() {}

    @Then("the system refuses the modification")
    public void system_refuses_modification() {}
}