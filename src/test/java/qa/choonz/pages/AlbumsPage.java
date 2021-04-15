package qa.choonz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlbumsPage {
	
public static final String AlbumsURL = "http://localhost:8082/albums?album_id=1";
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[1]/button")
	WebElement addArtist;
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/button[1]")
	WebElement closeAddArtist; 
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/button[2]")
	WebElement addArtistButton;
	@FindBy(id = "add-album-artist")
	WebElement artistId;

	
	public void clickAddArtist() {
		addArtist.click();
	}
	public void clickCloseAddArtistModel() {
		closeAddArtist.click();
	}
	public void clickAddArtistModel() {
		addArtistButton.click();
	}
	public void artistIDinput(String artistid) {
		artistId.sendKeys(artistid);
		artistId.submit();
	}

	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[2]/button")
	WebElement removeArtistButton;
	@FindBy(xpath = "/html/body/div[5]/div/div/div[3]/button[1]")
	WebElement closeRemoveArtistModel;
	@FindBy(xpath = "/html/body/div[5]/div/div/div[3]/button[2]")
	WebElement removeArtistModelButton;
	@FindBy(id = "remove-album-artist")
	WebElement removeArtistId;
	
	public void clickRemoveArtist() {
		removeArtistButton.click();
	}
	public void closeRemoveArtistModel() {
		closeRemoveArtistModel.click();
	}
	public void removeArtistModelButton() {
		removeArtistModelButton.click();
	}
	public void removeArtistModel(String artistid) {
		removeArtistId.sendKeys(artistid);
		removeArtistId.submit();
	}

	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[3]/button")
	WebElement editAlbum;
	@FindBy(xpath = "/html/body/div[6]/div/div/div[3]/button[1]")
	WebElement closeUpdateAlbumModel;
	@FindBy(xpath = "/html/body/div[6]/div/div/div[3]/button[2]")
	WebElement updateButtonModel;
	@FindBy(id = "update-album-name")
	WebElement updateAlbumName;
	@FindBy(id = "update-album-artistid")
	WebElement updateArtistId;
	@FindBy(id = "albumPic")
	WebElement updateAlbumCover;
	
	public void clickEditAlbum() {
		editAlbum.click();
	}
	public void clickCloseUpdateAlbumModel() {
		closeUpdateAlbumModel.click();
	}
	public void clickUpdateModel() {
		updateButtonModel.click();
	}
	public void updateModel(String albumname, String artistid) {
		updateAlbumName.sendKeys(albumname);
		updateArtistId.sendKeys(artistid);
		updateAlbumCover.submit();
	}
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[4]/button")
	WebElement deleteAlbumButton;
	@FindBy(xpath = "/html/body/div[7]/div/div/div[3]/button[1]")
	WebElement closeDeleteButton;
	@FindBy(xpath = "/html/body/div[7]/div/div/div[3]/button[2]")
	WebElement confirmDeleteButton;
	
	public void clickDeleteAlbum() {
		deleteAlbumButton.click();
	}
	public void clickCloseDeleteAlbum() {
		closeDeleteButton.click();
	}
	public void clickConfirmDelete() {
		confirmDeleteButton.click();
	}
}
