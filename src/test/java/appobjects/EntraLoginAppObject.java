package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntraLoginAppObject {

	private WebDriver driver;
	
	public EntraLoginAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	/** teste Google **/
	public WebElement getCampoFieldText() {
		return driver.findElement(By.name("q"));
	}
	
	public WebElement getPesquisarButton() {
		return driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@class='gNO89b']"));
	}

	public WebElement getMyAccountButton() {
		/** antigo **/
//		return driver.findElement(By.xpath("//*[contains(@class,'dropdown-login')]"));
		/** nao funciona **/
//		return driver.findElement(By.xpath("//div[@class='mini-menu']//i[@class='bx bx-user']"));
//		return driver.findElement(By.xpath("//div[@class='dropdown dropdown-login dropdown-tab show']//a[@id='dropdownCurrency']"));
//		return driver.findElement(By.xpath("//div[@class='col-md-8 col-10 o1']//div[@class='dropdown dropdown-login dropdown-tab show']"));
		return driver.findElement(By.cssSelector(".dropdown.dropdown-login.dropdown-tab #dropdownCurrency")); 
//		return driver.findElement(By.cssSelector("#mobileMenuMain > nav > ul:nth-child(1) > li > a"));
	}
	
	public WebElement getLogin() {
		return driver.findElement(By.cssSelector("a.dropdown-item.active.tr"));
	}

	public WebElement getEmailFieldText() {
		return driver.findElement(By.xpath("//*[contains(@name,'username')]"));
	}
	
	public WebElement getSenhaFieldText() {
		return driver.findElement(By.xpath("//*[contains(@name,'password')]"));
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//*[contains(@class,'loginbtn')]"));		
	}

}
