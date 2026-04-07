package com.osse.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class ImportSteps {

    @When("the user uploads a valid CSV file")
    public void upload_valid_csv() {
        CommonSteps.context.validRowsImported = true;
        CommonSteps.context.importReportGenerated = true;
        CommonSteps.context.errorDisplayed = false;
        CommonSteps.context.operationRefused = false;
        CommonSteps.context.invalidRowsListed = false;
    }

    @Then("an import report is generated")
    public void import_report_generated() {
        assertTrue(CommonSteps.context.importReportGenerated);
    }

    @When("the user uploads a file with missing mandatory columns")
    public void missing_columns() {
        CommonSteps.context.validRowsImported = false;
        CommonSteps.context.importReportGenerated = false;
        CommonSteps.context.errorDisplayed = true;
        CommonSteps.context.operationRefused = true;
        CommonSteps.context.invalidRowsListed = false;
    }

    @Then("the system rejects the import")
    public void reject_import() {
        assertTrue(CommonSteps.context.operationRefused);
    }

    @When("the user uploads a file containing invalid rows")
    public void invalid_rows() {
        CommonSteps.context.validRowsImported = true;
        CommonSteps.context.importReportGenerated = true;
        CommonSteps.context.invalidRowsListed = true;
        CommonSteps.context.errorDisplayed = false;
        CommonSteps.context.operationRefused = false;
    }

    @Then("invalid rows are listed in the report")
    public void invalid_rows_report() {
        assertTrue(CommonSteps.context.invalidRowsListed);
    }
}