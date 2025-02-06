Feature: verifying omr branch login module

  Scenario Outline: verifying omr branch login with valid credentials
    Given user is on the omrbranch page
    When use enters the "<userName>" and "<password>"
    And user click the login button
    Then user should verify after login success message

    Examples: 
      | userName                 | password  |
      | jagadeeshmech7@gmail.com | jaga12345 |
