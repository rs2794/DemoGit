Feature: Test login functionality

  Scenario Outline: check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to home page

    Examples: 
      | username      | password |
      | abc@gmail.com |    12345 |
