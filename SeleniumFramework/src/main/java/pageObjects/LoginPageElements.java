package pageObjects;

public interface LoginPageElements {
	
	String loginText = "//h1[normalize-space()='Welcome, Please Sign In!']";
	String emailTextBox = "//input[@name='Email']";
	String passwordTextBox = "//input[@name='Password']";
	String loginButton = "//input[@value='Log in']";
	

}
