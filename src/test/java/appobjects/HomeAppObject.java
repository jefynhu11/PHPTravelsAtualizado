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
	
	
	// Criar classe reserva para os métodos abaixo
	
	public WebElement botaoModify() {
		return driver.findElement(By.cssSelector("#airDatepickerRange-general > div:nth-child(5) div button"));
	}
	
	public WebElement selectRoom() {
		return driver.findElement(By.xpath("//input[@id='100']/../label"));
	}
	
	public WebElement botaoBookNow() {
		return driver.findElement(By.xpath("//div[@class='room-item-wrapper']/button[@type='submit']"));
//		return driver.findElement(By.xpath("//div[@class='room-item-wrapper']/button"));
	}
	
	public WebElement extra() {
		return driver.findElement(By.xpath("//form[@id='bookingdetails']//label[@class='switch']/input[@id='2']/.."));
	}
	
	public WebElement validarValor() {
		return driver.findElement(By.xpath("//span[@id='displaytotal']"));
	}
	
	public WebElement botaoConfirm() {
//		return driver.findElement(By.xpath("//div[@class='form-group']/button[.='CONFIRM THIS BOOKING']"));
		return driver.findElement(By.xpath("//div[@class='form-group']/button"));
	}
	
	public WebElement gotItPopupButton() {
		return driver.findElement(By.xpath("//div[@id='cookyGotItBtnBox']//button"));
	}
}
