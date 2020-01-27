package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import frameworks.utils.BaseTestFw;
import tasks.EntraLoginTasks;
import tasks.HomeTask;
import tasks.ReservaTask;

public class TestCase extends BaseTestFw {

	private WebDriver driver = getDriver();
//	private CriaContaTask criarContaTask = new CriaContaTask(driver);
	private EntraLoginTasks entrarLoginTasks = new EntraLoginTasks(driver);
	private HomeTask homeTask = new HomeTask(driver);
	private ReservaTask reservarTask = new ReservaTask(driver);

	@Before
	public void setUp() {
		driver.get("https://www.phptravels.net");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void reservarPHPTravels() {
		entrarLoginTasks.acessarLogin();
		entrarLoginTasks.logar();
		homeTask.homeHotel();
//		reservarTask.reservarHotel();
	}
}