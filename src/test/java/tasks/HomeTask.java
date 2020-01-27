package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.HomeAppObject;

public class HomeTask {
	
	private WebDriver driver;
	private HomeAppObject homeAppObject;
	
	public HomeTask(WebDriver driver) {
		this.driver = driver;
		this.homeAppObject = new HomeAppObject(driver);
	}
	
	public void homeHotel() {
		/*** mudou pagina ***/
		homeAppObject.getMenuHomeButton().click();
		homeAppObject.getFirstPhotoButton().click();
	}
	
}
