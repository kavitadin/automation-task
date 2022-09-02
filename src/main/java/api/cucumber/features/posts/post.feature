Feature: Monthly Payment tab button change to $750
  This will test the Monthly payment tab button is clicked

  Scenario: Monthly Payment tab button change to $750
    Given browser is open
    When user clicks on Monthly payment button
    And user is able to change the Monthly payment amount to $750
    Then User should accept values and calculate

