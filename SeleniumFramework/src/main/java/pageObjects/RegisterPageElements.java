package pageObjects;

public interface RegisterPageElements {
	String registerText = "//h1[normalize-space()='Register']";
	String maleGender = "//input[@value='M']";
	String femaleGender = "//input[@value='F']";
	String firstNameTextBox = "//input[@name='FirstName']";
	String lastNameTextBox = "//input[@name='LastName']";
	String emailTextBox = "//input[@name='Email']";
	String passwordTextbox = "//input[@id='Password']";
	String confirmPasswordTextBox = "//input[@id='ConfirmPassword']";
	String registerButton = "//input[@id='register-button']";
}
