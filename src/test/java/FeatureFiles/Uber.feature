@For_All_Scenario
Feature: Uber Booking Feature

  @InSprint
  Scenario: Booking Cab: Sedan
    Given User wants to select a car type "sedan" from the app
    When User selects car type "sedan" and pick up point "Banglore" and drop point "Pune"
    Then Driver starts journey
    When driver ends journey
    Then user pays 200 USD for the car type "sedan" ride

  @Regression
  Scenario: Booking Cab: SUV
    Given User wants to select a car type "sedan" from the app
    When User selects car type "sedan" and pick up point "Hyderabad" and drop point "Pune"
    Then Driver starts journey
    When driver ends journey
    Then user pays 200 USD for the car type "sedan" ride

  @Sanity @Regression
  Scenario: Booking Cab: HatchBack
    Given User wants to select a car type "sedan" from the app
    When User selects car type "sedan" and pick up point "Mumbai" and drop point "Pune"
    Then Driver starts journey
    When driver ends journey
    Then user pays 200 USD for the car type "sedan" ride
