package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseTest{
	@Test
	public void validLogin() throws InterruptedException {
		driver.get("https://www.linkedin.com/feed/");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.performLogin(ConfigReader.getUsermail(), ConfigReader.getPassword());
		
		String str =  driver.getCurrentUrl();
		
		Assert.assertEquals("https://www.linkedin.com/feed/", str);
	}
}
