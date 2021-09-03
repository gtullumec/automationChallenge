package pages;

import org.openqa.selenium.WebDriver;

public class AccountPage extends WebPage {

	public AccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void assertRegisterAccount(String url) {
		System.out.println("The result of the assertion that contained the current URL is: " + action.assertStringContainedInCurrentURL(url));
	}
	
	private String xpathName = "//span[contains(text(),'#txt#')]";
	
	public void assertNameRegister(String name) {
		action.assertXpath(utilities.replaceText(xpathName, name));
	}
	
	private String xpathLogOut = "//div/a[contains(text(),'Sign out')]";
	
	public void assertLogOut() {
		action.assertXpath(xpathLogOut);
	}
	
}
