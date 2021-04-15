package qa.choonz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class IndexPage {

	public static final String indexURL = "http://localhost:8082";
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div/button")
	private WebElement uCreatePlaylist;
	
	public void clickCreatePlaylist() {
		uCreatePlaylist.click();
	}
	
	@FindBy(id = "create-playlist-name")
	private WebElement uPlaylistNameForm;
	
	@FindBy(id = "create-playlist-desc")
	private WebElement uPlaylistDescriptionForm;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/button[2]")
	private WebElement uCreatePlaylistModalButton;
	
	public void fillCreatePlaylistForm(String name, String desc) {
		uPlaylistNameForm.sendKeys(name);
		uPlaylistDescriptionForm.sendKeys(desc);
		uPlaylistDescriptionForm.submit();
	}
	
	public void clickCreatePlaylistModal() {
		uCreatePlaylistModalButton.click();
	}
}
