package qa.choonz.steps;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
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
	
	@BeforeClass
    public static void init() {
    	
		extent = new ExtentReports("src/test/resources/reports/report1.html", true);
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
    
    @AfterClass
    public static void finalTearDown() {
		LOGGER.warning("Closing webdriver instance!");
		driver.quit();
		LOGGER.info("Webdriver closed successfully!");
		extent.endTest(test);
		extent.flush();
		extent.close();
    }
	
	@Given("^I can access Choonz$")
	public void i_can_access_Choonz() throws Throwable {
		
		//Gets the info from the IndexPage
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //Driver.get goes to the index page via the given URL
        driver.get(indexPage.indexURL);

        // Checks if "Welcome to Choonz!" is anywhere on the page
        boolean success = driver.getPageSource().contains("Welcome to Choonz!") == true;

        //Sets up the true or flase
        if (success) {
        	//Sets the extent test as a pass!
            test.log(LogStatus.PASS, "Success, Accessed Choonz site");
        } else {
        	//Sets the extent test as a fail and takes a screenshot to the given path
        	ScreenShot.snapShot(driver, "src/test/resources/reports/Example.png");
            test.log(LogStatus.FAIL, test.addScreenCapture("src/test/resources/reports/deleteTaskTest.png") + "Test Failed, No access Choonz site");
        }
       
        //Sets the junit test to pass or fail depending on success!
        assertTrue(success);
	}

	@When("^I access Albums page$")
	public void i_access_Albums_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Album Page will be displayed$")
	public void album_Page_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I am signed in as a user$")
	public void i_am_signed_in_as_a_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I access Playlist page$")
	public void i_access_Playlist_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I create a new playlist$")
	public void i_create_a_new_playlist() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Playlist information is displayed on the screen$")
	public void playlist_information_is_displayed_on_the_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I access Login page$")
	public void i_access_Login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click the link to signup$")
	public void i_click_the_link_to_signup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I enter valid signup credentials$")
	public void i_enter_valid_signup_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I click the Submit button$")
	public void i_click_the_Submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I am signed in as a User$")
	public void i_am_signed_in_as_a_User() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I access Home page$")
	public void i_access_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Playlist information displayed on the screen$")
	public void playlist_information_displayed_on_the_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I access Playlists page$")
	public void i_access_Playlists_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click Edit Playlist button$")
	public void i_click_Edit_Playlist_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on Update button$")
	public void i_click_on_Update_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Updated Playlist is displayed$")
	public void updated_Playlist_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click Delete Playlist button$")
	public void i_click_Delete_Playlist_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on Delete button$")
	public void i_click_on_Delete_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Playlist is removed$")
	public void playlist_is_removed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I am signed in as an Admin$")
	public void i_am_signed_in_as_an_Admin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Tracks will be displayed$")
	public void tracks_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I am signed as an Admin$")
	public void i_am_signed_as_an_Admin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I access Album Page$")
	public void i_access_Album_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on Artist Name$")
	public void i_click_on_Artist_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Artist Page is displayed$")
	public void artist_Page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I access Artist page$")
	public void i_access_Artist_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I can access back to Album page$")
	public void i_can_access_back_to_Album_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on search$")
	public void i_click_on_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Results should be displayed$")
	public void results_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter values in searchbar$")
	public void i_enter_values_in_searchbar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I click the search button$")
	public void i_click_the_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^values are returned$")
	public void values_are_returned() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I access Tracks page$")
	public void i_access_Tracks_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Tracks Page will be displayed$")
	public void tracks_Page_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I create a new Track$")
	public void i_create_a_new_Track() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Tracks information is displayed on the screen$")
	public void tracks_information_is_displayed_on_the_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I update a  Track$")
	public void i_update_a_Track() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I delete a  Track$")
	public void i_delete_a_Track() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Tracks information is removed$")
	public void tracks_information_is_removed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I create a new Artist$")
	public void i_create_a_new_Artist() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Artist information is displayed on the screen$")
	public void artist_information_is_displayed_on_the_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I update the Artist$")
	public void i_update_the_Artist() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I delete the Artist$")
	public void i_delete_the_Artist() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Artist information is removed from the screen$")
	public void artist_information_is_removed_from_the_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I access Album page$")
	public void i_access_Album_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I update the Album$")
	public void i_update_the_Album() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Album information is displayed on the screen$")
	public void album_information_is_displayed_on_the_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I delete the Album$")
	public void i_delete_the_Album() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Album information is removed$")
	public void album_information_is_removed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I access Genres page$")
	public void i_access_Genres_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I update the Genres$")
	public void i_update_the_Genres() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Genres information is displayed on the screen$")
	public void genres_information_is_displayed_on_the_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I access Artists page$")
	public void i_access_Artists_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Artists Page will be displayed$")
	public void artists_Page_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I access Admin page$")
	public void i_access_Admin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I create the track$")
	public void i_create_the_track() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I access track page$")
	public void i_access_track_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Track page will be displayed$")
	public void track_page_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Track information is displayed on screen$")
	public void track_information_is_displayed_on_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
