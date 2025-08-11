package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobPage {
	WebDriver driver;
	WebDriverWait wait;
	
	By searchBox = By.xpath("//input[@aria-label=\"Search by title, skill, or company\"]");
	By jobTitle = By.xpath("//div[@dir=\"ltr\"]//strong");
	
	public JobPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void searchJob(String job) {
		driver.findElement(searchBox).sendKeys(job);
		driver.findElement(searchBox).sendKeys(Keys.ENTER);
	}
	
	public List<WebElement> getJobList(){
		List<WebElement> list  = driver.findElements(jobTitle);
		return list;
	}
}
