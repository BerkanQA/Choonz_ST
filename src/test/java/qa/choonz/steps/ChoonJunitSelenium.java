package qa.choonz.steps;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import qa.choonz.pages.AdminPage;
import qa.choonz.pages.AlbumsPage;
import qa.choonz.pages.ArtistsPage;
import qa.choonz.pages.CreatePage;
import qa.choonz.pages.GenresPage;
import qa.choonz.pages.IndexPage;
import qa.choonz.pages.LoginPage;
import qa.choonz.pages.TracksPage;
import qa.choonz.utils.ScreenShot;

public class ChoonJunitSelenium {
	
	private static Logger LOGGER = Logger.getGlobal();
    private static RemoteWebDriver driver;
	static ExtentReports extent;
	static ExtentTest test;
	
	@BeforeClass
    public static void init() {
    	
		extent = new ExtentReports("src/test/resources/reports/ChoonExtentSeleniumReport.html", true);
		test = extent.startTest("Choonz Selenium Tests");
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/chromedriver.exe");
		ChromeOptions cOptions = new ChromeOptions();
		cOptions.setHeadless(false); //CHANGE THIS TO TRUE AND CHROME WONT POP UP WHEN TESTING
		driver = new ChromeDriver(cOptions);
    	cOptions.setCapability("profile.default_content_setting_values.cookies", 2);
    	cOptions.setCapability("network.cookie.cookieBehavior", 2);
    	cOptions.setCapability("profile.block_third_party_cookies", true);
		driver.manage().window().setSize(new Dimension(1366, 768));
    	
    }  
    
	@AfterClass
    public static void finalTearDown() {
		LOGGER.warning("Closing webdriver instance!");
		driver.quit();
		LOGGER.info("Webdriver closed successfully!");
		extent.endTest(test);
		extent.flush();
		extent.close();
    }
	
	@Test 
	public void signUpTest() throws Exception {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(CreatePage.CreateURL);
        
    	CreatePage createPage = PageFactory.initElements(driver, CreatePage.class);
    	
    	createPage.createUser("selenium", "selenium");
    	createPage.clickCreateAccount();
    	
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(LoginPage.LoginURL);
        
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        
    	loginPage.loginForm("selenium", "selenium");
    	loginPage.clickSubmit();
    	
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(IndexPage.indexURL);
        		
    	boolean success = driver.getPageSource().contains("Selenium") == true;
    	
        if (success) {
            test.log(LogStatus.PASS, "Success, Logged in as admin");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/LoggedIn.png");
            test.log(LogStatus.FAIL, "Failed, Cant log in as admin");
        }
  
        assertTrue(success);
		
	}
	
	
	@Test
	public void navigateAlbumPageTest() throws Exception {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(AlbumsPage.AlbumsURL);
        
        boolean success = driver.getPageSource().contains("Choonz Albums") == true;

        if (success) {
            test.log(LogStatus.PASS, "Success, Accessed albums page");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/AccessAlbum.png");
            test.log(LogStatus.FAIL, "Failed, Access to album page");
        }
  
        assertTrue(success);
	}
	
	@Test
	public void navigateArtistPageTest() throws Exception{     
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(ArtistsPage.ArtistsURL);
        
        boolean success = driver.getPageSource().contains("Choonz Artist") == true;

        if (success) {
            test.log(LogStatus.PASS, "Success, Accessed artists page");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/AccessArtist.png");
            test.log(LogStatus.FAIL, "Failed, Access to artists page");
        }
  
        assertTrue(success);
	}
	
	@Test
	public void navigateTrackPageTest() throws Exception{
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(TracksPage.TracksURL);
        
        boolean success = driver.getPageSource().contains("Choonz Tracks") == true;

        if (success) {
            test.log(LogStatus.PASS, "Success, Accessed tracks page");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/AccessTracks.png");
            test.log(LogStatus.FAIL, "Failed, Access to tracks page");
        }
  
        assertTrue(success);
	}
	
