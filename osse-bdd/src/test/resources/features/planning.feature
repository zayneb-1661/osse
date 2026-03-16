Feature: Generate defence planning
  In order to assign juries, rooms and timeslots
  As a Coordinator
  I want to generate a draft planning without blocking conflicts

  Background:
    Given juries, rooms and timeslots are defined
    And student groups are available
    And the user is authenticated as COORDINATOR

  Scenario: Generate draft planning successfully
    When the coordinator launches planning generation
    Then the system proposes assignments
    And saves the planning as "BROUILLON"

  Scenario: Detect resource conflicts
    Given a jury is already assigned to another soutenance in the same timeslot
    When planning generation is executed
    Then the system lists the conflicts detected

  Scenario: Prevent invalid manual modification
    When the coordinator manually assigns a room already occupied at the same timeslot
    Then the system refuses the modification
