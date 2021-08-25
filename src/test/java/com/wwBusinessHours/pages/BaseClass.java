package com.wwBusinessHours.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    public static void setDriver(){
        System.setProperty("webdriver.chrome.driver","macDriver/chromedriver");
        driver = new ChromeDriver();
    }

    public static void closeDriver(){
        driver.quit();
    }
    
}
