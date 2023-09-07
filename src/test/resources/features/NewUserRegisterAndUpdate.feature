Feature: New user registration and profile update feature

  @Tablet
  Scenario: Register new user account and update profile info
    Given user is on the Tablet home page
    When user selects "Register" from the homepage header navigation menu
    And user fills out the registration form with valid email,first,last name and password
    And the user submits the registration form
    Then the user should have a registered account
    And user updates their bio with new information
    And user uploads a profile image
    And the user signs out
    Then the user should be logged out and redirected to the homepage


