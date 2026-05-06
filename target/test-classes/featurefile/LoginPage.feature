Feature: Login functionality

  Scenario: Valid login
    Given User is on login page
    When User enters "<username>" and "<password>"
    And Click Login
    Then Close Browser
    
    @regression
  Scenario Outline: Valid login
    Given User is on login page
    When User enters "<username>" and "<password>"
    And Click Login
    Then Close Browser
    
    Examples:
    | username | password |
    | Admin | admin123    |
    | Admin    | admin123    |