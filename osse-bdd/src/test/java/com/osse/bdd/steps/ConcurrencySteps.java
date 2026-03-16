package com.osse.bdd.steps;

import io.cucumber.java.en.*;

public class ConcurrencySteps {

    @Given("two coordinators open the same draft planning")
    public void open_same_planning() {}

    @When("the first coordinator saves modifications")
    public void first_save() {}

    @When("the second coordinator tries to save outdated data")
    public void second_save() {}

    @Then("the system rejects the second update")
    public void reject_second_update() {}

    @Then("displays a version conflict message")
    public void conflict_message() {}

    @Given("a jury is entering grades")
    public void jury_entering_grades() {}

    @When("the coordinator attempts to close the soutenance")
    public void coordinator_attempt_close() {}

    @Then("the system ensures atomic validation")
    public void atomic_validation() {}

    @Then("closure is either completed correctly")
    public void closure_correct() {}

    @Then("inconsistent states are prevented")
    public void prevent_inconsistent_states() {}
}