Feature: As a admin i want to manage offline classes so that i can see offline classes

  Background:
    Given admin is login
    And admin click class menu
    And admin click offline classes menu
    And admin on offline classes page

  @ManageOffline-6
  Scenario: As a admin i want to add new location
    When admin click location button
    And admin on location page
    And admin click add location button
    And admin input name field
    And admin input city field
    And admin input address field
    And admin input latitude field
    And admin input longitude field
    And admin click submit button
    Then admin successfully add new location

  @ManageOffline-7
  Scenario: As a admin i want to delete location
    When admin click location button
    And admin on location page
    And admin click delete location icon
    Then admin successfully delete location

  @ManageOffline-8
  Scenario: As a admin i want to edit location
    When admin click location button
    And admin on location page
    And admin click edit location icon
    And admin input field to edit location
    And admin click submit button
    Then admin can see location edited