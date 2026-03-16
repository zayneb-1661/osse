package com.osse.bdd.steps;

import io.cucumber.java.en.*;

public class JuryAssignmentSteps {

    @Given("juries and student groups exist")
    public void juries_and_student_groups_exist() {}

    @When("the coordinator assigns a jury to a group")
    public void the_coordinator_assigns_a_jury_to_a_group() {}

    @Then("the assignment is saved")
    public void the_assignment_is_saved() {}

    @Given("a jury is already assigned at the same timeslot")
    public void a_jury_is_already_assigned_at_the_same_timeslot() {}

    @When("the coordinator assigns the same jury again")
    public void the_coordinator_assigns_the_same_jury_again() {}

    @Then("the system detects a conflict")
    public void the_system_detects_a_conflict() {}
}