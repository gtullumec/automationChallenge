package drivers;

import java.io.IOException;

import org.openqa.selenium.WebDriver;


public class DriverFactory {

	public Driver driver;
	
	public void getDriver(String navegador) throws IOException {
		
		switch(navegador) {
			case "Chrome":
				driver = new DriverChrome();
				break;
			case "Firefox":
				driver = new DriverFireFox();
				break;
			default:
				driver = null;
				break;
		}
		driver.instanceDriver();
	}
	
	public WebDriver returnDriverFromFactory() {
		return driver.returnDriver();
	}
	
}
