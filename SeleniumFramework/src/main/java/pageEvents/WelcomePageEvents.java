package pageEvents;

import pageObjects.WelcomePageElements;
import utils.ElementFetch;

public class WelcomePageEvents {
	ElementFetch ef = new ElementFetch();
	public void clickLoginButton() {
		ef.getWebElement("LINKTEXT", WelcomePageElements.loginButton).click();
	}
	
	public void clickRegisterButton() {
		ef.getWebElement("XPATH", WelcomePageElements.registerButton).click();
	}
}
