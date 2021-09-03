package drivers;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

abstract class Driver {

	protected WebDriver driver;
	
	public abstract void instanceDriver() throws IOException;
	
	public abstract WebDriver returnDriver();
	
}
