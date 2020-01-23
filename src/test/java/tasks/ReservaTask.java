package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.ReservaAppObject;

public class ReservaTask {
	
	private WebDriver driver;
	private ReservaAppObject reservaAppObject;
	
	public ReservaTask(WebDriver driver) {
		this.driver = driver;
		this.reservaAppObject = new ReservaAppObject(driver);
	}
	
	public void reservarHotel() {
		reservaAppObject.getBookNowButton().click();
		reservaAppObject.getExtraButton().click();
		
	}

}
