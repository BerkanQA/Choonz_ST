package qa.choonz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArtistsPage {
	public static final String ArtistsURL = "http://localhost:8082/artists?artist_id=1";
	
	
	@FindBy(id = "artistName")
	private WebElement uArtistName;
	
	public void clickuArtistName() {
		uArtistName.click();
	}
	
	// Edit Artist button
	@FindBy(id ="editArtistButton")
	private WebElement editArtists;
	
	
	public void clickEditArtists() {
		editArtists.click();
	}
	
	@FindBy(id = "deleteArtistButton")
	private WebElement deleteArtist;
	
	public void clickDeleteArtists() {
		deleteArtist.click();
	}
	
	@FindBy(id = "deleteArtistModalButton")
	private WebElement deleteArtistModal;
	
	public void clickDeleteArtistsModal() {
		deleteArtistModal.click();
	}
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div[3]/button[1]")
	private WebElement closeUpdateArtist;
	
	public void clickCloseUpdateArtist() {
		closeUpdateArtist.click();
	}
	
	@FindBy(id ="updateArtistModalButton")
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
