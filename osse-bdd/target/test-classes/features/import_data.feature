Feature: Import students, groups and projects
  In order to avoid manual data entry
  As a Coordinator
  I want to import academic data from a file

  Background:
    Given a session exists
    And the user is authenticated as COORDINATOR

  Scenario: Successful import
    When the user uploads a valid CSV file
    Then valid rows are imported
    And an import report is generated

  Scenario: File with missing columns
    When the user uploads a file with missing mandatory columns
    Then the system rejects the import
    And displays an error message

  Scenario: Partial import with errors
    When the user uploads a file containing invalid rows
    Then valid rows are imported
    And invalid rows are listed in the report
