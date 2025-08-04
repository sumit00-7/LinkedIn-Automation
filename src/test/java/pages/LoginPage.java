package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By emailField = By.id("username");
	By passwordField = By.id("password");
	By loginButton = By.xpath("//button[@aria-label='Sign in']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void performLogin(String email, String pass) throws InterruptedException {
		driver.findElement(emailField).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(passwordField).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(loginButton).click();
	}
}
