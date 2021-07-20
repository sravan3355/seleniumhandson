Feature: CarGurus Validation

  @carguru
  Scenario Outline: verify saved searches
    Then Load URL "<URL>"
    Then validated Saved Search

    Examples:
    |URL|
    | https://www.cargurus.ca/?pid=countryPicker.com/|


