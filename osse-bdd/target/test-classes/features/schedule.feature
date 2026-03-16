Feature: Generate defence schedule

  Scenario: Successful generation
    Given a session exists
    When the coordinator generates the schedule
    Then a draft schedule is created
