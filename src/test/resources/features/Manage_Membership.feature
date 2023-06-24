Feature: As a admin i want to manage membership so that i can see membership plan

  Background:
    Given admin is login
    And admin click membership menu
    And admin on membership page

  @Membership-1
  Scenario: As a admin i want to add membership plan
    When admin click add membership plan button
    And admin input title field
    And admin input duration field
    And admin input price field
    And admin input description field
    And admin click button submit
    Then admin successfully add membership plan

  @Membership-2
  Scenario: As a admin i want to edit membership plan
    When admin click edit membership plan icon
    And admin input field to edit membership plan
    And admin click button submit
    Then admin successfully edit membership plan

  @Membership-3
  Scenario: As a admin i want to delete membership plan
    When admin click delete membership plan icon
    Then admin successfully delete membership plan