package qa.choonz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaylistsPage {
	public static final String PlaylistURL = "http://localhost:8082/playlists";

	@FindBy(id = "playlistName")
	private WebElement uPlaylistName;
	
	public void clickPlaylistName() {
		uPlaylistName.click();
	}
	
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[1]/button")
	private WebElement addTrack;
	
	public void clickAddTrack() {
		addTrack.click();	
	}
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[2]/button")
	private WebElement removeTrack;
	
	public void clickRemoveTrack() {
		removeTrack.click();
	}
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[3]/button")
	private WebElement editPlaylist;
	
	public void clickEditPlaylist() {
		editPlaylist.click();
	}
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[4]/button")
	private WebElement deletePlaylist;
	
	public void clickDeletePlaylist() {
		deletePlaylist.click();
	}
}
