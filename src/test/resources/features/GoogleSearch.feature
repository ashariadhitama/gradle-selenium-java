@googleSearch
Feature: Google Search
  Scenario: Open google and search for Honda
    Given Navigate to Google
    When User enters "Honda Motor" on the search box
    And User click Search
    Then Web shows the result
