package qa.choonz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotPlaylistsPage {
	public static final String hotPlaylistURL = "http://localhost:8082/hotPlaylists";

	@FindBy(id = "playlistName")
	private WebElement uPlaylistName;
	
	public void clickuArtistName() {
		uPlaylistName.click();
	}
}
