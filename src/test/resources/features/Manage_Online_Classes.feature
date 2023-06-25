Feature: As a admin i want to manage online class so that i can see online class

  Background:
    Given admin is login
    And admin click class menu
    And admin click online class menu
    And admin on online classes page

  @ManageOnline-1
  Scenario: As a admin i want to add new online class
    When admin click add online class button
    And admin input class name
    And admin input link zoom
    And admin input started at
    And admin input class description
    And admin click add class submit button
    Then admin successfully add new online class

  @ManageOnline-2
  Scenario: As a admin i want to delete online class
    When admin click delete online class button
    Then admin successfully delete online class

  @ManageOnline-3
  Scenario: As a admin i want to edit online class
    When admin click edit online class icon
    And admin input online class field to edit
    And admin click edit class submit button
    Then admin successfully edit new online class

  @ManageOnline-4
  Scenario: As a admin i want to search online class with valid keyword
    When admin click search box
    And admin input valid keyword
    Then admin can see online class according to keyword

  @ManageOnline-5
  Scenario: As a admin i want to search online class with invalid keyword
    When admin click search box
    And admin input invalid keyword
    Then admin see "No data available" message

  @ManageOnline-7
  Scenario: As a admin i want to delete online class package
    When admin click package button
    And admin on class package page
    And admin click delete class package icon
    Then admin successfully delete online class package

  @ManageOnline-8
  Scenario: As a admin i want to edit online class package
    When admin click package button
    And admin on class package page
    And admin click edit class package icon
    And admin input field to edit class package
    And admin click package submit button
    Then admin can see online class package edited

  @ManageOnline-6
  Scenario: As a admin i want to add new online class package
    When admin click package button
    And admin on class package page
    And admin click add package button
    And admin input package page
    And admin select online class
    And admin select period
    And admin input price
    And admin click class package submit button
    Then admin successfully add new online class package