package tasks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import appobjects.HomeAppObject;
import frameworks.utils.WaitElementFw;

public class ReservaTask {
	
	private WebDriver driver;
	private HomeAppObject reservarAppObject;
	private WaitElementFw wait;
	
	public ReservaTask(WebDriver driver) {
		this.driver = driver;
		this.reservarAppObject = new HomeAppObject(driver);
//		this.wait = new WaitElementFw(this.driver);
	}
	
	public void reservarHotel() {
		reservarAppObject.getMenuHomeButton().click();
		reservarAppObject.getFirstPhotoButton().click();
		reservarAppObject.gotIt().click();
		reservarAppObject.botaoModify().click();
		reservarAppObject.selectRoom().click();
		reservarAppObject.botaoBookNow().click();
		reservarAppObject.extra().click();
	}
	
	public void validarValor() throws InterruptedException {
//		Thread.sleep(2000);
//		wait.visibilityOfElementLocated(driver, By.id("displaytotal"));
		
		
		String text = reservarAppObject.validarValor().getText;
		Double x = x.valueOf(text);
		System.out.println(x);
		
//		Assert.assertEquals("275", reservarAppObject.validarValor().getText());
	}

	public void botaoConfirm() {
		reservarAppObject.botaoConfirm().click();
	}
}
