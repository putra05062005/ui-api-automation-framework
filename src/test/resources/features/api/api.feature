@api
Feature: API Automation Testing

  Scenario: Get list users
    Given user requests GET list users
    Then API response status should be 200
    And response should contain user data

  Scenario: Get user by ID
    Given user requests GET user with id 1
    Then API response status should be 200
    And response should contain user id 1

  Scenario: Create new user
    Given user creates a new user
    Then API response status should be 201
    And response should contain created user

  Scenario: Update user
    Given user updates user with id 1
    Then API response status should be 200
    And response should contain updated user

  Scenario: Delete user
    Given user deletes user with id 1
    Then API response status should be 200