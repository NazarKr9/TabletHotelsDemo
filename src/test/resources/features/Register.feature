Feature: New user registration feature

  @newUserCreation
  Scenario: Register new user account
    Given user is on the Tablet home page
    When user selects "Register" from the homepage header navigation menu
    And user fills out the registration form with valid email,first,last name and password
    And the user submits the registration form
    Then the user should have a registered account