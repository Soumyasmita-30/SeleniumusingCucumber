Feature: Feature to test login functionality in Swag Labs

  Scenario: Validate login in Swag labs
    Given browser is launched
    And user is on Swag Labs login page
    When user enters username
    And user enters  password
    Then user is navigated to the homepage