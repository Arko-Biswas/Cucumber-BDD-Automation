@User_Registration
Feature: User Registration

  Scenario: User registration with different data
    Given User is on registration page
    When User enters following user details
      | arko | automation | arko@gmail.com  | 99999999 | Pune   |
      | tom  | cucumber   | tom@gmail.com   |  6666666 | Mumbai |
      | lisa | selenium   | harry@gmail.com | 33333333 | London |
    Then User registration should be successful

  Scenario: User registration with different data with columns
    Given User is on registration page
    When User enters following user details with columns
      | firstname | work       | email           | phone    | city   |
      | arko      | automation | arko@gmail.com  | 99999999 | Pune   |
      | tom       | cucumber   | tom@gmail.com   |  6666666 | Mumbai |
      | lisa      | selenium   | harry@gmail.com | 33333333 | London |
    Then User registration should be successful
