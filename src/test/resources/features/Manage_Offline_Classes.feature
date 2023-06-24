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

  @ManageOffline-2
  Scenario: As a admin i want to delete class
    When admin click delete class icon
    Then admin successfully delete class

  @ManageOffline-3
  Scenario: As a admin i want to edit class
    When admin click edit class icon
    And admin input field to edit class
    And admin click class submit button
    Then admin can see class edited

  @ManageOffline-4
  Scenario: As a admin i want to search offline class with valid keyword
    When admin click search box
    And admin input valid keyword
    Then admin can see offline class according to keyword

  @ManageOffline-5
  Scenario: As a admin i want to search offline class with invalid keyword
    When admin click search box
    And admin input invalid keyword
    Then admin see "No data available" message

  @ManageOffline-9
  Scenario: As a admin i want to add new class package
    When admin click package button
    And admin on class package page
    And admin click add package button
    And admin select class
    And admin select period
    And admin input price field
    And admin click class package submit button
    Then admin successfully add new class package

  @ManageOffline-10
  Scenario: As a admin i want to delete class package
    When admin click package button
    And admin on class package page
    And admin click delete class package icon
    Then admin successfully delete class package

  @ManageOffline-11
  Scenario: As a admin i want to edit class package
    When admin click package button
    And admin on class package page
    And admin click edit class package icon
    And admin input field to edit class package
    And admin click package submit button
    Then admin can see class package edited

  @ManageOffline-1
  Scenario: As a admin i want to add new offline class
    When admin click add class button
    And admin input class name
    And admin select location
    And admin input started at
    And admin input class description
    And admin click add class submit button
    Then admin successfully add new offline class