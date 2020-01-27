package frameworks.utils;

import static frameworks.utils.DriverManagerFactoryFw.quitDriver;
import static frameworks.utils.DriverManagerFactoryFw.setDriver;

import org.junit.After;
import org.openqa.selenium.WebDriver;
public class BaseTestFw {

	private static WebDriver driver;
	
	public WebDriver getDriver() {
		this.driver = setDriver(DriverTypeFw.CHROME);
		return driver;
	}
	
	@After
	public void tearDown() {
//		quitDriver();
	}
}