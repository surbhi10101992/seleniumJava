package com.test.selenium;

import org.testng.annotations.Test;

import com.test.framework.BaseTest;
import com.test.framework.Config;
import com.test.module.Account;
import com.test.module.Login;

public class TestCase1 extends BaseTest{
	
	public TestCase1() throws Exception{
		super();
	}
	
	Login login;
	Account account;
	
	@Test
	public void testCase1() throws Exception {
		account = new Account(driver);
		login = new Login(driver);
		driver.get(Config.getProperty("url"));
		Thread.sleep(5000);
		login.createAccount();
		account.fillAccountDetails();
		login.goToHomePage();
		account.validateAccount("Ajay");
	}
	
	
	
	
	
}
