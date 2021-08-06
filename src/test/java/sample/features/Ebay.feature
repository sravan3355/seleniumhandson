Feature: verify Ebay Page

  @ebay
  Scenario Outline: Navigate to Ebay page
    Given Load URL "<URL>"
    Then Verify Ebay page
    Then Verify select PreOwned
    Then Verify check CartBtn
    Then Verify select CheckOut


    Examples:
    |URL|
    |https://www.ebay.ca/|

