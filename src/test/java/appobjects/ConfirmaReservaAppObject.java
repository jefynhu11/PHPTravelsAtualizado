package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmaReservaAppObject {

private WebDriver driver;
	
	public ConfirmaReservaAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getPayOnArrivalButton() {
		return driver.findElement(By.cssSelector("button.btn.btn-default.arrivalpay"));
	}

}