	@Test
	public void createArtistTest() throws Exception{
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(AdminPage.AdminURL);
        
		AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
		
		adminPage.clickCreateArtists();
		adminPage.createArtist("Original Selenium Artist");
		adminPage.clickCreateArtist();
		
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(ArtistsPage.ArtistsURL);
		
   	 	boolean success = driver.getPageSource().contains("Original Selenium Artist") == true;

   	 	if (success) {
   	 		test.log(LogStatus.PASS, "Success, Created artist displays on the artist page");
   	 	} else {
   	 		ScreenShot.snapShot(driver, "src/test/resources/reports/CreatedArtist.png");
   	 		test.log(LogStatus.FAIL, "Failed, Created artist does not display on the artist page");
   	 	}

   	 	assertTrue(success);
	}
	
	@Test
	public void createAlbumTest() throws Exception{
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(AdminPage.AdminURL);
        
		AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
		
		adminPage.clickCreateAlbum();
		
		Select playlistDropdownPicture = new Select(driver.findElement(By.id("albumPic")));
		playlistDropdownPicture.selectByIndex(1);
		adminPage.createAlbum("Original Selenium Album", "1");
		adminPage.createNewAlbum();
		
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(AlbumsPage.AlbumsURL);
        
        boolean success = driver.getPageSource().contains("Original Selenium Album") == true;

        if (success) {
            test.log(LogStatus.PASS, "Success, Created album displays on the page");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/CreatedAlbum.png");
            test.log(LogStatus.FAIL, "Failed, Created album does not display on the page");
        }

        assertTrue(success);
	}
	
	@Test
	public void createGenreTest() throws Exception{
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(AdminPage.AdminURL);
        
    	AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
    	
    	adminPage.clickCreateGenres();
    	adminPage.createGenre("Original Selenium Genre", "Original Selenium Genre Description");
    	adminPage.clickCreateGenresModal();
    	
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(GenresPage.GenresURL);
        
      	boolean success = driver.getPageSource().contains("Original Selenium Genre") == true;

        if (success) {
            test.log(LogStatus.PASS, "Success, Created Genre displays on the page");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/CreatedGenre.png");
            test.log(LogStatus.FAIL, "Failed, Created artist does not display on the genre page");
        }

        assertTrue(success);
        
	}
	
	@Test
	public void createTrackTest() throws Exception{
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(AdminPage.AdminURL);
        
		AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
		
		adminPage.clickCreateTrack();
		adminPage.createNewTrack("Original Selenium Track", "60", "1", "1", "Original. Selenium. Lyrics.");
		adminPage.clickCreateNewTrackModel();
		
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(TracksPage.TracksURL);
        
     	boolean success = driver.getPageSource().contains("Original Selenium Track") == true;

        if (success) {
            test.log(LogStatus.PASS, "Success, Created track displays on the page");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/CreatedTrack.png");
            test.log(LogStatus.FAIL, "Failed, Created track does not display on the page");
        }

        assertTrue(success);
	}
	
	@Test
	public void updateTrackTest() throws Exception{
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(TracksPage.TracksURL);
		
		TracksPage tracksPage = PageFactory.initElements(driver, TracksPage.class);
		
		tracksPage.clickEditTrack();
		tracksPage.updateTracks("Updated Selenium Track", "30", "1", "1", "Updated. Selenium, Lyrics.");
		tracksPage.clickEditTrackModal();
		
    	boolean success = driver.getPageSource().contains("Updated Selenium Track") == true;

        if (success) {
            test.log(LogStatus.PASS, "Success, Updated track displays on the page");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/UpdatedTrack.png");
            test.log(LogStatus.FAIL, "Failed, Updated track does not display on the page");
        }

        assertTrue(success);
	}
	
