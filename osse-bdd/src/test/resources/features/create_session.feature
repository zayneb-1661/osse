Feature: Create a defence session
  In order to initialize the defence process
  As an Administrator or Coordinator
  I want to create a new soutenance session

  Background:
    Given the user is authenticated
    And the user has ADMIN or COORDINATOR role

  Scenario: Create a valid session
    When the user enters a valid name, type and coherent dates
    And submits the form
    Then the system creates the session
    And the session status is "DRAFT"

  Scenario: Reject session with incoherent dates
    When the user enters an end date earlier than the start date
    And submits the form
    Then the system refuses creation
    And displays an error message

  Scenario: Reject duplicate session
    Given a session with the same name and period already exists
    When the user tries to create the session again
    Then the system refuses creation