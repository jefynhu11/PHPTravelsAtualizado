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
	
	public WebElement getExtraButton() {
		return driver.findElement(By.xpath("//input[@id='6']/../span[@class='slider round']"));
	}

	public WebElement botaoConfirm() {
//		return driver.findElement(By.xpath("//div[@class='form-group']/button[.='CONFIRM THIS BOOKING']"));
		return driver.findElement(By.xpath("//div[@class='form-group']/button"));
	}
	
	public WebElement gotItPopupButton() {
		return driver.findElement(By.xpath("//div[@id='cookyGotItBtnBox']//button"));
	}
	
}
