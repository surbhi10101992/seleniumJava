package com.test.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.Action;

public class HomePO extends Action {
	
	WebDriver driver;
	
	public HomePO(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath="(//div[@id='user-info-top']//a)[1]")
	private WebElement btnMyAccount;

	@FindBy(xpath="//li/a[@href='/control/login.php']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//li/a[@href='/control/myaccount.php']")
	private WebElement btnMyacc;
	
	@FindBy(xpath="//div[@id='user-info-top']//span")
	private WebElement lblAccName;
	
	public void clickBtnMyAccount() {
		onClick(btnMyAccount);
	}
	
	public void clickBtnLogin() {
		onClick(btnLogin);
	}
	
	public void clickBtnMyAcc() {
		onClick(btnMyacc);
	}
	
	public String getTextLblAccName() {
		return getValue(lblAccName);
	}
	
}
