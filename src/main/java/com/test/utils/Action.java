package com.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {
	
	WebDriver driver ;
	WebDriverWait wait ;
	
	public Action(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,10);
	}
	
	public void selectDropDown(WebElement element, String option) {
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select = new Select(element);
		select.selectByVisibleText(option);
	}

	
	public void onClick(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public void enter(WebElement element, String value) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public String getValue(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}
	
	
	
	
	
}
