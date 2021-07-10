Feature: Autotrader test


  Scenario: Testing autotrader
    Given User is on the landing page
    Then Verify that "Search by Budget" is present
    Then Verify that "Browse by Style" is present
    Then Verify that "Advanced Search" is present
    And Verify that "Search" button is present
    Then Verify that "Any Make" is visible
    Then Verify that "Any Model" is visible

  @wip
  Scenario: Testing advance search link
    Given User is on the landing page
    When Click on "Advanced Search" on the landing page
    Then User enter "30004" in the zip code text box
    Then User select the "Manufacturer Certified" check box under "Condition"
    Then User select the "Convertible" check box under "Style"
    Then User update year "2017" to "2020"
    Then User select "BMW" car from Make,Model and trim
    Then User click on "Search" button
    Then Verify that listing on the next page
    Then Verify that only "BMW" are on the results
    Then Display in console, the number of cars listed in result page