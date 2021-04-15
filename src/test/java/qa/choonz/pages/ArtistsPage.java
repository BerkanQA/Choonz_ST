package qa.choonz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArtistsPage {
	public static final String ArtistsURL = "http://http://localhost:8082/artists";
	
	
	@FindBy(id = "artistName")
	private WebElement uArtistName;
	
	public void clickuArtistName() {
		uArtistName.click();
	}
	
	// Edit Artist button
	@FindBy(xpath ="/html/body/section/div/div/div[3]/div[1]/button")
	private WebElement editArtists;
	
	
	public void clickEditArtists() {
		editArtists.click();
	}
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[2]/button")
	private WebElement deleteArtist;
	
	public void clickDeleteArtists() {
		deleteArtist.click();
	}
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div[3]/button[1]")
	private WebElement closeUpdateArtist;
	
	public void clickCloseUpdateArtist() {
		closeUpdateArtist.click();
	}
	
	@FindBy(xpath ="/html/body/div[5]/div/div/div[3]/button[2]")
	private WebElement updateArtist;
	
	public void clickUpdateArtist() {
		updateArtist.click();
	}
	
	@FindBy(id = "update-artist-name")
	private WebElement updateArtistName;
	
	public void artistNameInput(String artistname) {
		updateArtistName.sendKeys(artistname);
		updateArtist.submit();
	}
}
