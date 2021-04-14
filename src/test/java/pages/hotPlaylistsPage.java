package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class hotPlaylistsPage {
	public static final String hotPlaylistURL = "http://http://localhost:8082/hotPlaylists";

	@FindBy(id = "playlistName")
	private WebElement uPlaylistName;
	
	public void clickuArtistName() {
		uPlaylistName.click();
	}
}
