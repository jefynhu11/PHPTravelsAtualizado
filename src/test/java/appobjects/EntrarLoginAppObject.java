package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tasks.EntrarLoginTasks;

public class EntrarLoginAppObject {

	private WebDriver driver;
	
	public EntrarLoginAppObject (WebDriver driver) {
		this.driver = driver;
	}

	public void escrever(By by, String texto) {
		driver.findElement(by).sendKeys(texto);
	}

	public WebElement myAccountBotao() {
		return driver.findElement(By.xpath("//*[contains(@class,'dropdown-login')]"));
	}

	public WebElement acessoLogin() {
		return driver.findElement(By.cssSelector("a.dropdown-item.active.tr"));
	}

	public WebElement acessoEmail() {
		return driver.findElement(By.xpath("//*[contains(@name,'username')]"));
	}
	
	public WebElement acessoSenha() {
		return driver.findElement(By.xpath("//*[contains(@name,'password')]"));
	}
	
	public WebElement botaoLogin() {
		return driver.findElement(By.xpath("//*[contains(@class,'loginbtn')]"));		
	}
	
	public WebElement obterNomeConta() {
		return driver.findElement(By.xpath("//h3[.='Hi, Jeferson Lopes']"));
	}
	
	public WebElement getBarraTours() {
//		return driver.findElement(By.xpath("//*[contains(@class,'tours')]"));
//		return driver.findElement(By.xpath("//*[@id='mobileMenuMain']/nav/ul/li[4]/a"));
		return driver.findElement(By.cssSelector("#mobileMenuMain > nav > ul > li:nth-child(4) > a"));
	}
	public WebElement getTiraPropaganda() {
		return driver.findElement(By.cssSelector("#cookyGotItBtnBox button"));
	}
	
	public WebElement getEscolhaImagem() {
//		return driver.findElement(By.xpath("//*[contains(@src,'nile')]"));
		return driver.findElement(By.cssSelector(".gap-xl-30 div:nth-child(1) figure a"));
	}
	
	public WebElement clicaButtonBookNow() {
		return driver.findElement(By.cssSelector("aside div > form > button"));
//		return driver.findElement(By.cssSelector("body  form > button"));
//		return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[4]/div/div[1]/aside/div/form/div/form/button"));
	}
	
	public WebElement getOpcao() {
//		return driver.findElement(By.id("8"));
		return driver.findElement(By.cssSelector("#bookingdetails  tr:nth-child(2)  span.slider.round"));
	}
}
