package com.test.selenium;

import org.testng.annotations.Test;

import com.test.framework.BaseTest;
import com.test.framework.Config;
import com.test.module.Account;
import com.test.module.Login;

public class TestCase2 extends BaseTest{
	
	public TestCase2() throws Exception{
		super();
	}
	
	
	Login login;
	Account account;
	
	@Test
	public void testCase2() throws Exception {
		account = new Account(driver);
		login = new Login(driver);
		driver.get(Config.getProperty("url"));
		Thread.sleep(5000);
		login.createAccount();
		login.goToHomePage();
	}
	
	
	
	
}
