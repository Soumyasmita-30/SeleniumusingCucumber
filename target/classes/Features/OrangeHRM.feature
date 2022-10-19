Feature: Feature to test login functionality in Orange HRM

  Scenario Outline: Validate login in Orange HRM
    Given browser is launched
    And user is on Orange HRM login page
    When user enters <Username>
    And enters <Password>
    Then user is navigated to homepage
    Examples:
      | Username | Password |
      | Admin    | admin123 |
      | Admin    | admin123 |
      | browser  | anything |
      | soumya   | hiii     |
      | Admin    | admin123 |
