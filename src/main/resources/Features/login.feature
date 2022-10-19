#Author : Soumya
# Date : 30/09/2022
  # Description : Feature File
Feature:feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When  user enters username and password
    And clicks on login button
    Then user is navigated to the homepage
