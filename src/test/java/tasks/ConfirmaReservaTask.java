package tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appobjects.ConfirmaReservaAppObject;

public class ConfirmaReservaTask {
	
	private WebDriver driver;
	private ConfirmaReservaAppObject confirmaReserva;
	
	public ConfirmaReservaTask(WebDriver driver) {
		this.driver = driver;
		this.confirmaReserva = new ConfirmaReservaAppObject(driver);
	}
	
	public void confirmarReservar() {
		confirmaReserva.getPayOnArrivalButton().click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
