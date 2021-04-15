package qa.choonz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePage {
	
	public static final String CreateURL = "http://localhost:8082/create";
	
	@FindBy(xpath = "/html/body/section/div/div/div[2]/div/form/button")
	WebElement createAccount;
	@FindBy(id = "username")
	WebElement uName;
	@FindBy(id = "password")
	WebElement pWord;
	
	public void clickCreateAccount() {
		createAccount.click();
	}
	public void createUser(String username, String password) {
		uName.sendKeys(username);
		pWord.sendKeys(password);
		pWord.submit();
	}
}
