@Amazon
Feature: Amazon Order Page
  In order to check my order details 
  As a registered user
  I want to specify the features of order details page

  ##Example with Bagkground keyword
  Background: 
    Given I am a registered user
    Given I am on Amazon login page
    When I enter my username
    And I enter my password
    Then I click on login button
    And I navigate to order page

  Scenario: Check previous order details
    When I click on order link
    Then I check the previous order details

  Scenario: Check open order details
    When I click on open order link
    Then I check the open order details

  Scenario: Check cancelled order details
    When I click on cancelled order link
    Then I check the cancelled order details
