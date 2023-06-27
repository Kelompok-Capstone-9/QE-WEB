Feature: As a admin i want to manage online class booking so that i can see detail online class booking

  Background:
    Given admin is login
    And admin click menu class
    And admin click manage booking menu
    And admin on manage booking page

@1
  Scenario: as a admin i want to see all offline class booking
    When admin click Offline menu
    Then admin can see all offline class booking

@1
  Scenario: as a admin i want to see detail offline class booking
    When admin click Offline menu
    And admin click point three oflline
    And admin click view detail button oflline
    Then admin can see detail offline class booking
