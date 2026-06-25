@api
Feature: API Testing

  Scenario: Get list users
    Given user requests GET list users
    Then API response status should be 200
    And response should contain user data