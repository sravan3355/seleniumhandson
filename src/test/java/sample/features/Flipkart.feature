Feature: verify Flipkart Page

  @Flipkart @sanity
  Scenario Outline: Navigate to Flipkart page
    Given Load URL "<URL>"
    Then Verify Flipkart page

    Examples:
      |URL|
      |https://www.flipkart.com/|

