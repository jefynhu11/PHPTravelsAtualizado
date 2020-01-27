package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntraLoginAppObject {

	private WebDriver driver;
	
	public EntraLoginAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getMyAccountButton() {
		return driver.findElement(By.cssSelector("div[class='dropdown dropdown-login dropdown-tab'] > a"));
	}

	public WebElement getGotIt() {
		return driver.findElement(By.cssSelector("button[class='cc-btn cc-dismiss']"));
	}
	
	public WebElement getSearchButton() {
		return driver.findElement(By.cssSelector("div[class='col-md-2 col-xs-12 o1']>button"));
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
