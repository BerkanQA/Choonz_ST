package qa.choonz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {

	public static final String AdminURL = "http://http://localhost:8082/admin";
	
	// 
	@FindBy(id = "playlistName") 
	private WebElement playlistName; 
	
	public void clickPlaylistName() {
		playlistName.click();
	}
	// CREATE GENRE BUTTON AND MODEL
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[1]/button")
	private WebElement createGenres; 
	@FindBy(id = "create-genre-name")
	WebElement genreName;
	@FindBy(id = "create-genre-desc")
	WebElement genreDesc;
	
	public void clickCreateGenres() {
		createGenres.click();
	}
	public void createGenre(String genrename, String genredesc) {
		genreName.sendKeys(genrename);
		genreDesc.sendKeys(genredesc);
		genreDesc.submit();
	}
	
	// CREATE ARTIST BUTTON AND MODEL 
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[2]/button")
	private WebElement createArtists;
	@FindBy(id = "create-artist-name")
	WebElement artistName;
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/button[1]")
	WebElement closeCreateArtist;
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/button[2]")
	WebElement cCreateArtist;
	
	public void clickCreateArtists() {
		createArtists.click();
	}
	public void createArtist(String artistname) {
		createArtists.sendKeys(artistname);
		createArtists.submit();
	}
	public void clickCloseCreateArtist() {
		closeCreateArtist.click();
	}
	public void clickCreateArtist() {
		cCreateArtist.click();
	}
	
	// CREATE ALBUM BUTTON AND MODEL
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[3]/button")
	WebElement createAlbum;
	@FindBy(id = "create-album-name")
	WebElement cAlbumName;
	@FindBy(id = "create-album-artistid")
	WebElement cArtistName;
	@FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[1]")
	WebElement closeCreateAlbum;
	@FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[2]")
	WebElement createNewAlbum; 
	
	public void clickCreateAlbum() {
		createAlbum.click();
	}
	public void createAlbum(String albumname, String artistname) {
		cAlbumName.sendKeys(albumname);
		cAlbumName.sendKeys(artistname);
		cAlbumName.submit();
	}
	public void closeCreateAlbumButton() {
		closeCreateAlbum.click();
	}
	public void createNewAlbum() {
		createNewAlbum.click();
	}
	// CREATE TRACK BUTTON AND MODEL 
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[4]/button")
	WebElement createTrack;
	@FindBy(id = "create-track-name")
	WebElement createNewTrack;
	@FindBy(id = "craete-track-duration")
	WebElement createNewDuration;
	@FindBy(id = "create-album-id")
	WebElement createNewAlbumid;
	@FindBy(id = "create-genre-id")
	WebElement createGenreid;
	@FindBy(id = "lyricsTextBox")
	WebElement createLyrics;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/button[1]")
	WebElement closeCreateTrackModel;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/button[2]")
	WebElement createNewTrackModel;
	
	public void clickCreateTrack() {
		createTrack.click();	
	}
	public void createNewTrack(String trackname,String trackduration, String trackalbum, String trackgenre, String lyrics) {
		createNewTrack.sendKeys(trackname);
		createNewDuration.sendKeys(trackduration);
		createNewAlbum.sendKeys(trackalbum);
		createGenreid.sendKeys(trackgenre);
		createLyrics.sendKeys(lyrics);
		createLyrics.submit();
	}
	public void clickCloseCreateModel() {
		closeCreateTrackModel.click();
	}
	public void clickCreateNewTrackModel() {
		createNewTrackModel.click();
	}
}
