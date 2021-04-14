package qa.choonz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotTracksPage {
	public static final String hotTracksURL = "http://http://localhost:8082/hotTracks";

	@FindBy(id = "artistName")
	private WebElement uArtistName;
	
	public void clickuArtistName() {
		uArtistName.click();
	}
}
