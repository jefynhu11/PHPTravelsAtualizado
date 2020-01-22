package testCases;

import static frameworks.utils.DriverManagerFactoryFw.quitDriver;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import frameworks.utils.BaseTestFw;
import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.CriarContaTask;
import tasks.EntrarLoginTasks;
import tasks.ReservaTask;

public class TestCase extends BaseTestFw {

	private WebDriver driver;
	private EntrarLoginTasks loginTasks = new EntrarLoginTasks(driver);;
	private CriarContaTask criarContaTask = new CriarContaTask(driver);;
	private ReservaTask reservarTask = new ReservaTask(driver);;
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("https://www.phptravels.net/");
		this.driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
//	@Test
//	public void criarConta() {
//		criarContaTask.myAccount();
//		criarContaTask.acessoSignUp();
//		
//		criarContaTask.escreverNome();
//		criarContaTask.escreverSobrenome();
//		criarContaTask.escreverPhone();
//		criarContaTask.escreverEmail();
//		criarContaTask.escreverSenha();
//		criarContaTask.escreverConfirmarSenha();
//		criarContaTask.salvarConta();
//		
//		String text = criarContaTask.NomeConta();
//		Assert.assertEquals("Hi, Jeferson Lopes", text);
//	}
	
//	@Test
//	public void logarConta() {
//		loginTasks.myAccount();
//		loginTasks.login();
//		
//		loginTasks.escreverEmail();
//		loginTasks.escreverSenha();
//		loginTasks.logarLogin();
//
//		String text = loginTasks.NomeConta();
//		Assert.assertEquals("Hi, Jeferson Lopes", text);
//		
//	}
	
	@Test
	public void logarReservar() throws InterruptedException {
		loginTasks.acessarLogin();
		loginTasks.logar();
		reservarTask.reservarHotel();
		reservarTask.validarValor();
		reservarTask.botaoConfirm();
	}
	
	@After
	public void tearDown() {
//		if(BaseTestFw.fechar_browser) {
//			driver.quit();
//		}
//		driver.quit();
		quitDriver();
	}
	
}