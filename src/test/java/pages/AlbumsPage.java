package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlbumsPage {
	
public static final String AlbumsURL = "http://http://localhost:8082/albums";
	

	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[1]/button")
	private WebElement editAlbum;
	
	public void clickEditAlbum() {
	editAlbum.click();
	}
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[2]/button")
	private WebElement deleteAlbum;
	
	public void clickDeleteAlbum() {
		deleteAlbum.click();
	}
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/button[1]")
	private WebElement closeUpdateAlbum;
	
	public void clickCloseUpdateAlbum() {
		closeUpdateAlbum.click();
	}
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/button[2]") 
		private WebElement updateAlbum;
	
	public void clickUpdate() {
		updateAlbum.click();
	}

	@FindBy(xpath = "/html/body/section/div/div/div[2]/div/div[2]/a")
	private WebElement artistPage; 
	
	public void clickArtistlink() {
		artistPage.click();
	}
	
}
