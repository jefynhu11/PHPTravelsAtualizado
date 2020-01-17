package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CriarContaAppObject {

	private WebDriver driver;
	
	public CriarContaAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement myAccountBotao() {
		return driver.findElement(By.xpath("//*[contains(@class,'dropdown-login')]"));
	}
	
	public WebElement criarContaSingUp() {
		return driver.findElement(By.xpath("//*[@id='header-waypoint-sticky']//a[@class='dropdown-item tr']"));
	}
	
	public WebElement campoNome() {
		return driver.findElement(By.name("firstname"));
	}
	
	public WebElement campoSobrenome() {
		return driver.findElement(By.name("lastname"));
	}
	
	public WebElement campoPhone() {
		return driver.findElement(By.name("phone"));
	}
	
	public WebElement campoEmail() {
		return driver.findElement(By.name("email"));
	}
	
	public WebElement campoSenha() {
		return driver.findElement(By.name("password"));
	}
	
	public WebElement campoConfirmarSenha() {
		return driver.findElement(By.name("confirmpassword"));
	}
	
	public WebElement botaoSignUp() {
		return driver.findElement(By.xpath("//i[@class='fa fa-check-square-o']/.."));
	}
	
	public WebElement obterNomeConta() {
		return driver.findElement(By.xpath("//h3[.='Hi, Jeferson Lopes']"));
	}
}
