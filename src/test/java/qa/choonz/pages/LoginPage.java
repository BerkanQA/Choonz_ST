package qa.choonz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	public static final String LoginURL = "http://localhost:8082/login";
	
	@FindBy(xpath = "/html/body/div[2]/form/div[1]/div/a") 
	private WebElement signUpHere;
	@FindBy(id = "Username")
	WebElement uName;
	@FindBy(id = "password")
	WebElement pWord;
	
	public void clickSignUpHere() {
		signUpHere.click();
	}
	public void loginForm(String username, String password) {
		uName.sendKeys(username);
		pWord.sendKeys(password);
		pWord.submit();
	}
	
	@FindBy(xpath = "/html/body/section/div/div/div[2]/div/form/button")
	private WebElement uSubmit;
	
	public void clickSubmit() {
		uSubmit.click();
	}
	
	
}
