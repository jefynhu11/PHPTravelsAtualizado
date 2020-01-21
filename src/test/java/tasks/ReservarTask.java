package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.ReservarAppObject;

public class ReservarTask {
	
	private WebDriver driver;
	private ReservarAppObject reservarAppObject;
	
	public ReservarTask(WebDriver driver) {
		this.driver = driver;
		this.reservarAppObject = new ReservarAppObject(driver);
	}
	
	public void menuHome() {
		reservarAppObject.menuHome().click();
	}

}
