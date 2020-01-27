package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformaReservaAppObject {

	private WebDriver driver;
	
	public InformaReservaAppObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getExtraButton() {
		return driver.findElement(By.cssSelector(" tbody > tr:nth-child(4) > td:nth-child(4) > label"));
	}

	public WebElement getConfirmButton() {
		return driver.findElement(By.cssSelector("button[name='logged']"));
//		return driver.findElement(By.xpath("//div[@class='form-group']/button"));
	}
	
}
