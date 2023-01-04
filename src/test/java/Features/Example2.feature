
Feature: Yahoo search
  I want to search some keyword in the yahoo
 
  Scenario: Search a keyword
    Given I open the browser for second case
    And I open the yahoo
    When I search some keyword on the yahoo
    Then I see some result pages on the yahoo 