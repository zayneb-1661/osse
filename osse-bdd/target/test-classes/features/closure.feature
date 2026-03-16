Feature: Generate PV and close soutenance
  In order to finalize results
  As a Coordinator or Scolarité member
  I want to calculate final grade and close the soutenance

  Background:
    Given the user is authenticated with closure rights

  Scenario: Close soutenance successfully
    Given all evaluations are complete
    When the user triggers final calculation
    Then the system calculates the weighted final grade
    And generates the PV document
    And sets the status to "CLOTUREE"

  Scenario: Prevent closure with incomplete evaluations
    Given at least one evaluation is incomplete
    When the user attempts closure
    Then the system refuses closure

  Scenario: Prevent closure with invalid weighting
    Given the total weighting of criteria is invalid
    When final calculation is triggered
    Then the system blocks the calculation
