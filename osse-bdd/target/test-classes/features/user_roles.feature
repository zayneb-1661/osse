Feature: User role management

Scenario: Assign coordinator role
Given an admin is authenticated
When the admin assigns COORDINATOR role to a user
Then the user gains coordinator privileges

Scenario: Remove coordinator role
Given an admin is authenticated
When the admin removes coordinator role from a user
Then the user loses coordinator privileges