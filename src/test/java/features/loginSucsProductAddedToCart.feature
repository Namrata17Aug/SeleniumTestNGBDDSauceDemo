Feature: Invalid Login Functionality Tests

  Background:
    Given User open Chrome
    And User open application with url "https://www.saucedemo.com"
    And User login to Application with username "standard_user" and password "secret_sauce"

  @checkout
  Scenario: End To End Flow for product purchase
    When User add product to cart
    And User go to cart
    And Click on Checkout Btn
    And User information needs to be filled with firstname "Namrata" Lastname "Kumari" and postalcode "411021"
    And Click on Continue Button
    And Click on Finish Btn
    Then Validate Order Successfull

@count
  Scenario: Add items to Cart And validate count
    When User add product to cart
    Then count on cart should match

#  @sorting
#  Scenario Verify sorting by name is working as expected
#    When click on sort button
#    And click on name Z-A link
#    Then All product should be sorted by descending alphabetically
#
  @sorting
  Scenario: Verify sorting by price low to High is working as expected
    When click on sort button
    And click on Price link LtoH
    Then All product should be sorted by price low to high

#  @sorting
#  Scenario Verify sorting by price High to Low is working as expected
#    When click on sort button
#    And click on Price(High-Low) link
#    Then All product should be sorted by price high to low





  @count
  Scenario: Add items to Cart And validate totalPrice at checkout
    When User add product to cart
    And Get Price of Individual Products
    And User go to cart
    And Click on Checkout Btn
    And User information needs to be filled with firstname "Namrata" Lastname "Kumari" and postalcode "411021"
    And Click on Continue Button
    Then Verify that sum of all prices should match total Price








