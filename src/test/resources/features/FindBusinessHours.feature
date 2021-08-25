
@regression
Feature: FindBusinessHours

  Scenario Outline: Verify that user can successfully locate business hours for WW Studios and Meetings near them
    Given that user navigates to workshop search page
    When user clicks on studio tab for find your workshop cta
    And enters <zipcode> in search field
    And clicks on go arrow
    Then user should get results for meetings in <zipcode>
    When user clicks on first search result
    Then user is redirected to correct studio workshop details page
    When user clicks on business hours drop down
    Then user should see full weekly business hours schedule
		Examples: 
		| zipcode | 
		| 10011   |	
		
