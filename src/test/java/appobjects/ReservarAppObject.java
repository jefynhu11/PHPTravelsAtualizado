package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservarAppObject {

	private WebDriver driver;
	
	public ReservarAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement menuHome() {
		return driver.findElement(By.cssSelector("#mobileMenuMain nav ul:nth-child(1) li a"));
	}
	
}
