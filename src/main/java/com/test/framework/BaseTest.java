package com.test.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseTest extends Config{
	
	public static WebDriver driver = null ;
	
	public BaseTest() throws Exception {
		super("conf01");
		
		if(Config.getProperty("browser").equalsIgnoreCase("Chrome")) {
			String path = System.getProperty("user.dir")+"\\Tools\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",path);
		} else if(Config.getProperty("browser").equalsIgnoreCase("IE")) {
			String path = System.getProperty("user.dir")+"\\Tools\\ieDriver.exe";
			System.setProperty("webdriver.ie.driver",path);
		} else {
			System.out.println("Browser not recognizaed... Running on Chrome....");
			String path = System.getProperty("user.dir")+"\\Tools\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",path);
		}
		
		if(driver == null) { 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	@AfterClass
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
	}
	
	@AfterSuite
	public void afterSuite() {
		driver.close();
	}
	

}
