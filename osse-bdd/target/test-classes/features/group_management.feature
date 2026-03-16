Feature: Student group management

Scenario: Create student group
Given the coordinator is authenticated
When the coordinator registers a group of students
Then the system saves the group

Scenario: Reject group with duplicate student
Given a student already belongs to another group
When the coordinator tries to assign the student to a new group
Then the system refuses the assignment