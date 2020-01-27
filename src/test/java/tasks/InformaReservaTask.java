package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.InformaReservaAppObject;

public class InformaReservaTask {

	private WebDriver driver;
	private InformaReservaAppObject informaReserva;
	
	public InformaReservaTask(WebDriver driver) {
		this.driver = driver;
		this.informaReserva = new InformaReservaAppObject(driver);
	}
	
	public void reservarHotel() {
		informaReserva.getExtraButton().click();
		informaReserva.getConfirmButton().click();
	}

}
