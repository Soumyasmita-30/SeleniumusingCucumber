Feature: Feature to test login functionality in Swag Labs

  Scenario Outline: Validate login in Swag labs
    Given browser is launched
    And user is on Swag Labs login page
    When user enters <username>
    And enters <password>
    Then user is navigated to the homepage
    Examples:
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | hello        |
      | problem_user    | hi           |
      | glitch_user     | cucumber     |
      | standard_user   | secret_sauce |
