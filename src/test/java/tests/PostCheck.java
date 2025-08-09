package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;

public class PostCheck extends BaseTest {
	@Test
	public void createPost() throws InterruptedException {
		driver.get("https://www.linkedin.com/feed/");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.performLogin(ConfigReader.getUsermail(), ConfigReader.getPassword());
		
		String str =  driver.getCurrentUrl();
		
		Assert.assertEquals("https://www.linkedin.com/feed/", str, "User Not Login Sucessfully");
		
		HomePage homePage = new HomePage(driver);
		homePage.clickCreateButton();
		homePage.clickAddImage("hey");
		Thread.sleep(5000);
		
	}
}
