Feature: Concurrency management

  Scenario: Two coordinators modify the planning simultaneously
    Given two coordinators open the same draft planning
    When the first coordinator saves modifications
    And the second coordinator tries to save outdated data
    Then the system rejects the second update
    And displays a version conflict message

  Scenario: Jury enters grades during closure attempt
    Given a jury is entering grades
    When the coordinator attempts to close the soutenance
    Then the system ensures atomic validation
    And closure is either completed correctly
    And inconsistent states are prevented
