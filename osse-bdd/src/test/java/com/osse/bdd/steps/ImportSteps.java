package com.osse.bdd.steps;

import io.cucumber.java.en.*;

public class ImportSteps {

    @When("the user uploads a valid CSV file")
    public void upload_valid_csv() {}

    @Then("an import report is generated")
    public void import_report_generated() {}

    @When("the user uploads a file with missing mandatory columns")
    public void missing_columns() {}

    @Then("the system rejects the import")
    public void reject_import() {}

    @When("the user uploads a file containing invalid rows")
    public void invalid_rows() {}

    @Then("invalid rows are listed in the report")
    public void invalid_rows_report() {}
}