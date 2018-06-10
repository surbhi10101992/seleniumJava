package com.test.module;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.test.po.AccountInformationPO;
import com.test.po.HomePO;
import com.test.po.LoginPO;

public class Account {

	WebDriver driver;
	HomePO homePO;
	LoginPO loginPO;
	AccountInformationPO accInfoPO;

	public Account(WebDriver driver) {
		this.driver= driver;
		homePO = new HomePO(driver);
		loginPO = new LoginPO(driver);
		accInfoPO = new AccountInformationPO(driver);
	}

	public void fillAccountDetails(String fname, String lname, String phone, String gender) throws InterruptedException {
		Thread.sleep(3000);
		homePO.clickBtnMyAccount();
		homePO.clickBtnMyAcc();
		accInfoPO.enterTxtFirstName(fname);
		accInfoPO.enterTxtLastName(lname);
		accInfoPO.enterTxtPhone(phone);
		accInfoPO.selectGender(gender);
		accInfoPO.clickBtnSubmit();
	}
	
	public void validateAccount(String expName) {
		String actName = homePO.getTextLblAccName();
		Assert.assertEquals(actName.replace("Hi ",""),expName);
	}
}
