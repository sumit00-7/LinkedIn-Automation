package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.JobPage;
import pages.LoginPage;
import utils.ConfigReader;

public class ApplyJobTest extends BaseTest{
	
	@Test
	public void applyJob() {
		driver.get("https://www.linkedin.com/feed/");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.performLogin(ConfigReader.getUsermail(), ConfigReader.getPassword());
		
		String str =  driver.getCurrentUrl();
		
		Assert.assertEquals("https://www.linkedin.com/feed/", str, "User Not Login Sucessfully");
		
		HomePage homePage = new HomePage(driver);
		homePage.handelPremium();
		homePage.clickJobs();
		
		JobPage jobPage = new JobPage(driver);
		jobPage.searchJob("SDET");
		List<WebElement> jobTitle = jobPage.getJobList();
		for (WebElement webElement : jobTitle) {
			System.out.println(webElement.getText());
		}
		
	}
}
