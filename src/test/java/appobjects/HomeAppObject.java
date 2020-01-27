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
		return driver.findElement(By.cssSelector("a[title='home']"));
	}
	
	public WebElement getFirstPhotoButton() {
		return driver.findElement(By.cssSelector("div:nth-child(1) > figure > a"));
	}
}
