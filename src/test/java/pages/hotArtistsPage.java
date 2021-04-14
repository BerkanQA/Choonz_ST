package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class hotArtistsPage {
	public static final String hotArtistURL = "http://http://localhost:8082/hotArtists";

	@FindBy(id = "artistName")
	private WebElement uArtistName;
	
	public void clickuArtistName() {
		uArtistName.click();
	}
}
