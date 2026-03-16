Feature: Timeslot management

Scenario: Create timeslot
Given rooms exist
When the coordinator defines a timeslot
Then the timeslot is available for planning

Scenario: Reject overlapping timeslot
Given a timeslot already exists
When the coordinator creates an overlapping timeslot
Then the system refuses creation