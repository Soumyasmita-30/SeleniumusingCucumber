Feature: Multiple Run of the when annotation
  Scenario Outline: test for datatable
    When I type the following names
    | name | nameID |
    | "Sneha" | "name1" |
    | "Rudra" | "name2" |
    | "Soumya" | "name3" |
    | "Swathi" | "name4" |
    And I click on OK button
    Then I should see some <name>
    Examples:
    | name |
    | Java |

