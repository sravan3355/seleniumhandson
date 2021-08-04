Feature: verify Nike Page

  @Nike
  Scenario Outline: Navigate to Nike page
    Given Load URL "<URL>"
    Then Verify Nike page
    Then Verify Select Shoes Size "<size>"
    When Verify Add to Bag
    Then Verify Login check for "<username>" and "<password>"

    Examples:
      | URL                   | size |username|password|
      | https://www.nike.com/ | 8    |sdf@we.com|jsfsk |
