package com.test.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.Action;

public class AccountInformationPO extends Action{

	WebDriver driver = null;

	
	public AccountInformationPO(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}	
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="phone")
	private WebElement txtPhone;
	
	@FindBy(id="gender")
	private WebElement selectGender;
	
	@FindBy(xpath="//*[contains(@id,'changePassword_0')]")
	private WebElement btnSubmit;
	
	@FindBy(xpath="//img[contains(@src,'/assets/images/logo.png')]")
	private WebElement imgLogo;
	
	
	public void enterTxtFirstName(String fnName) {
		enter(txtFirstName,fnName);
	}
	
	public void enterTxtLastName(String lnName) {
		enter(txtLastName,lnName);
	}
	
	public void enterTxtPhone(String phno) {
		enter(txtPhone,phno);
	}
	
	public void clickBtnSubmit() {
		onClick(btnSubmit);
	}
	
	public void clickImgLogo() {
		onClick(imgLogo);
	}
	
	public void selectGender(String gender) {
		selectDropDown(selectGender, gender);
	}
	
	
	
	
	
	
}
