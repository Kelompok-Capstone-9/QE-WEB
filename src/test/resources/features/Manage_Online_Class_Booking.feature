Feature: As a admin i want to manage online class booking so that i can see detail online class booking

  Background:
    Given admin is login
    And admin click menu class
    And admin click manage booking menu
    And admin on manage booking page

  @BookingOnline-1
  Scenario: as a admin i want to see all online class booking
    When admin click online menu
    Then admin can see all online class booking

  @BookingOnline-2
  Scenario: as a admin i want to see detail online class booking
    When admin click online menu
    And admin click point three
    And admin click view detail button
    Then admin can see detail online class booking
