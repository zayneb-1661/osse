Feature: Room management

Scenario: Create defence room
Given the admin is authenticated
When the admin registers a new room
Then the room becomes available for planning

Scenario: Prevent duplicate room
Given a room with the same name exists
When the admin creates another room with the same name
Then the system refuses creation