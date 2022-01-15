package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import ExtentReportListener.ExtentReporterNG;

import TestUtil.TestUtil;
import TestUtil.WebEventListener;



public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
public static WebEventListener eventListener;
	public static void initialization(){
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pawan\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver(); 
			
			e_driver = new EventFiringWebDriver(driver);
			 //Now create object of EventListerHandler to register it with EventFiringWebDriver
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver = e_driver;
		
		
		driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/telecom/index.html");
		
	}
	
}
