package com.osse.bdd.steps;

import io.cucumber.java.en.*;

public class UserRolesSteps {

    @Given("an admin is authenticated")
    public void an_admin_is_authenticated() {}

    @When("the admin assigns COORDINATOR role to a user")
    public void the_admin_assigns_coordinator_role_to_a_user() {}

    @Then("the user gains coordinator privileges")
    public void the_user_gains_coordinator_privileges() {}

    @When("the admin removes coordinator role from a user")
    public void the_admin_removes_coordinator_role_from_a_user() {}

    @Then("the user loses coordinator privileges")
    public void the_user_loses_coordinator_privileges() {}
}