#[JS]
@User
Feature: Edit User information

  Background: I logged In salesforce

  @UpdateUser
  Scenario: Edit profile's information in profile section
    Given I navigate to Profile page
    When I navigate to Update Profile Information
    And I edit the Profile information with following information
      | Name             | new name UNIQUE_ID                                      |
      | Last Name        | Contact Name UNIQUE_ID                                  |
      | Alias            | Division UNIQUE_ID                                      |
      | Email            | 78342849                                                |
      | UserName         | 5551234                                                 |
      | NickName         | Av.123                                                  |
      | Charge           | 0000                                                    |
      | Company          | COCHABAMBA                                              |
      | Apartment        | COCHABAMBA                                              |
      | Division         | BO                                                      |
      | User License     | Chatter Free                                            |
      | Profile          | Chatter Free User                                       |
      | Email encryption | Unicode (UTF-8)                                         |
      | Default locale   | ENGLISH                                                 |
      | Default timezone | (GMT-06:00) hora estándar central (America/Mexico_City) |
      | Language         | ENGLISH                                                 |
      | Currency locale  | english (Estados Unidos) - USD                          |
    Then The user information should be updated in the user section
