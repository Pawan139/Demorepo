package Homepage;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class Homepage extends TestBase
{
	@FindBy(xpath="//a[contains(text(),'Add Customer')]")
	WebElement addcustomerlink;
	
	@FindBy(xpath="//div[@id='dismiss-button']")
	WebElement addvertismentlinkcross;
	
	@FindBy(xpath="//a[contains(text(),'Bank Project')]")
	WebElement Banklink;
	
	@FindBy(xpath="//a[contains(text(),'Payment Gateway Project')]")
	WebElement paymentgatewaylink;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String Telecome() 
	{
	
		String addcustomerlinktext=addcustomerlink.getText();
		addcustomerlink.click();
		
		return addcustomerlinktext;
	}
	
	public String Bank() 
	{
		Banklink.click();
		return driver.getTitle();
	
		
	}
	
	public String Guru99_Payment_Gateway() 
	{
		paymentgatewaylink.click();
		return driver.getTitle();
	
		
	}
	
	
	public void quit() {
		
		driver.quit();
	}
	
}
