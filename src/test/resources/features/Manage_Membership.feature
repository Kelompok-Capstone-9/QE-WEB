Feature: As a admin i want to manage membership so that i can see membership plan

  Background:
    Given admin on home page
    And admin click membership menu

  @Membership-2
  Scenario: As a admin i want to edit membership plan
    When admin
    And user input valid password
    And user click login button
    Then user on home page successfully