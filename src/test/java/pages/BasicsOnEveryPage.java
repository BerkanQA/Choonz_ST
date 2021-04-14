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
	
	@FindBy(xpath = "/html/body/nav/div/div/ul[1]/li[1]/a")
	private WebElement bfeaturedTracks; 
	
	public void clickFeaturedTracks() {
		bfeaturedTracks.click();
	}
	
	@FindBy(xpath = "/html/body/nav/div/div/ul[1]/li[2]/a")
	private WebElement bArtists;
	
	public void clickBArtists() {
		bArtists.click();
	}
	
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
	
}