	@Test
	public void updateAlbumTest() throws Exception{
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(AlbumsPage.AlbumsURL);
        
		AlbumsPage albumsPage = PageFactory.initElements(driver, AlbumsPage.class);
		
		albumsPage.clickEditAlbum();
		Select playlistDropdownPicture = new Select(driver.findElement(By.id("albumPic")));
		playlistDropdownPicture.selectByIndex(1);
		albumsPage.updateModel("Updated Selenium Album", "1");
		albumsPage.clickUpdateModel();
		
   	 	boolean success = driver.getPageSource().contains("Updated Selenium Album") == true;

   	 	if (success) {
   	 		test.log(LogStatus.PASS, "Success, Updated album displays on the page");
   	 	} else {
   	 		ScreenShot.snapShot(driver, "src/test/resources/reports/UpdatedAlbum.png");
   	 		test.log(LogStatus.FAIL, "Failed, Updated album does not display on the page");
   	 	}

   	 	assertTrue(success);
	}
	
	@Test
	public void updateArtistTest() throws Exception{
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(ArtistsPage.ArtistsURL);
		
		ArtistsPage artistPage = PageFactory.initElements(driver, ArtistsPage.class);
		
		artistPage.clickEditArtists();
		artistPage.artistNameInput("Updated Selenium Artist");
		artistPage.clickUpdateArtist();
		
	   	boolean success = driver.getPageSource().contains("Updated Selenium Artist") == true;

	    if (success) {
	        test.log(LogStatus.PASS, "Success, Updated artist displays on the page");
	    } else {
	    	ScreenShot.snapShot(driver, "src/test/resources/reports/UpdatedArtist.png");
	        test.log(LogStatus.FAIL, "Failed, Updated artist does not display on the page");
	    }

	    assertTrue(success);
	}

	@Test
	public void deleteTrackTest() throws Exception{
	   	driver.get(TracksPage.TracksURL);
	
    	TracksPage tracksPage = PageFactory.initElements(driver, TracksPage.class);
    	tracksPage.clickDeleteTrack();
    	tracksPage.clickdDeleteTrack();
    	
   	 	driver.get(TracksPage.TracksURL);
   	 	boolean deleted = !(driver.getPageSource().contains("Updated Selenium Artist") == true);
  	 

   	 	if (deleted) {
   	 		test.log(LogStatus.PASS, "Success, artist deleted");
   	 	} else {
   	 		ScreenShot.snapShot(driver, "src/test/resources/reports/DeletedArtist.png");
   	 		test.log(LogStatus.FAIL, "Failed, artist not deleted");
   	 	}

   	 	assertTrue(deleted);
	}
	
	@Test
	public void deleteAlbumTest() throws Exception{
		driver.get(AlbumsPage.AlbumsURL);
		
    	AlbumsPage albumsPage = PageFactory.initElements(driver, AlbumsPage.class);
    	
    	albumsPage.clickDeleteAlbum();
    	albumsPage.clickConfirmDelete();
    	
   	 	driver.get(AlbumsPage.AlbumsURL);
   	 	boolean deleted = !(driver.getPageSource().contains("Updated Selenium Album") == true);
  	 

   	 	if (deleted) {
   	 		test.log(LogStatus.PASS, "Success, album deleted");
   	 	} else {
   	 		ScreenShot.snapShot(driver, "src/test/resources/reports/DeletedAlbum.png");
   	 		test.log(LogStatus.FAIL, "Failed, album not deleted");
   	 	}

   	 	assertTrue(deleted);
    }
	
	@Test
	public void deleteArtistTest() throws Exception{
		driver.get(ArtistsPage.ArtistsURL);
		
    	ArtistsPage artistPage = PageFactory.initElements(driver, ArtistsPage.class);
    	
    	artistPage.clickDeleteArtists();
    	artistPage.clickDeleteArtistsModal();
    	
   	 	driver.get(ArtistsPage.ArtistsURL);
   	 	boolean deleted = !(driver.getPageSource().contains("Updated Selenium Artist") == true);
  	 

   	 	if (deleted) {
   	 		test.log(LogStatus.PASS, "Success, artist deleted");
   	 	} else {
   	 		ScreenShot.snapShot(driver, "src/test/resources/reports/DeletedArtist.png");
   	 		test.log(LogStatus.FAIL, "Failed, artist not deleted");
   	 	}

   	 	assertTrue(deleted);
	}
}
