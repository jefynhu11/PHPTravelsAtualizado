package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CriaContaAppObject {

	private WebDriver driver;
	
	public CriaContaAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getMyAccountButton() {
		return driver.findElement(By.xpath("//*[contains(@class,'dropdown-login')]"));
	}
	
	public WebElement getSingUpButton() {
		return driver.findElement(By.xpath("//*[@id='header-waypoint-sticky']//a[@class='dropdown-item tr']"));
	}
	
	public WebElement getNomeFieldText() {
		return driver.findElement(By.name("firstname"));
	}
	
	public WebElement getSobrenomeFieldText() {
		return driver.findElement(By.name("lastname"));
	}
	
	public WebElement getPhoneFieldText() {
		return driver.findElement(By.name("phone"));
	}
	
	public WebElement getEmailFieldText() {
		return driver.findElement(By.name("email"));
	}
	
	public WebElement getSenhaFieldText() {
		return driver.findElement(By.name("password"));
	}
	
	public WebElement getConfirmarSenhaFieldText() {
		return driver.findElement(By.name("confirmpassword"));
	}
	
	public WebElement getSignUpSalvarButton() {
		return driver.findElement(By.xpath("//i[@class='fa fa-check-square-o']/.."));
	}

}
