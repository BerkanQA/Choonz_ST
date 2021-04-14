package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {

	public static final String LoginURL = "http://localhost:8082/login";
	
	@FindBy(xpath = "/html/body/div[2]/form/div[1]/div/a") 
	private WebElement signUpHere;
	
	public void clickSignUpHere() {
		signUpHere.click();
	}
	
	@FindBy(xpath = "/html/body/div[2]/form/button")
	private WebElement uSubmit;
	
	public void clickSubmit() {
		uSubmit.click();
	}
	
	
}
