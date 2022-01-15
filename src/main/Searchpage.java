package Searchpage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import TestBase.TestBase;

public class Searchpage extends TestBase
{
	
	public Searchpage() {
		PageFactory.initElements(driver, this);
	}

public String  Stringchecking() 
{
String pawan="pawan";
if(pawan.contains("wa"))
		{
	System.out.println("we are good");
		}
return pawan;

}
}


