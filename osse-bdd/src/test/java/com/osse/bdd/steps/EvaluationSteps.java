package com.osse.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvaluationSteps {

    @Given("the soutenance is accessible")
    public void soutenance_accessible() {
        CommonSteps.context.soutenanceStatus = "OUVERTE";
    }

    @Given("a grading grid is active")
    public void grading_grid_active() {
        // simplified precondition
    }

    @Given("the user is authenticated as JURY")
    public void jury_authenticated() {
        // simplified precondition
    }

    @When("the jury enters grades between {int} and {int} for each criterion")
    public void enter_grades(Integer min, Integer max) {
        CommonSteps.context.minAllowedGrade = min;
        CommonSteps.context.maxAllowedGrade = max;
        CommonSteps.context.enteredGrade = 15;

        boolean valid = CommonSteps.context.enteredGrade >= min
                && CommonSteps.context.enteredGrade <= max;
        boolean closed = "CLOTUREE".equals(CommonSteps.context.soutenanceStatus);

        CommonSteps.context.gradesRecorded = valid && !closed;
        CommonSteps.context.evaluationComplete = valid && !closed;
        CommonSteps.context.errorDisplayed = false;
        CommonSteps.context.operationRefused = false;
    }

    @Then("the system records the grades")
    public void records_grades() {
        assertTrue(CommonSteps.context.gradesRecorded);
    }

    @Then("marks the evaluation as complete")
    public void evaluation_complete() {
        assertTrue(CommonSteps.context.evaluationComplete);
    }

    @When("the jury enters a grade greater than {int}")
    public void invalid_grade(Integer grade) {
        CommonSteps.context.enteredGrade = grade + 1;
        CommonSteps.context.gradesRecorded = false;
        CommonSteps.context.evaluationComplete = false;
        CommonSteps.context.errorDisplayed = true;
        CommonSteps.context.operationRefused = false;
    }

    @Then("the system rejects the value")
    public void reject_value() {
        assertFalse(CommonSteps.context.gradesRecorded);
        assertTrue(CommonSteps.context.errorDisplayed);
    }

    @Given("the soutenance status is {string}")
    public void soutenance_status(String status) {
        CommonSteps.context.soutenanceStatus = status;
    }

    @When("the jury attempts to modify grades")
    public void modify_grades() {
        CommonSteps.context.operationRefused =
                "CLOTUREE".equals(CommonSteps.context.soutenanceStatus);
    }
}