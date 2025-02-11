Feature: Invalid Login Functionality Tests

  Background:
    Given User open Chrome
    And User open application with url "https://www.saucedemo.com"

  @NegLogin
  Scenario Outline: Validate error msg for username and password
    When User login to Application with username "<username>" and password "<password>"
    Then User validate "<errMsg>"


    Examples:
      |username|password|errMsg|
      |             |secret_sauce|Epic sadface: Username is required|
      |standard_user|            |Epic sadface: Password is required|
      |             |            |Epic sadface: Username is required|
      |yutrfgtyu    |y67890ii    |Epic sadface: Username and password do not match any user in this service|
