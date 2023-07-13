@Apple
Feature: Amazon Search Product

  @Prod
  Scenario: Search A Product MacBook
    Given I have a search field on Amazon Page
    When I search for a product with name "Apple MacBook Pro" and the price 1200
    Then Product with name "Apple MacBook Pro" should be displayed to me

  Scenario: Search A Product iPad
    Given I have a search field on Amazon Page
    When I search for a product with name "Apple iPad Pro M2" and the price 999
    Then Product with name "Apple iPad Pro M2" should be displayed to me
