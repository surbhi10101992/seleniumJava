package com.test.selenium;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.framework.BaseTest;
import com.test.framework.Config;
import com.test.framework.DataProviders;
import com.test.module.Account;
import com.test.module.Login;

public class TestCase1 extends BaseTest{
	
	public TestCase1() throws Exception{
		super();
	}
	
	Login login;
	Account account;
	
	@Test(dataProvider = "testData", dataProviderClass = DataProviders.class)
	public void testCase1(HashMap<String,String> map) throws Exception {
		account = new Account(driver);
		login = new Login(driver);
		driver.get(Config.getProperty("url"));
		Thread.sleep(5000);
		login.createAccount(map.get("email"),map.get("password"),map.get("rePassword"));
		account.fillAccountDetails(map.get("fname"),map.get("lname"),map.get("phone"),map.get("gender"));
		login.goToHomePage();
		account.validateAccount(map.get("fname"));
	}
	
	
	
	
	
}
