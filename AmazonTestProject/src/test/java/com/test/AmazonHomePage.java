package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonHomePage {
	 final  String siteURL = "https://www.amazon.in/";
	 final String driverPath ="C:\\\\Users\\\\91969\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe"; 
	   WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.edge.driver",driverPath);
		  driver = new EdgeDriver();
		  driver.get(siteURL);
		
	  }
	
  @Test
  public void HomePageTitleVerify() {
	  String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
      assertEquals(expectedTitle,driver.getTitle());
  }
  
  @Test
  public void testUrl() {
	//Perform Test Evaluation
      assertEquals(siteURL,driver.getCurrentUrl());
  }
  

  @AfterMethod
  public void afterMethod() {
	     driver.close();
  }

}
