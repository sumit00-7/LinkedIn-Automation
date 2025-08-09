package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseTest{
	@Test(priority = 1)
	public void validLogin() {
		driver.get("https://www.linkedin.com/feed/");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.performLogin(ConfigReader.getUsermail(), ConfigReader.getPassword());
		
		String str =  driver.getCurrentUrl();
		
		Assert.assertEquals("https://www.linkedin.com/feed/", str, "User Not Login Sucessfully");
	}
	
	@Test(priority = 2)
	public void invalidLogin() {
		driver.get("https://www.linkedin.com/feed/");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.performLogin(ConfigReader.getUsermail(), "Test@123");
		
		String str =  loginpage.getErrorMessage();
		String tocheckString = "Wrong phone number or password. Try again or create an account .";

		Assert.assertEquals(tocheckString, str, "User Logged in!! Something went wrong");
	}
}
