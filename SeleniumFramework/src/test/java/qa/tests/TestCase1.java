package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.WelcomePageEvents;
import pageEvents.HomePageEvents;
import pageEvents.RegisterPageEvents;
import utils.ElementFetch;

public class TestCase1 extends BaseTest {

	ElementFetch ef = new ElementFetch();
	WelcomePageEvents wp = new WelcomePageEvents();
	RegisterPageEvents rp = new RegisterPageEvents();
	HomePageEvents hp = new HomePageEvents();

	@Test
	public void successfullyRegisterUser() {
		logger.info("Moving to user registration page");
		wp.clickRegisterButton();
		logger.info("Verifying user is on registration page");
		rp.verifyRegisterPageLoad();
		logger.info("Providing user details as input");
		rp.enterInput();
		logger.info("Proceeding to register");
		rp.clickRegisterButton();
		logger.info("Verifying user has successfully registered");
		hp.verifySuccessfulRegister();
	}
}
