package com.osse.bdd.steps;

import com.osse.domain.Planning;
import com.osse.service.PlanningService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PublishPlanningSteps {

    private final PlanningService planningService = new PlanningService();
    private Planning planning;
    private boolean hasPublicationRights;
    private boolean hasBlockingConflict;
    private boolean publishedSuccessfully;

    @Given("a draft planning exists")
    public void a_draft_planning_exists() {
        planning = new Planning();
        CommonSteps.context.planningStatus = planning.getStatus();
    }

    @Given("the user is authenticated with publication rights")
    public void authenticated_publication_rights() {
        hasPublicationRights = true;
    }

    @Given("no blocking conflict exists")
    public void no_conflict() {
        hasBlockingConflict = false;
    }

    @When("the user validates publication")
    public void validate_publication() {
        publishedSuccessfully = planningService.publishPlanning(
                planning, hasPublicationRights, hasBlockingConflict
        );

        CommonSteps.context.planningStatus = planning.getStatus();
        CommonSteps.context.notificationsSent = publishedSuccessfully;
        CommonSteps.context.operationRefused = !publishedSuccessfully;
    }

    @Then("the planning status becomes {string}")
    public void planning_status(String status) {
        assertEquals(status, CommonSteps.context.planningStatus);
    }

    @Given("at least one blocking conflict exists")
    public void blocking_conflict() {
        hasBlockingConflict = true;
    }

    @When("the user attempts to publish")
    public void attempt_publish() {
        publishedSuccessfully = planningService.publishPlanning(
                planning, hasPublicationRights, hasBlockingConflict
        );

        CommonSteps.context.planningStatus = planning.getStatus();
        CommonSteps.context.operationRefused = !publishedSuccessfully;
        CommonSteps.context.accessDenied = !hasPublicationRights;
        CommonSteps.context.notificationsSent = publishedSuccessfully;
    }

    @Then("the system refuses publication")
    public void refuses_publication() {
        assertTrue(CommonSteps.context.operationRefused);
        assertEquals("BROUILLON", CommonSteps.context.planningStatus);
    }

    @Given("the user does not have publication rights")
    public void no_rights() {
        hasPublicationRights = false;
    }
}