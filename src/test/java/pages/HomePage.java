package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;
	
	By createButtonBy = By.xpath("//button//strong");
	By addImage = By.xpath("//button[@aria-label=\"Add media\"]");
	
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
}
