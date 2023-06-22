Feature: As a user i want to login so that i can see home page

  @Login-1
  Scenario: As a user i success login with input valid email and valid password
    Given user on login page
    When user input valid email
    And user input valid password
    And user click login button
    Then user on home page successfully

  @Login-2
  Scenario: As a user i failed login with input empty email and valid password
    Given user on login page
    When user input empty email
    And user input valid password
    And user click login button
    Then user see alert error message

  @Login-3
  Scenario: As a user i failed login with input invalid email and valid password
    Given user on login page
    When user input invalid email
    And user input valid password
    And user click login button
    Then user see alert error message

  @Login-4
  Scenario: As a user i failed login with input valid email and empty password
    Given user on login page
    When user input valid email
    And user input empty password
    And user click login button
    Then user see alert error message

  @Login-5
  Scenario: As a user i failed login with input valid email and invalid password
    Given user on login page
    When user input valid email
    And user input invalid password
    And user click login button
    Then user see alert error message

  @Login-6
  Scenario: As a user i failed login with input empty email and empty password
    Given user on login page
    When user input empty email
    And user input empty password
    And user click login button
    Then user see alert error message