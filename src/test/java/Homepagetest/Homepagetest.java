package Homepagetest;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import Homepage.Homepage;
import TestBase.TestBase;
public class Homepagetest extends TestBase
{
	
	Homepage homepage;

	Logger log=Logger.getLogger(Homepagetest.class);
	@BeforeSuite
	public void setUp() {
		initialization();
		homepage = new Homepage();
		
	}
	@Test(priority=1)
	public void homepage() 
	{
		String homePageTitle = homepage.Telecome();
		log.info("entering the url");
		System.out.println(homePageTitle);
		String Expectedtitle="Add Customer";
		Assert.assertEquals(homePageTitle, Expectedtitle);
	}
	@Test(priority=2)
	public void bankpagetitle() 
	{
		String bankPageTitle = homepage.Bank();
		System.out.println(bankPageTitle);
		String Expectedtitle="GTPL Bank Home Page";
		Assert.assertEquals(bankPageTitle, Expectedtitle);
	}
	
	@Test(priority=3)
	public void paymentgateway() 
	{
		String guru99pagePageTitle = homepage.Guru99_Payment_Gateway();
		System.out.println(guru99pagePageTitle);
		String Expectedtitle="Guru99 Payment Gateway";
		Assert.assertEquals(guru99pagePageTitle, Expectedtitle);
	}
	
	
	
	
	@AfterSuite
	public void quit() 
	{
		log.warn("hey this is just a warning  the browser closing ");
		homepage.quit();
	}

}
