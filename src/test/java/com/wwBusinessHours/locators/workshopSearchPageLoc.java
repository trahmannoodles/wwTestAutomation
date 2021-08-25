package com.wwBusinessHours.locators;

public interface workshopSearchPageLoc{
	//Find your workshop CTA
	String WORKSHOP_STUDIO_OPTION = "//*[@class='studioIcon-2TdMR']";
	String ZIPCODE_INPUT = "//*[@id='location-search']";
	String SEARCH_ARROW = "//button[@id='location-search-cta']";
	String FIRST_RESULT = "//*[@id=\"location-1252089\"]/a";
}