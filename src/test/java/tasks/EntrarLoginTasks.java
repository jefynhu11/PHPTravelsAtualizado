package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appobjects.EntrarLoginAppObject;
import frameworks.utils.WaitElementFw;

public class EntrarLoginTasks {
	private WebDriver driver;
	private EntrarLoginAppObject loginAppObject;
	
	
	public EntrarLoginTasks (WebDriver driver) {
		this.driver = driver;
		this.loginAppObject = new EntrarLoginAppObject(driver);
	}
	/*** --- ***/
	public void clicarBotao(By by) {
		driver.findElement(by).click();
	}
	public void clicarBotao(String id) {
		clicarBotao(By.id(id));
	}
	
	public void myAccount() {
		loginAppObject.myAccountBotao().click();
	}
	
	public void login() {
		loginAppObject.acessoLogin().click();
	}
	
	public void escreverEmail() {
		loginAppObject.acessoEmail().sendKeys("jefersonzidane@hotmail.com");
	}
	
	public void escreverSenha() {
		loginAppObject.acessoSenha().sendKeys("0123456789");
	}
	
	public void logarLogin() {
		loginAppObject.botaoLogin().click();
	}
	
	public String NomeConta() {
		String text = loginAppObject.obterNomeConta().getText();
		return text;
	}
	
	public void clicaBarraTours() {
		loginAppObject.getBarraTours().click();
		loginAppObject.getBarraTours().click();
	}
	
	public void clicaImagem() {
		loginAppObject.getEscolhaImagem().click();
	}
	
	public void clicaGotIt() {
		WaitElementFw.visibilityOf(driver, loginAppObject.getTiraPropaganda());
		loginAppObject.getTiraPropaganda().click();
	}

	public void clicaButtonBookNow() {
		WaitElementFw.visibilityOf(driver, loginAppObject.clicaButtonBookNow());
		loginAppObject.clicaButtonBookNow().click();
		loginAppObject.clicaButtonBookNow().click();
	}
	
	public void clicaButtonOpcao() {
		WaitElementFw.visibilityOf(driver, loginAppObject.getOpcao());
		loginAppObject.getOpcao().click();
	}

}
