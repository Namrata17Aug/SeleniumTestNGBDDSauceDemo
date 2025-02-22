Feature: Valid Login Functionality Tests with Data Table

  Background:
    Given User open Chrome
    And User open application with url "https://www.saucedemo.com"

  @DataTableImp
  Scenario: Validate user loggedin successfully with valid credential
    When User login to Application with valid credential
    |  standard_user  | secret_sauce  |
    Then User navigate to homepage

