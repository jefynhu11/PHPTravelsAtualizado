package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservaAppObject {
	
	private WebDriver driver;
	
	public ReservaAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getBookNowButton() {
		return driver.findElement(By.xpath("//form/button[@type='submit']"));
//		return driver.findElement(By.xpath("//form/button[.='Book Now']"));
	}
	
}
