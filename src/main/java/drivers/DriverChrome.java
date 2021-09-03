package drivers;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.ConfigProperties;

public class DriverChrome extends Driver {

	@Override
	public void instanceDriver() throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , ConfigProperties.getFromProperties("ChromePath"));
		driver = new ChromeDriver();
	}

	@Override
	public WebDriver returnDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

	
	
	
}
