Feature: User account update feature

  Scenario: Update user bio and sign out
    Given user is logged in and on the user's account page
    When user updates their bio with new information
    And user uploads a profile image
    And the user signs out
    Then the user should be logged out and redirected to the homepage
