Feature: verify Ebay Page

  @ebay
  Scenario Outline: Navigate to Ebay page
    Given Load URL "<URL>"
    Then Verify Ebay page

    Examples:
    |URL|
    |https://www.ebay.ca/|

