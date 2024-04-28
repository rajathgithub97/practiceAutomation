package pageEvents;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.HomePageElements;
import utils.ElementFetch;
public class HomePageEvents {
	
	ElementFetch ef = new ElementFetch();
	
	public void verifySuccessfulLogin() {
		Assert.assertTrue(ef.getWebElement("XPATH", HomePageElements.emailId).isDisplayed(),"Successfully logged in");
	}


	public void verifySuccessfulRegister() {
	    Assert.assertTrue(ef.getWebElement("XPATH", HomePageElements.registerResult).isDisplayed(), "Successfully registered");
	}
	
}
