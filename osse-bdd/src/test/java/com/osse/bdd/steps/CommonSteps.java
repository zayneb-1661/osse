package com.osse.bdd.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

public class CommonSteps {

    public static final TestContext context = new TestContext();

    @Before
    public void resetContext() {
        context.operationRefused = false;
        context.accessDenied = false;
        context.errorDisplayed = false;
        context.notificationsSent = false;
        context.validRowsImported = false;
        context.importReportGenerated = false;
        context.invalidRowsListed = false;
        context.gradesRecorded = false;
        context.evaluationComplete = false;
        context.soutenanceStatus = null;
        context.planningStatus = null;
        context.enteredGrade = 0;
        context.minAllowedGrade = 0;
        context.maxAllowedGrade = 0;
    }

    @Given("a session exists")
    public void a_session_exists() {
        // simplified shared precondition
    }

    @Given("the user is authenticated")
    public void the_user_is_authenticated() {
        // simplified shared precondition
    }

    @Given("the user is authenticated as COORDINATOR")
    public void the_user_is_authenticated_as_coordinator() {
        // simplified shared precondition
    }

    @Then("displays an error message")
    public void displays_an_error_message() {
        assertTrue(context.errorDisplayed);
    }

    @Then("notifications are sent")
    public void notifications_are_sent() {
        assertTrue(context.notificationsSent);
    }

    @Then("access is denied")
    public void access_is_denied() {
        assertTrue(context.accessDenied);
    }

    @Then("valid rows are imported")
    public void valid_rows_are_imported() {
        assertTrue(context.validRowsImported);
    }

    @Then("the system refuses creation")
    public void the_system_refuses_creation() {
        assertTrue(context.operationRefused);
    }
}