Feature: feature to create login functionality
   
  @smoketest
  Scenario: check that login is successfull with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is validated to home page