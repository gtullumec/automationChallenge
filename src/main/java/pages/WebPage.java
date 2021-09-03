package pages;

import org.openqa.selenium.WebDriver;

import common.ActionsSelenium;
import common.Utilities;



public class WebPage {

	protected WebDriver driver;
	public ActionsSelenium action;
	public Utilities utilities;

	public WebPage(WebDriver driver) {
		this.driver = driver;
		action = new ActionsSelenium(driver);
		utilities = new Utilities();
	}


}
