Feature: Notification system

Scenario: Notify students after planning publication
Given a planning is published
When the notification process starts
Then students receive a notification

Scenario: Notify jury members
Given a planning is published
When notifications are sent
Then jury members receive their schedule