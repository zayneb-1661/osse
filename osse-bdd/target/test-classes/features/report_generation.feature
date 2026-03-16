Feature: Jury report generation

Scenario: Generate jury report
Given evaluations are completed
When the coordinator requests the report
Then the system generates a jury report

Scenario: Export report as PDF
Given a jury report exists
When the coordinator exports the report
Then the system generates a PDF file