Feature: Enter evaluation grades
  In order to assess student performance
  As a Jury member
  I want to enter grades per criterion

  Background:
    Given the soutenance is accessible
    And a grading grid is active
    And the user is authenticated as JURY

  Scenario: Enter valid grades
    When the jury enters grades between 0 and 20 for each criterion
    Then the system records the grades
    And marks the evaluation as complete

  Scenario: Reject grade outside allowed range
    When the jury enters a grade greater than 20
    Then the system rejects the value
    And displays an error message

  Scenario: Prevent editing after closure
    Given the soutenance status is "CLOTUREE"
    When the jury attempts to modify grades
    Then the system refuses the modification
