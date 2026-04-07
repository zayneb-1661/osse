package com.osse.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class NotificationsSteps {

    @Given("a planning is published")
    public void a_planning_is_published() {
        CommonSteps.context.notificationsSent = true;
    }

    @When("the notification process starts")
    public void the_notification_process_starts() {
        CommonSteps.context.notificationsSent = true;
    }

    @Then("students receive a notification")
    public void students_receive_a_notification() {
        assertTrue(CommonSteps.context.notificationsSent);
    }

    @Then("jury members receive their schedule")
    public void jury_members_receive_their_schedule() {
        assertTrue(CommonSteps.context.notificationsSent);
    }
}