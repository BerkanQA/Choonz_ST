package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicsOnEveryPage {
	public static final String BasicsURL = "http://http://localhost:8082";
	
	@FindBy(id = "Search")
	private WebElement bSearch; 
	
	public void clickBSearch() {
		bSearch.click();
	}

	// Tracks button on navigation bar works
	@FindBy(xpath = "/html/body/nav/div/div/ul[1]/li[1]/a")
	private WebElement bfeaturedTracks; 
	
	public void clickFeaturedTracks() {
		bfeaturedTracks.click();
	}
	
	// Artists link on navigation bar
	@FindBy(xpath = "/html/body/nav/div/div/ul[1]/li[2]/a")
	private WebElement bArtists;
	
	public void clickBArtists() {
		bArtists.click();
	}
	
	// Top Playlist link on navigation bar
	@FindBy(xpath = "/html/body/nav/div/div/ul[1]/li[3]/a")
	private WebElement bTopPlaylists;
	
	public void clickBTopPlaylists() {
		bTopPlaylists.click();
	}
	
	@FindBy(xpath = "/html/body/nav/div/div/ul[2]/li[2]/a")
	private WebElement bLogIn;
	
	public void clickBLogIn() {
		bLogIn.click();
	}
	
	// CREATENEWPLAYLIST Button on http://localhost8082
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div/button")
	private WebElement bCreateNewPlaylist; 
	
	public void clickBCreateNewPlaylist() {
		bCreateNewPlaylist.click();
	}
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/button[1]")
	private WebElement createAlbumClose; 
	
	public void clickCreateAlbumClose() {
		createAlbumClose.click();
	}
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/button[2]")
	private WebElement cCreateAlbum; 
	
	public void clickcCreateAlbum() {
		cCreateAlbum.click();
	}
}
