package com.osse.bdd.steps;

import io.cucumber.java.en.*;

public class ProjectSubmissionSteps {

    @Given("a student is authenticated")
    public void a_student_is_authenticated() {}

    @When("the student uploads the project document")
    public void the_student_uploads_the_project_document() {}

    @Then("the system stores the document")
    public void the_system_stores_the_document() {}

    @When("the student uploads an unsupported file type")
    public void the_student_uploads_an_unsupported_file_type() {}

    @Then("the system rejects the upload")
    public void the_system_rejects_the_upload() {}
}