package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.CriaContaAppObject;

public class CriaContaTask {
	
	private WebDriver driver;
	private CriaContaAppObject criarContaAppObject;
	
	public CriaContaTask (WebDriver driver) {
		this.driver = driver;
		this.criarContaAppObject = new CriaContaAppObject(driver);
	}
	
	public void createConta() {
		criarContaAppObject.getMyAccountButton().click();
		criarContaAppObject.getSingUpButton().click();
		criarContaAppObject.getNomeFieldText().sendKeys("Jeferson");
		criarContaAppObject.getSobrenomeFieldText().sendKeys("Lopes");
		criarContaAppObject.getPhoneFieldText().sendKeys("9876543210");
		criarContaAppObject.getEmailFieldText().sendKeys("teste@teste.com");
		criarContaAppObject.getSenhaFieldText().sendKeys("aA1!,.");
		criarContaAppObject.getConfirmarSenhaFieldText().sendKeys("0123456789");
		criarContaAppObject.getSignUpSalvarButton().click();
	}

}
