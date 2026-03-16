package com.osse.bdd.steps;

import io.cucumber.java.en.*;

public class EvaluationSteps {

    @Given("the soutenance is accessible")
    public void soutenance_accessible() {}

    @Given("a grading grid is active")
    public void grading_grid_active() {}

    @Given("the user is authenticated as JURY")
    public void jury_authenticated() {}

    @When("the jury enters grades between {int} and {int} for each criterion")
    public void enter_grades(Integer min, Integer max) {}

    @Then("the system records the grades")
    public void records_grades() {}

    @Then("marks the evaluation as complete")
    public void evaluation_complete() {}

    @When("the jury enters a grade greater than {int}")
    public void invalid_grade(Integer grade) {}

    @Then("the system rejects the value")
    public void reject_value() {}

    @Given("the soutenance status is {string}")
    public void soutenance_status(String status) {}

    @When("the jury attempts to modify grades")
    public void modify_grades() {}
}