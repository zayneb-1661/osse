package com.osse.bdd.steps;

import io.cucumber.java.en.*;

public class GroupManagementSteps {

    @Given("the coordinator is authenticated")
    public void the_coordinator_is_authenticated() {}

    @When("the coordinator registers a group of students")
    public void the_coordinator_registers_a_group_of_students() {}

    @Then("the system saves the group")
    public void the_system_saves_the_group() {}

    @Given("a student already belongs to another group")
    public void a_student_already_belongs_to_another_group() {}

    @When("the coordinator tries to assign the student to a new group")
    public void the_coordinator_tries_to_assign_the_student_to_a_new_group() {}

    @Then("the system refuses the assignment")
    public void the_system_refuses_the_assignment() {}
}