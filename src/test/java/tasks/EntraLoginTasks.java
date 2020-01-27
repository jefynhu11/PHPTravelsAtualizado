package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.EntraLoginAppObject;

public class EntraLoginTasks {
	private WebDriver driver;
	private EntraLoginAppObject entraLoginAppObject;
	private frameworks.utils.WaitElementFw wait;
	
	public EntraLoginTasks (WebDriver driver) {
		this.driver = driver;
		this.entraLoginAppObject = new EntraLoginAppObject(driver);
	}

	public void gotIT() {
		entraLoginAppObject.getGotIt().click();
	}
	
	public void search() {
		entraLoginAppObject.getSearchButton().click();
	}
	
	public void acessarLogin() {
		entraLoginAppObject.getMyAccountButton().click();
		entraLoginAppObject.getLogin().click();
	}
	
	public void logar() {
		entraLoginAppObject.getEmailFieldText().sendKeys("teste@teste.com");
		entraLoginAppObject.getSenhaFieldText().sendKeys("aA1!,.");
		entraLoginAppObject.getLoginButton().click();
	}
	
}
