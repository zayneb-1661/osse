Feature: Jury assignment

Scenario: Assign jury to soutenance
Given juries and student groups exist
When the coordinator assigns a jury to a group
Then the assignment is saved

Scenario: Prevent duplicate jury assignment
Given a jury is already assigned at the same timeslot
When the coordinator assigns the same jury again
Then the system detects a conflict