#[JS]
@Company
Feature: Edit company

  Background: I logged In salesforce

  @CreateCompany
  Scenario: Edit company's information in company section
    Given I navigate to Profile Company page
    When I navigate to Update Company Information page
    And I edit the company information with following information
      | Name of organization | new name UNIQUE_ID                                      |
      | Name contact         | Contact Name UNIQUE_ID                                  |
      | Division             | Division UNIQUE_ID                                      |
      | Phone                | 78342849                                                |
      | Fax                  | 5551234                                                 |
      | Address              | Av.123                                                  |
      | Postal code          | 0000                                                    |
      | City                 | COCHABAMBA                                              |
      | State                | COCHABAMBA                                              |
      | Country              | BO                                                      |
      | Default locale       | ENGLISH                                                 |
      | Default timezone     | (GMT-06:00) hora estándar central (America/Mexico_City) |
      | Default language     | ENGLISH                                                 |
      | Currency locale      | inglés (Estados Unidos) - USD                           |
    Then The company information updated in the company section

