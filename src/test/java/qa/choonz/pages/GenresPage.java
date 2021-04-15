package qa.choonz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GenresPage {

	public static final String GenresURL = "http://localhost:8082/genres";
	
	@FindBy(id = "genreName")
	private WebElement uGenreName;
	
	public void clickuArtistName() {
		uGenreName.click();
	}
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[1]/button")
	private WebElement editGenres;
	
	public void clickEditGenres() {
		editGenres.click();
	}
	
	@FindBy(xpath = "/html/body/section/div/div/div[3]/div[2]/button")
	private WebElement deleteGenres;
	
	public void clickDeleteGenres() {
		deleteGenres.click();
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[1]")
	private WebElement closeUpdateGenres;
	
	public void clickCloseUpdateGenres() {
		closeUpdateGenres.click();
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[2]")
	private WebElement updateGenres;
	
	public void clickUpdateGenres() {
		updateGenres.click();
	}
	@FindBy(id = "update-genre-name")
	private WebElement genreNameUpdate;
	
	public void genreNameInput(String genrename) {
		genreNameUpdate.sendKeys(genrename);
		genreNameUpdate.submit();
	}
	
	@FindBy(id = "genreName")
	private WebElement genreNames;
	
	public void clickGenreNames() {
		genreNames.click();
	}
	
}
