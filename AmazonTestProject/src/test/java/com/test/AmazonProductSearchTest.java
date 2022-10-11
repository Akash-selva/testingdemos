package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

//import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonProductSearchTest {
	 final  String siteURL = "https://www.amazon.in/";
	 final String driverPath ="C:\\\\Users\\\\91969\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe"; 
	   WebDriver driver;
	   
  @Test
  public void ProductSearchTest() {    
  WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
  assertTrue(searchBox.isDisplayed());
  assertTrue(searchBox.isEnabled());
  searchBox.sendKeys("Mac Laptop Latest");
  searchBox.submit();
  }
   
  
  @Test
  public void testForSearchProduct2() {
	  
	  WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	  assertTrue(searchBox.isDisplayed());
	  assertTrue(searchBox.isEnabled());
	  searchBox.sendKeys("Search HP Laptops");
	  searchBox.submit();
  }

  
  @Test
  public void testForSearchProduct3() {
	  
	  WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	  assertTrue(searchBox.isDisplayed());
	  assertTrue(searchBox.isEnabled());
	  searchBox.sendKeys("Search for Asus TUF");
	  searchBox.submit();
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.edge.driver",driverPath);
	  driver = new EdgeDriver();
	  driver.get(siteURL);
  }

  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
