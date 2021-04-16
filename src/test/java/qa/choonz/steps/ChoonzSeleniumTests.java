package qa.choonz.steps;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.choonz.pages.*;
import qa.choonz.utils.ScreenShot;

public class ChoonzSeleniumTests {
	
	private static Logger LOGGER = Logger.getGlobal();
    private static RemoteWebDriver driver;
	static ExtentReports extent;
	static ExtentTest test;
	
	@Before
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
    
	/*
    @Before
    public void setup() {      
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		try {
			driver.get(IndexPage.IndexURL);
		} catch (TimeoutException e) {
			System.out.println("Page: " + IndexPage.IndexURL + " did not load within 30 seconds!");
		}
    }
    */
    
	@After
    public static void finalTearDown() {
		LOGGER.warning("Closing webdriver instance!");
		driver.quit();
		LOGGER.info("Webdriver closed successfully!");
		extent.endTest(test);
		extent.flush();
		extent.close();
    }
	
	/*

	@Then("^I create a new playlist$")
	public void i_create_a_new_playlist() throws Throwable {
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		
		indexPage.clickCreatePlaylist();
		
		Select playlistDropdownPicture = new Select(driver.findElement(By.id("playlistPic")));
		playlistDropdownPicture.selectByIndex(1);
		indexPage.fillCreatePlaylistForm("My Playlist", "My playlist description");
		indexPage.clickCreatePlaylistModal();		

	}
	
	*/
    
    @Given("^I can access Choonz$")
    public void i_can_access_Choonz() throws Throwable {		
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //Driver.get goes to the index page via the given URL
        driver.get(IndexPage.indexURL);

        // Checks if "Welcome to Choonz!" is anywhere on the page
        boolean success = driver.getPageSource().contains("Welcome to Choonz!") == true;

        //Sets up the true or flase
        if (success) {
        	//Sets the extent test as a pass!
            test.log(LogStatus.PASS, "Success, Accessed Choonz site");
        } else {
        	//Sets the extent test as a fail and takes a screenshot to the given path
        	ScreenShot.snapShot(driver, "src/test/resources/reports/AccessChoonz.png");
            test.log(LogStatus.FAIL, "Failed, No Access to Choonz site");
        }
       
        //Sets the junit test to pass or fail depending on success!
        assertTrue(success);
    }

    @When("^I access Login page$")
    public void i_access_Login_page() throws Throwable {	
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(LoginPage.LoginURL);
        boolean success = driver.getPageSource().contains("Choonz Music Login") == true;
        if (success) {
            test.log(LogStatus.PASS, "Success, Accessed login page");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/AccessLogin.png");
            test.log(LogStatus.FAIL, "Failed, Access to login page");
        }
        assertTrue(success);
    }

    @When("^I access the Create page$")
    public void i_access_the_Create_page() throws Throwable {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(CreatePage.CreateURL);

        boolean success = driver.getPageSource().contains("Choonz Music Create Account") == true;

        if (success) {
            test.log(LogStatus.PASS, "Success, Accessed create account page");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/AccessCreate.png");
            test.log(LogStatus.FAIL, "Failed, Access to create account page");
        }
       
        assertTrue(success);
    }

    @Then("^Enter create accounts details$")
    public void enter_create_accounts_details() throws Throwable {
    	CreatePage createPage = PageFactory.initElements(driver, CreatePage.class);
    	
    	createPage.createUser("selenium", "selenium");
    	createPage.clickCreateAccount();
    }

    @When("^Enter login account details$")
    public void enter_login_account_details() throws Throwable {
    	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    	
    	loginPage.loginForm("selenium", "selenium");
    	loginPage.clickSubmit();
    }

