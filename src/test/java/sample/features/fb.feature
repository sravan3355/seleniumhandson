Feature: Validating Diffrent URL Page


  @fb
  Scenario Outline: Navigate to FB page
    Given Load URL "<URL>"
    Examples:
      |URL|
      | https://www.facebook.com/|

  @google
  Scenario Outline: Navigate to google page
    Given Load URL "<URL>"
    Examples:
      |URL|
      | https://www.google.com/|

  @amazon
  Scenario Outline: Navigate to Amazon page
    Given Load URL "<URL>"
    Then Validate the Amazon Links

    Examples:
      |URL|
      | https://www.amazon.ca/|

  @carguru
  Scenario Outline: verify saved searches
    Then Load URL "<URL>"
    Then validated Saved Search

    Examples:
      |URL|
      | https://www.cargurus.ca/?pid=countryPicker.com/|

