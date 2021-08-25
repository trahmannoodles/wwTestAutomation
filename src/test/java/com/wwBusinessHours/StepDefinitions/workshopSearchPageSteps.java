package com.wwBusinessHours.StepDefinitions;

import com.wwBusinessHours.pages.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class workshopSearchPageSteps {
	
	public BaseClass baseClass = new BaseClass();
	public workshopSearchPage searchPage = new workshopSearchPage();
	public workshopDetailsPage detailsPage = new workshopDetailsPage();
	
    @Before
    public void setup(){
        baseClass.setDriver();
    }

    @After
    public void teardown(){
    	baseClass.closeDriver();
    }
	
    @Given("^that user navigates to workshop search page$")
    public void that_user_navigates_to_workshop_search_page() throws Throwable {
    	searchPage.navigateToSearchPage();
    }

    @When("^user clicks on studio tab for find your workshop cta$")
    public void user_clicks_on_studio_tab_for_find_your_workshop_cta() throws Throwable {
    	searchPage.clickTab();
//    	if(searchPage.getWorkshopStudioOption().isEnabled()) {
//    		searchPage.getWorkshopStudioOption().click();
//    	};
    }
    
    @And("^enters (.+) in search field$")
    public void enters_in_search_field(String zipcode) throws Throwable {

    }
    
    @And("^clicks on go arrow$")
    public void clicks_on_go_arrow() throws Throwable {
        
    }
    
    @Then("^user should get results for meetings in (.+)$")
    public void user_should_get_results_for_meetings_in(String zipcode) throws Throwable {

    }
    
    @When("^user clicks on first search result$")
    public void user_clicks_on_first_search_result() throws Throwable {

    }
}