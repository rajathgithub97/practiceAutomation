package pageEvents;

import org.testng.Assert;

import pageObjects.HomePageElements;
import pageObjects.RegisterPageElements;
import utils.CommonLogics;
import utils.ElementFetch;

public class RegisterPageEvents {
	public String email = "";

	ElementFetch ef = new ElementFetch();
	CommonLogics cl = new CommonLogics();
	
	public void verifyRegisterPageLoad() {
		Assert.assertTrue(ef.getWebElement("XPATH", RegisterPageElements.registerText).isDisplayed(),"Landed in register page");
	}
	
	public void enterInput() {
		if(cl.alternateGender().equalsIgnoreCase("male"))
			ef.getWebElement("XPATH", RegisterPageElements.maleGender).click();
		else if(cl.alternateGender().equalsIgnoreCase("female"))
			ef.getWebElement("XPATH", RegisterPageElements.femaleGender).click();
		
		ef.getWebElement("XPATH", RegisterPageElements.firstNameTextBox).sendKeys("Ranveer");
		ef.getWebElement("XPATH", RegisterPageElements.lastNameTextBox).sendKeys("singh");
		
		email = cl.generateRandomEmail("Ranveer", "singh");
		ef.getWebElement("XPATH", RegisterPageElements.emailTextBox).sendKeys(email);

		String password = cl.generateRandomAlphaNumeric();
		ef.getWebElement("XPATH", RegisterPageElements.passwordTextbox).sendKeys(password);
		ef.getWebElement("XPATH", RegisterPageElements.confirmPasswordTextBox).sendKeys(password);
	}
	
	public void clickRegisterButton() {
		ef.getWebElement("XPATH", RegisterPageElements.registerButton).click();
	}
}
