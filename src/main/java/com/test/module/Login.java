package com.test.module;

import org.openqa.selenium.WebDriver;

import com.test.po.AccountInformationPO;
import com.test.po.HomePO;
import com.test.po.LoginPO;
import com.test.utils.Utility;

public class Login {

	WebDriver driver;
	HomePO homePO;
	LoginPO loginPO;
	AccountInformationPO accInfoPO;

	public Login(WebDriver driver) {
		this.driver= driver;
		homePO = new HomePO(driver);
		loginPO = new LoginPO(driver);
		accInfoPO = new AccountInformationPO(driver);
	}

	public void createAccount() {
		homePO.clickBtnMyAccount();
		homePO.clickBtnLogin();
		loginPO.enterTxtEmailAdress("Test"+ Utility.randomNumber() +"@gmail.com");
		loginPO.enterTxtPassword("happy");
		loginPO.EnterTxtReEnterPassword("happy");
		loginPO.clickBtnCreateAccount();
	}
	
	public void goToHomePage() throws InterruptedException {
		Thread.sleep(3000);
		accInfoPO.clickImgLogo();
	}
	
}
