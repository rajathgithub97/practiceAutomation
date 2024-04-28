package qa.tests;


import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.WelcomePageEvents;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class TestCase2 extends BaseTest{

	ElementFetch ef = new ElementFetch();
	WelcomePageEvents wp = new WelcomePageEvents();
	LoginPageEvents lp = new LoginPageEvents();
	HomePageEvents hp = new HomePageEvents();
	
@Test
public void loginWithValidCredentials() {
	logger.info("Moving to login page");
	wp.clickLoginButton();
	logger.info("Verifying user is on login page");
	lp.verifyLoginPageLoad();
	logger.info("Entering the credentials");
	lp.enterValidCredentials();
	logger.info("Logging in");
	lp.clickLoginButton();
	logger.info("Verifying successful login");
	hp.verifySuccessfulLogin();
} 
}
