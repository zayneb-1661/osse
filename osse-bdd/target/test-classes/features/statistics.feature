Feature: Session statistics

Scenario: View grade distribution
Given a session is completed
When the coordinator views statistics
Then the system displays grade distribution

Scenario: View average grades
Given evaluations are completed
When statistics are calculated
Then the system displays average grades