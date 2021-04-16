package qa.choonz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TracksPage {
	public static final String TracksURL = "http://localhost:8082/tracks?track_id=1";

	// Album-name link
	@FindBy(xpath = "/html/body/section/div/div/div[1]/div[4]/a")
	private WebElement albumName;

	public void clickAlbumName() {
		albumName.click();
	}

	// Genre-name link
	@FindBy(xpath = "/html/body/section/div/div/div[1]/div[5]/a")
	private WebElement genreName;

	public void clickGenreName() {
		genreName.click();
	}
	
	// Edit Track
	@FindBy(id = "editTrackButton")
	private WebElement updateTrack;

	public void clickEditTrack() {
		updateTrack.click();
	}
	
	@FindBy(id = "updateTrackModalButton")
	private WebElement editTrackModal;
	
	public void clickEditTrackModal() {
		editTrackModal.click();
	}
	
	@FindBy(id = "deleteTrackButton")
	private WebElement deleteTrack;
	
	public void clickDeleteTrack() {
		deleteTrack.click();
	}
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/button[1]")
	private WebElement closeDeleteTrack;
	
	public void clickCloseDeleteTrack() {
		closeDeleteTrack.click();
	}
	
	@FindBy(id = "deleteTrackModalButton")
	private WebElement dDeleteTrack;
	
	public void clickdDeleteTrack() {
		dDeleteTrack.click();
	}
	
	@FindBy(id = "update-track-name")
	private WebElement updateTName;
	
	@FindBy(id = "update-track-duration")
	private WebElement updateTDuration;
	
	@FindBy(id = "update-album-id")
	private WebElement updateAlbumId;
	
	@FindBy(id = "update-genre-id")
	private WebElement updateGenreId;
	
	@FindBy(id = "lyricsTextBox")
	private WebElement lyrics;
	
	public void updateTracks(String trackname, String duration, String albumid, String genreid, String ulyrics) {
		updateTName.sendKeys(trackname);
		updateTDuration.sendKeys(duration);
		updateAlbumId.sendKeys(albumid);
		updateGenreId.sendKeys(genreid);
		lyrics.sendKeys(ulyrics);
	}
	
}
	

