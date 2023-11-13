package com.iNetBankingV3.testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBankingV3.pageObjects.AddCustomerPage;
import com.iNetBankingV3.pageObjects.LoginPage;


public class TC_AddCustomer_003 extends BaseClass
{
		@Test
		public void addNewCustomer() throws InterruptedException, IOException
		{
		
			
			LoginPage lp=new LoginPage(driver);
			lp.setUserName(username);
			lp.setPassword(password);
			lp.clickLogin();
			
			Thread.sleep(3000);
			
			AddCustomerPage addcust=new AddCustomerPage(driver);
			//addcust.clickAddNewCustomer();
			
			driver.navigate().to("https://demo.guru99.com/v4/manager/addcustomerpage.php");
			
			addcust.custName("Venkatesh");
			addcust.custgender("male");
			addcust.custdob("04","04","1990");
			Thread.sleep(5000);
			addcust.custaddress("INDIA");
			addcust.custcity("Hyderabad");
			addcust.custstate("Telangana");
			addcust.custpinno("5000074");
			addcust.custtelephoneno("987890091");
			
			String email=randomestring()+"@gmail.com";
			addcust.custemailid(email);
			addcust.custpassword("selenium");
			addcust.custsubmit();
			
			Thread.sleep(3000);
			
			
			
			boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
			
			if(res==true)
			{
				Assert.assertTrue(true);
				
				
			}
			else
			{
				
				Assert.assertTrue(false);
			}
				
		}
		
		
	

}

