Feature: Publish defence planning
  In order to make the planning official
  As a Coordinator or Administrator
  I want to publish a conflict-free planning

  Background:
    Given a draft planning exists
    And the user is authenticated with publication rights

  Scenario: Publish planning successfully
    Given no blocking conflict exists
    When the user validates publication
    Then the planning status becomes "PUBLIEE"
    And notifications are sent

  Scenario: Refuse publication if conflict exists
    Given at least one blocking conflict exists
    When the user attempts to publish
    Then the system refuses publication

  Scenario: Refuse publication with insufficient rights
    Given the user does not have publication rights
    When the user attempts to publish
    Then access is denied

