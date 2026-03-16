package com.osse.bdd.steps;

import io.cucumber.java.en.*;

public class PublishPlanningSteps {

    @Given("a draft planning exists")
    public void a_draft_planning_exists() {}

    @Given("the user is authenticated with publication rights")
    public void authenticated_publication_rights() {}

    @Given("no blocking conflict exists")
    public void no_conflict() {}

    @When("the user validates publication")
    public void validate_publication() {}

    @Then("the planning status becomes {string}")
    public void planning_status(String status) {}

    @Given("at least one blocking conflict exists")
    public void blocking_conflict() {}

    @When("the user attempts to publish")
    public void attempt_publish() {}

    @Then("the system refuses publication")
    public void refuses_publication() {}

    @Given("the user does not have publication rights")
    public void no_rights() {}
}