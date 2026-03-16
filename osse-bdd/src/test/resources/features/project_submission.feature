Feature: Project submission

Scenario: Submit project successfully
Given a student is authenticated
When the student uploads the project document
Then the system stores the document

Scenario: Reject unsupported file
Given a student is authenticated
When the student uploads an unsupported file type
Then the system rejects the upload