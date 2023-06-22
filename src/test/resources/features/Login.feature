Feature: As a admin i want to login so that i can see home page

  @Login-1
  Scenario: As a admin i success login with input valid email and valid password
    Given admin on login page
    When admin input valid email
    And admin input valid password
    And admin click login button
    Then admin on home page successfully

  @Login-2
  Scenario: As a admin i failed login with input empty email and valid password
    Given admin on login page
    When admin input empty email
    And admin input valid password
    And admin click login button
    Then admin see alert error message

  @Login-3
  Scenario: As a admin i failed login with input invalid email and valid password
    Given admin on login page
    When admin input invalid email
    And admin input valid password
    And admin click login button
    Then admin see alert error message

  @Login-4
  Scenario: As a admin i failed login with input valid email and empty password
    Given admin on login page
    When admin input valid email
    And admin input empty password
    And admin click login button
    Then admin see alert error message

  @Login-5
  Scenario: As a admin i failed login with input valid email and invalid password
    Given admin on login page
    When admin input valid email
    And admin input invalid password
    And admin click login button
    Then admin see alert error message

  @Login-6
  Scenario: As a admin i failed login with input empty email and empty password
    Given admin on login page
    When admin input empty email
    And admin input empty password
    And admin click login button
    Then admin see alert error message