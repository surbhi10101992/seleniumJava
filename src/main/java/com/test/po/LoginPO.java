package com.test.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.Action;

public class LoginPO extends Action{

WebDriver driver;
	
	public LoginPO(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}	
	
	@FindBy(id="reg_username")
	private WebElement txtEmailAdress;
	
	@FindBy(id="reg_pwd")
	private WebElement txtPassword;
	
	@FindBy(id="reg_conpwd")
	private WebElement txtReEnterPassword;
	
	@FindBy(xpath="//button[contains(@id,'addCustomer_0')]")
	private WebElement btnCreateAccount;
	
	public void enterTxtEmailAdress(String email) {
		enter(txtEmailAdress,email);
	}
	
	public void enterTxtPassword(String pswd) {
		enter(txtPassword,pswd);
	}
	
	public void EnterTxtReEnterPassword(String pswd) {
		enter(txtReEnterPassword,pswd);
	}
	
	public void clickBtnCreateAccount() {
		onClick(btnCreateAccount);
	}
}
