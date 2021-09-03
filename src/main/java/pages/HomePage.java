package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import common.ConfigProperties;


public class HomePage extends WebPage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void getHome() throws IOException {
		driver.get(ConfigProperties.getFromProperties("url"));
		driver.manage().window().maximize();
	}
	
	private String searchButton = "//a[@class='login']";
	
	public void clickSignIn() {
		action.click(searchButton);
	}
	
}
