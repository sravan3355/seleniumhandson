Feature: verify Collins Page

  @Collins
  Scenario Outline: Navigate to Collins page
    Given Load URL "<URL>"
    Then Validate Collins Link
    Then Select Share
    Then click Forgot Account




    Examples:
      |URL|
      |https://www.collinsdictionary.com/|
