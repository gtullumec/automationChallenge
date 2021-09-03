package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.ConfigProperties;
import common.Utilities;
import drivers.DriverFactory;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class PageTest {

	WebDriver driver;
	LoginPage login;
	AccountPage account;
	HomePage home;
	DriverFactory driverFactory;
	
	@BeforeTest
	public void init() throws IOException {
		driverFactory = new DriverFactory();
		driverFactory.getDriver(ConfigProperties.getFromProperties("navegador"));
		driver = driverFactory.returnDriverFromFactory();
		home = new HomePage(driver);
		login = new LoginPage(driver);
		account = new AccountPage(driver);
	}
	
	@Test
	public void registerTest() throws IOException {
		home.getHome();
		home.clickSignIn();
		login.inputText("email_create",ConfigProperties.getFromProperties("firstName")+Utilities.randomNumber()+"@gmail.com");
		login.clickButtonAccount("SubmitCreate");		
		login.clickRadio(ConfigProperties.getFromProperties("title"));
		login.inputText("customer_firstname",ConfigProperties.getFromProperties("firstName"));
		login.inputText("customer_lastname",ConfigProperties.getFromProperties("lastName"));
		login.inputText("passwd",ConfigProperties.getFromProperties("password"));
		login.selectOption("days", "13");
		login.selectOption("months", "8");
		login.selectOption("years", "2000");
		login.inputText("company",ConfigProperties.getFromProperties("company"));
		login.inputText("address1",ConfigProperties.getFromProperties("address1"));
		login.inputText("address2",ConfigProperties.getFromProperties("address2"));
		login.inputText("city",ConfigProperties.getFromProperties("city"));
		login.selectOption("id_state", "5");
		login.inputText("postcode",ConfigProperties.getFromProperties("postcode"));
		login.inputText("phone",ConfigProperties.getFromProperties("phone"));
		login.inputText("phone_mobile",ConfigProperties.getFromProperties("phone_mobile"));
		login.inputText("alias",ConfigProperties.getFromProperties("alias"));
		login.clickButtonAccount("submitAccount");
		account.assertRegisterAccount("http://automationpractice.com/index.php?controller=my-account");
		account.assertNameRegister(ConfigProperties.getFromProperties("firstName") + " " + ConfigProperties.getFromProperties("lastName"));
		account.assertLogOut();
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();		
	}

}
