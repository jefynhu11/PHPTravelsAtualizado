package tasks;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import appobjects.EntrarLoginAppObject;

public class EntrarLoginTasks {
	private WebDriver driver;
	private EntrarLoginAppObject loginAppObject;
	
	
	public EntrarLoginTasks (WebDriver driver) {
		this.driver = driver;
		this.loginAppObject = new EntrarLoginAppObject(driver);
	}

	public void acessarLogin() {
		loginAppObject.myAccountBotao().click();
		loginAppObject.acessoLogin().click();
	}
	
	public void logar() {
		loginAppObject.acessoEmail().sendKeys("jefersonzidane@hotmail.com");
		loginAppObject.acessoSenha().sendKeys("0123456789");
		loginAppObject.botaoLogin().click();
	}
	
	public void nomeConta() {
		Assert.assertEquals("Hi, Jeferson Lopes", loginAppObject.obterNomeConta().getText());
	}
}
