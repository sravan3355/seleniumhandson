Feature: verify Amazon Page

  @Amazon
  Scenario Outline: Navigate to Amazon page
    Given Load URL "<URL>"
    Then Verify Amazon page

    Examples:
      |URL|
      |https://www.amazon.ca/|