    @Then("^I am signed in$")
    public void i_am_signed_in() throws Throwable {
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

    @When("^I access Albums page$")
    public void i_access_Albums_page() throws Throwable {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(AlbumsPage.AlbumsURL);
    }

    @Then("^Album Page will be displayed$")
    public void album_Page_will_be_displayed() throws Throwable {
        boolean success = driver.getPageSource().contains("Choonz Albums") == true;

        if (success) {
            test.log(LogStatus.PASS, "Success, Accessed albums page");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/AccessAlbum.png");
            test.log(LogStatus.FAIL, "Failed, Access to album page");
        }
  
        assertTrue(success);
    }

    @When("^I access Tracks page$")
    public void i_access_Tracks_page() throws Throwable {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(TracksPage.TracksURL);
    }

    @Then("^Tracks Page will be displayed$")
    public void tracks_Page_will_be_displayed() throws Throwable {
        boolean success = driver.getPageSource().contains("Choonz Tracks") == true;

        if (success) {
            test.log(LogStatus.PASS, "Success, Accessed tracks page");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/AccessTracks.png");
            test.log(LogStatus.FAIL, "Failed, Access to tracks page");
        }
  
        assertTrue(success);
    }

    @When("^I access Artists page$")
    public void i_access_Artists_page() throws Throwable {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(ArtistsPage.ArtistsURL);
    }

    @Then("^Artists Page will be displayed$")
    public void artists_Page_will_be_displayed() throws Throwable {
        boolean success = driver.getPageSource().contains("Choonz Artist") == true;

        if (success) {
            test.log(LogStatus.PASS, "Success, Accessed artists page");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/AccessArtist.png");
            test.log(LogStatus.FAIL, "Failed, Access to artists page");
        }
  
        assertTrue(success);
    }

    @Given("^I am signed in as an Admin$")
    public void i_am_signed_in_as_an_Admin() throws Throwable {
    	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    	
    	loginPage.loginForm("selenium", "selenium");
    	loginPage.clickSubmit();
    	
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

    @When("^I access Admin page$")
    public void i_access_Admin_page() throws Throwable {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(AdminPage.AdminURL);
        
        boolean success = driver.getPageSource().contains("Choonz Admin") == true;

        if (success) {
            test.log(LogStatus.PASS, "Success, Accessed Admin page");
        } else {
        	ScreenShot.snapShot(driver, "src/test/resources/reports/AccessAdmin.png");
            test.log(LogStatus.FAIL, "Failed, Access to admin page");
        }
  
        assertTrue(success);
    }

    @Then("^I create a new Artist$")
    public void i_create_a_new_Artist() throws Throwable {
		AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
		
		adminPage.clickCreateArtists();
		adminPage.createArtist("Original Selenium Artist");
		adminPage.clickCreateArtist();
    }

    @Then("^Artist information will be displayed$")
    public void artist_information_will_be_displayed() throws Throwable {
    	 boolean success = driver.getPageSource().contains("Original Selenium Artist") == true;

         if (success) {
             test.log(LogStatus.PASS, "Success, Created artist displays on the artist page");
         } else {
         	ScreenShot.snapShot(driver, "src/test/resources/reports/CreatedArtist.png");
             test.log(LogStatus.FAIL, "Failed, Created artist does not display on the artist page");
         }
   
         assertTrue(success);
    	
    }

    @Then("^I create a new Album$")
    public void i_create_a_new_Album() throws Throwable {
		AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
		
		adminPage.clickCreateAlbum();
		
		Select playlistDropdownPicture = new Select(driver.findElement(By.id("albumPic")));
		playlistDropdownPicture.selectByIndex(1);
		adminPage.createAlbum("Original Selenium Album");
		adminPage.createNewAlbum();
    }

    @Then("^Album information will be displayed$")
    public void album_information_will_be_displayed() throws Throwable {
   	 boolean success = driver.getPageSource().contains("Original Selenium Album") == true;

     if (success) {
         test.log(LogStatus.PASS, "Success, Created album displays on the page");
     } else {
     	ScreenShot.snapShot(driver, "src/test/resources/reports/CreatedAlbum.png");
         test.log(LogStatus.FAIL, "Failed, Created album does not display on the page");
     }

     assertTrue(success);
    }

    @Then("^I create a new Track$")
    public void i_create_a_new_Track() throws Throwable {
		AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
		
		adminPage.clickCreateTrack();
		adminPage.createNewTrack("Original Selenium Track", "60", "1", "1", "Original. Selenium. Lyrics.");
		adminPage.clickCreateNewTrackModel();
    }

    @Then("^Tracks information will be displayed$")
    public void tracks_information_will_be_displayed() throws Throwable {
      	 boolean success = driver.getPageSource().contains("Original Selenium Track") == true;

         if (success) {
             test.log(LogStatus.PASS, "Success, Created track displays on the page");
         } else {
         	ScreenShot.snapShot(driver, "src/test/resources/reports/CreatedTrack.png");
             test.log(LogStatus.FAIL, "Failed, Created track does not display on the page");
         }

         assertTrue(success);
    }

    @Then("^I update a Track$")
    public void i_update_a_Track() throws Throwable {
		TracksPage tracksPage = PageFactory.initElements(driver, TracksPage.class);
		
		tracksPage.clickEditTrack();
		tracksPage.updateTracks("Updated Selenium Track", "30", "1", "1", "Updated. Selenium, Lyrics.");
		tracksPage.clickEditTrackModal();
		
    }

    @Then("^Updated Tracks information will be displayed$")
    public void updated_Tracks_information_will_be_displayed() throws Throwable {
     	 boolean success = driver.getPageSource().contains("Updated Selenium Track") == true;

         if (success) {
             test.log(LogStatus.PASS, "Success, Updated track displays on the page");
         } else {
         	ScreenShot.snapShot(driver, "src/test/resources/reports/UpdatedTrack.png");
             test.log(LogStatus.FAIL, "Failed, Updated track does not display on the page");
         }

         assertTrue(success);
    }

    @Then("^I update the Album$")
    public void i_update_the_Album() throws Throwable {
		AlbumsPage albumsPage = PageFactory.initElements(driver, AlbumsPage.class);
		
		albumsPage.clickEditAlbum();
		Select playlistDropdownPicture = new Select(driver.findElement(By.id("albumPic")));
		playlistDropdownPicture.selectByIndex(1);
		albumsPage.updateModel("Updated Selenium Album");
		albumsPage.clickUpdateModel();
    }

    @Then("^Updated Album information will be displayed$")
    public void updated_Album_information_will_be_displayed() throws Throwable {
    	 boolean success = driver.getPageSource().contains("Updated Selenium Album") == true;

         if (success) {
             test.log(LogStatus.PASS, "Success, Updated album displays on the page");
         } else {
         	ScreenShot.snapShot(driver, "src/test/resources/reports/UpdatedAlbum.png");
             test.log(LogStatus.FAIL, "Failed, Updated album does not display on the page");
         }

         assertTrue(success);
    }

    @Then("^I update the Artist$")
    public void i_update_the_Artist() throws Throwable {
		ArtistsPage artistPage = PageFactory.initElements(driver, ArtistsPage.class);
		
		artistPage.clickEditArtists();
		artistPage.artistNameInput("Updated Selenium Artist");
		artistPage.clickUpdateArtist();
    }

    @Then("^Updated Artist information will be displayed$")
    public void updated_Artist_information_will_be_displayed() throws Throwable {
   	 boolean success = driver.getPageSource().contains("Updated Selenium Artist") == true;

     if (success) {
         test.log(LogStatus.PASS, "Success, Updated artist displays on the page");
     } else {
     	ScreenShot.snapShot(driver, "src/test/resources/reports/UpdatedArtist.png");
         test.log(LogStatus.FAIL, "Failed, Updated artist does not display on the page");
     }

     assertTrue(success);
    }

    @Then("^I delete a Track$")
    public void i_delete_a_Track() throws Throwable {
    	TracksPage tracksPage = PageFactory.initElements(driver, TracksPage.class);
    	tracksPage.clickDeleteTrack();
    	tracksPage.clickdDeleteTrack();
    }

    @Then("^Tracks information is removed$")
    public void tracks_information_is_removed() throws Throwable {
    	
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

    @Then("^I delete the Album$")
    public void i_delete_the_Album() throws Throwable {
    	AlbumsPage albumsPage = PageFactory.initElements(driver, AlbumsPage.class);
    	
    	albumsPage.clickDeleteAlbum();
    	albumsPage.clickConfirmDelete();
    }

    @Then("^Album information is removed$")
    public void album_information_is_removed() throws Throwable {
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

    @Then("^I delete the Artist$")
    public void i_delete_the_Artist() throws Throwable {
    	ArtistsPage artistPage = PageFactory.initElements(driver, ArtistsPage.class);
    	
    	artistPage.clickDeleteArtists();
    	artistPage.clickDeleteArtistsModal();
    }

    @Then("^Artist information is removed$")
    public void artist_information_is_removed() throws Throwable {
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
    
    @Then("^I create a new Genre$")
    public void i_create_a_new_Genre() throws Throwable {
    	AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
    	
    	adminPage.clickCreateGenres();
    	adminPage.createGenre("Original Selenium Genre", "Original Selenium Genre Description");
    	adminPage.clickCreateGenresModal();
    	
    }

    @When("^I access Genre page$")
    public void i_access_Genre_page() throws Throwable {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(GenresPage.GenresURL);
    }

    @Then("^Genre information will be displayed$")
    public void genre_information_will_be_displayed() throws Throwable {
   	 boolean success = driver.getPageSource().contains("Original Selenium Genre") == true;

     if (success) {
         test.log(LogStatus.PASS, "Success, Created Genre displays on the page");
     } else {
     	ScreenShot.snapShot(driver, "src/test/resources/reports/CreatedGenre.png");
         test.log(LogStatus.FAIL, "Failed, Created artist does not display on the genre page");
     }

     assertTrue(success);
    }
    
}
