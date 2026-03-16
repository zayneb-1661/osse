Feature: User authentication

Scenario: Successful login
Given a registered user exists
When the user enters valid credentials
Then the system authenticates the user
And redirects to the dashboard

Scenario: Reject invalid login
Given a registered user exists
When the user enters invalid credentials
Then the system refuses authentication
And displays an error message