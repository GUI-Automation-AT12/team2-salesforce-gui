#[JS]
@Task
Feature: Create task

  Background: I logged In salesforce

  @CreateTask
  Scenario: Create task in new task section section
    Given I navigate to Task option
    When I navigate to task pop page
    And I add the task information with following information
      | Matter           | NewTask UNIQUE_ID                                       |
      | Expiration Date  | TOMORROW                                                |
      | Name             | Candidate- New Name UNIQUE_ID                           |
      | Related to       | Opportunity- New Opportunity UNIQUE_ID                  |
      | Assigned to      | Jhordan Soto                                            |
      | State            | In Progress                                             |
    Then The task information should be displayed in the task table