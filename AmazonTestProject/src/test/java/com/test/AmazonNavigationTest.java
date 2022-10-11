package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonNavigationTest {
	 final  String siteURL = "https://www.amazon.in/";
	 final String driverPath ="C:\\\\Users\\\\91969\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe"; 
	   WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {
		 System.setProperty("webdriver.edge.driver",driverPath);
		  driver = new EdgeDriver();
		  driver.get(siteURL);
	  }

  @Test (description = "Test for Cart Link",priority = 1)

  public void TestSellersLink() throws InterruptedException {
	  WebElement CartLink = driver.findElement(By.id("nav-cart"));
	
	
	  assertEquals(CartLink.isDisplayed(), true);
	  assertEquals(CartLink.isEnabled(), true);	  
	  CartLink.click(); Thread.sleep(12000);
	 String expected = "Amazon.in Shopping Cart";
	 assertEquals(driver.getTitle(), expected);
  }
  
  @Test(description = "Address link verification",priority = 2)

  public void TestAddressLink() {
	  try {
	  WebElement addressLink = driver.findElement(By.id("nav-global-location-popover-link")); 	  
	  assertEquals(addressLink.isDisplayed(), true);
	  assertEquals(addressLink.isEnabled(), true);
	  addressLink.click();	Thread.sleep(12000);
	  //driver.getTitle();
	 
  }catch(Exception e) {
	  System.out.println(e);
  }
  }
  
  @Test(description = "Order link verification",priority = 3)

  public void TestOrderLink() {
	  try {
	  WebElement orderLink = driver.findElement(By.id("nav-orders")); 
	  assertEquals(orderLink.isDisplayed(), true);
	  assertEquals(orderLink.isEnabled(), true);
	  orderLink.click();	Thread.sleep(10000);
	  //driver.getTitle();
	  String expected = "Amazon Sign In";
	  assertEquals(driver.getTitle(), expected);


  }catch(Exception e) {
	  System.out.println(e);
  }
  }
  
  
  
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
