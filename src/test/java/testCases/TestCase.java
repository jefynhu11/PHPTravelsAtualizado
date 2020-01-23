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

import appobjects.HomeAppObject;
import frameworks.utils.BaseTestFw;
import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.CriaContaTask;
import tasks.EntraLoginTasks;
import tasks.HomeTask;
import tasks.ReservaTask;

public class TestCase extends BaseTestFw {

	private WebDriver driver;
	private CriaContaTask criarContaTask = new CriaContaTask(driver);
	private EntraLoginTasks entrarLoginTasks = new EntraLoginTasks(driver);
	private HomeTask homeTask = new HomeTask(driver);
	private ReservaTask reservarTask = new ReservaTask(driver);
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
//		this.driver.get("https://www.google.com");
		this.driver.get("https://www.phptravels.net/");
		this.driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void logarReservar() {
		entrarLoginTasks.acessarLogin();
		entrarLoginTasks.logar();
		
		/** teste google **/
//		entrarLoginTasks.testeGoogle();
		
		homeTask.homeHotel();
		
		reservarTask.reservarHotel();
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