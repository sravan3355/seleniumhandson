Feature: verify Youtube Page

  @Youtube @sanity
  Scenario Outline: Navigate to Youtube page
    Given Load URL "<URL>"
    Then Verify Youtube page

    Examples:
      |URL|
      |https://www.youtube.com/|

