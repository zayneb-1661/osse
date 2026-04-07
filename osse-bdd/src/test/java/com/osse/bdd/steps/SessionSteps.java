package com.osse.bdd.steps;

import com.osse.domain.Session;
import com.osse.service.SessionService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SessionSteps {
    private final SessionService service = new SessionService();
    private Session session;
    private String name = "Spring 2026";
    private String type = "DEFENSE";
    private LocalDate start = LocalDate.of(2026, 6, 1);
    private LocalDate end = LocalDate.of(2026, 6, 10);

    @Given("the user has ADMIN or COORDINATOR role")
    public void the_user_has_admin_or_coordinator_role() {
        // role verified
    }

    @When("the user enters a valid name, type and coherent dates")
    public void valid_session_data() {
        start = LocalDate.of(2026, 6, 1);
        end = LocalDate.of(2026, 6, 10);
        CommonSteps.context.operationRefused = false;
        CommonSteps.context.errorDisplayed = false;
    }

    @When("submits the form")
    public void submits_the_form() {
        session = service.createSession(name, type, start, end);
        CommonSteps.context.operationRefused = (session == null);
        CommonSteps.context.errorDisplayed = (session == null);
    }

    @Then("the system creates the session")
    public void the_system_creates_the_session() {
        assertNotNull(session);
    }

    @Then("the session status is {string}")
    public void the_session_status_is(String status) {
        assertEquals(status, session.getStatus());
    }

    @When("the user enters an end date earlier than the start date")
    public void invalid_dates() {
        start = LocalDate.of(2026, 6, 10);
        end = LocalDate.of(2026, 6, 1);
        session = service.createSession(name, type, start, end);
        CommonSteps.context.operationRefused = (session == null);
        CommonSteps.context.errorDisplayed = (session == null);
    }

    @Given("a session with the same name and period already exists")
    public void duplicate_session() {
        service.createSession(name, type, start, end);
    }

    @When("the user tries to create the session again")
    public void create_session_again() {
        session = service.createSession(name, type, start, end);
        CommonSteps.context.operationRefused = (session == null);
        CommonSteps.context.errorDisplayed = (session == null);
    }
}