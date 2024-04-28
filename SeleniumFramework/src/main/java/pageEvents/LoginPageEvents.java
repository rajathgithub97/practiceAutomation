package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {

	ElementFetch ef = new ElementFetch();
	
	public void verifyLoginPageLoad() {
		
	Assert.assertTrue(ef.getWebElements("XPATH", LoginPageElements.loginText).size()>0, "Element not found");
	}
	
	public void enterValidCredentials() {
		ef.getWebElement("XPATH", LoginPageElements.emailTextBox).sendKeys("rajath001@gmail.com");
		ef.getWebElement("XPATH", LoginPageElements.passwordTextBox).sendKeys("Rajath@123");
	}
	
	public void clickLoginButton() {
		ef.getWebElement("XPATH", LoginPageElements.loginButton).click();
	}
}
