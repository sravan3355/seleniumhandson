Feature: verify Github Page

  @Github @sanity
  Scenario Outline: Navigate to Github page
    Given Load URL "<URL>"
    Then Verify Github page

    Examples:
      |URL|
      |https://github.com/|

