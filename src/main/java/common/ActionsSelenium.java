package common;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;



public class ActionsSelenium {
	
	WebDriver driver;
	WebDriverWait wait;
	public ActionsSelenium(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}
	
	
	//Actions
	public void click(String xpath) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).click();		
	}
	
	public void setText(String xpath, String text) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	
	public void mouseOver(String xpath) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(xpath))).perform();
	}
	
	
	//Assert
	public boolean assertStringContainedInCurrentURL(String expected) {
		boolean result = false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expected)) {
			result = true;
		}
		return result;
	}
	
	public void assertXpath(String xpath) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		boolean x = driver.findElement(By.xpath(xpath)).isDisplayed();
		Assert.assertTrue(x);
		if(x) {
			System.out.println("Xpath (" + xpath + ") assertion is Successful");
		}
		else {
			System.out.println("Xpath (" + xpath + ") assertion is Failed");
		}
	}


	
}
