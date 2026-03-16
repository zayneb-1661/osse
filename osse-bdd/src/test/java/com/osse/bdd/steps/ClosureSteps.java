package com.osse.bdd.steps;

import io.cucumber.java.en.*;

public class ClosureSteps {

    @Given("the user is authenticated with closure rights")
    public void closure_rights() {}

    @Given("all evaluations are complete")
    public void evaluations_complete() {}

    @When("the user triggers final calculation")
    public void trigger_calculation() {}

    @Then("the system calculates the weighted final grade")
    public void calculate_grade() {}

    @Then("generates the PV document")
    public void generate_pv() {}

    @Then("sets the status to {string}")
    public void set_status(String status) {}

    @Given("at least one evaluation is incomplete")
    public void evaluation_incomplete() {}

    @When("the user attempts closure")
    public void attempt_closure() {}

    @Then("the system refuses closure")
    public void refuse_closure() {}

    @Given("the total weighting of criteria is invalid")
    public void invalid_weight() {}

    @When("final calculation is triggered")
    public void final_calculation() {}

    @Then("the system blocks the calculation")
    public void block_calculation() {}
}