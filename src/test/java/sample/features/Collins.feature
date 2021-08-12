Feature: verify Collins Page

  @Collins @smoke
  Scenario Outline: Navigate to Collins page
    Given Load URL "<URL>"
    Then Validate Collins Link
    Then Select Share
    Then click Forgot Account
    Then click Share Close




    Examples:
      |URL|
      |https://www.collinsdictionary.com/|
