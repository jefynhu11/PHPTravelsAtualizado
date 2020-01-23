package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeAppObject {

	private WebDriver driver;
	
	public HomeAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getMenuHomeButton() {
		return driver.findElement(By.cssSelector("#mobileMenuMain nav ul:nth-child(1) li a"));
	}
	
	public WebElement getFirstPhotoButton() {
		return driver.findElement(By.xpath("//h2[.='Featured Hotels']/../../div[2]//div[@class='col'][1]"));
	}
}
