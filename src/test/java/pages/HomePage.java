package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;
	
	By createButtonBy = By.xpath("//button//strong");
	By addImage = By.xpath("//button[@aria-label=\"Add media\"]");
	By premium = By.xpath("//a[contains(.,'Try Premium for ₹0')]");
	By jobs = By.partialLinkText("Jobs");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void clickCreateButton() {
		driver.findElement(createButtonBy).click();
	}

	public void clickAddImage(String src) {
		driver.findElement(addImage).click();
	}
	
	public void handelPremium() {
		System.out.println(wait.until(ExpectedConditions.visibilityOf(driver.findElement(createButtonBy))).getText());
	}
	
	public void clickJobs() {
		driver.findElement(jobs).click();
	}
}
