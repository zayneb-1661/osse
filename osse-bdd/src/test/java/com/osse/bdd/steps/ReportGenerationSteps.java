package com.osse.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ReportGenerationSteps {

    @Given("a jury report exists")
    public void a_jury_report_exists() {
        // simulate that a report is already available
    }

    @When("the coordinator exports the report")
    public void the_coordinator_exports_the_report() {
        // simulate exporting report
    }

    @Then("the system generates a PDF file")
    public void the_system_generates_a_pdf_file() {
        // simulate pdf generation
    }

    @When("the coordinator requests the report")
    public void the_coordinator_requests_the_report() {
        // simulate requesting report
    }

    @Then("the system generates a jury report")
    public void the_system_generates_a_jury_report() {
        // simulate generating jury report
    }
}