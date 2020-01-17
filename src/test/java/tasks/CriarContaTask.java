package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.CriarContaAppObject;

public class CriarContaTask {
	
	private WebDriver driver;
	private CriarContaAppObject criarContaAppObject;
	
	public CriarContaTask (WebDriver driver) {
		this.driver = driver;
		this.criarContaAppObject = new CriarContaAppObject(driver);
	}
	
	public void myAccount() {
		criarContaAppObject.myAccountBotao().click();
	}

	public void acessoSignUp() {
		criarContaAppObject.criarContaSingUp().click();
	}
	
	public void escreverNome() {
		criarContaAppObject.campoNome().sendKeys("Jeferson");
	}
	
	public void escreverSobrenome() {
		criarContaAppObject.campoSobrenome().sendKeys("Lopes");
	}

	public void escreverPhone() {
		criarContaAppObject.campoPhone().sendKeys("9876543210");
	}
	
	public void escreverEmail() {
		criarContaAppObject.campoEmail().sendKeys("jefersonzidane@hotmail.com");
	}
	
	public void escreverSenha() {
		criarContaAppObject.campoSenha().sendKeys("0123456789");
	}
	
	public void escreverConfirmarSenha() {
		criarContaAppObject.campoConfirmarSenha().sendKeys("0123456789");
	}
	
	public void salvarConta() {
		criarContaAppObject.botaoSignUp().click();
	}
	
	public String NomeConta() {
		String text = criarContaAppObject.obterNomeConta().getText();
		return text;
	}
}
