package pages;

import org.openqa.selenium.WebDriver;


//Duda: el registro y el login podrian ir en una misma clase

public class LoginPage extends WebPage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	private String inputValue = "//input[@id='#txt#']";
	
	public void inputText(String field , String value) {
		//field: email_create, customer_firstname, customer_lastname, passwd, company, address1, address2, city, postcode, phone, phone_mobile, alias
		action.setText(utilities.replaceText(inputValue, field),value);
	}
	
	public void clickRadio(String field) {
		//field: id_gender1, id_gender2
		action.click(utilities.replaceText(inputValue, field));
	}
	
	private String selectForm = "//*[@id='#txt#']/option[@value='#txt#']";

	public void selectOption(String field, String value) {
		//field: days, months, years, id_state
		String xpathSelect = utilities.replaceText(selectForm, field);
		//action.click(xpathSelect);
		action.click(utilities.replaceText(xpathSelect,value));
	}
	
	private String buttonAccount = "//button[@id='#txt#']";
	
	public void clickButtonAccount(String value) {
		//value: SubmitCreate, submitAccount
		action.click(utilities.replaceText(buttonAccount, value));
	}
	

	
	
}
