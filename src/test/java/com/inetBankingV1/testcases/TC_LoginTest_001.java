package com.inetBankingV1.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.inetBankingV1.pageobjects.LoginPage;



public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		if(driver.getTitle().equals("Guru99 Bank manager Homepage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	

}
