package com.iNetBankingV3.testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBankingV3.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws IOException
	{
	
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		
		
		lp.setPassword(password);
		
	
		
		lp.clickLogin();
		
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			
		}
		
		
		//Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage", "Title Not Matched");
		//log.info("Login Success...");
		
		
		
		
	}

}
