package com.wwBusinessHours.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wwBusinessHoursAutomation.locators.*;

public class workshopSearchPage extends BaseClass implements workshopSearchPageLoc{
	
	//Start WebElement getters/setters
	
	@FindBy(xpath = WORKSHOP_STUDIO_OPTION)
	private WebElement workshopStudioOption;
	
	public WebElement getWorkshopStudioOption(){
		return workshopStudioOption;
	}
	
	@FindBy(xpath = ZIPCODE_INPUT)
	private WebElement zipcodeInput; 
	
	public WebElement getZipcodeInput() {
		return zipcodeInput; 
	}
	
	@FindBy(xpath = SEARCH_ARROW)
	private WebElement searchArrow; 
	
	public WebElement getSearchArrow() {
		return searchArrow;
	}
	
	@FindBy(xpath = FIRST_RESULT)
	private WebElement firstResult;
	
	public WebElement getFirstResult() {
		return firstResult;
	}
	
	//End WebElement getters/setters
	
	public static void navigateToSearchPage(){
	    driver.get("https://www.weightwatchers.com/us/find-a-workshop");
	//    driver.manage().window().maximize();
	
	    driver.manage().timeouts().implicitlyWait(240,TimeUnit.SECONDS);
	    
	    Assert.assertEquals(driver.getTitle().replaceAll("[^a-zA-Z0-9]", " "), "Find WW Studios & Meetings Near You | WW USA".replaceAll("[^a-zA-Z0-9]", " "));
	}
}