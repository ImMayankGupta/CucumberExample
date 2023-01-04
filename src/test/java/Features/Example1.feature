
Feature: Google search
  I want to search some keyword in the google
 
  Scenario: Search a keyword
    Given I open the browser
    And I open the google
    When I search some keyword on the google
    Then I see some result pages    