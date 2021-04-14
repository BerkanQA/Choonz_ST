package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {

	public static final String AdminURL = "http://http://localhost:8082/admin";
	
	@FindBy(id = "playlistName") 
	private WebElement playlistName; 
	
	public void clickPlaylistName() {
		playlistName.click();
	}
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[1]/button")
	private WebElement createGenres; 
	
	public void clickCreateGenres() {
		createGenres.click();
	}
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[2]/button")
	private WebElement createArtists;
	
	public void clickCreateArtists() {
		createArtists.click();
	}
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[3]/button")
	private WebElement createAlbum;
	
	public void clickCreateAlbum() {
		createAlbum.click();
	}
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[4]/button")
	private WebElement createTrack;
	
	public void clickCreateTrack() {
		createTrack.click();
	}
}
