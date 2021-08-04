Feature: verify Zoom Page

  @Zoom @sanity
  Scenario Outline: Navigate to Zoom page
    Given Load URL "<URL>"
    Then Verify Zoom page

    Examples:
      |URL|
      |https://zoom.us/|

