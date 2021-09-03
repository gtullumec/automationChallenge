package drivers;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.ConfigProperties;

public class DriverFireFox extends Driver {

	@Override
	public void instanceDriver() throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver" , ConfigProperties.getFromProperties("FirefoxPath"));
		driver = new FirefoxDriver();
	}

	@Override
	public WebDriver returnDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

}
