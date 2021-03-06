package qa.choonz.steps;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
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
        	ScreenShot.snapShot(driver, "src/test/resources/reports/AccessChoonz.png");
            test.log(LogStatus.FAIL, "Failed, No Access to Choonz site");
        }
       
        //Sets the junit test to pass or fail depending on success!
        assertTrue(success);
    }

    @When("^I access Login page$")
    public void i_access_Login_page() throws Throwable {	
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(IndexPage.indexURL);

        boolean success = driver.getPageSource().contains("Welcome to Choonz!") == true;

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
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Enter create accounts details$")
    public void enter_create_accounts_details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Enter login account details$")
    public void enter_login_account_details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I am signed in$")
    public void i_am_signed_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
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

    @Given("^I am signed in as an Admin$")
    public void i_am_signed_in_as_an_Admin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I access Admin page$")
    public void i_access_Admin_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I create a new Artist$")
    public void i_create_a_new_Artist() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Artist information will be displayed$")
    public void artist_information_will_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I create a new Album$")
    public void i_create_a_new_Album() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Album information will be displayed$")
    public void album_information_will_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I create a new Track$")
    public void i_create_a_new_Track() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Tracks information will be displayed$")
    public void tracks_information_will_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I update a Track$")
    public void i_update_a_Track() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Updated Tracks information will be displayed$")
    public void updated_Tracks_information_will_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I update the Album$")
    public void i_update_the_Album() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Updated Album information will be displayed$")
    public void updated_Album_information_will_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I update the Artist$")
    public void i_update_the_Artist() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Updated Artist information will be displayed$")
    public void updated_Artist_information_will_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I delete a Track$")
    public void i_delete_a_Track() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Tracks information is removed$")
    public void tracks_information_is_removed() throws Throwable {
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

    @Then("^I delete the Artist$")
    public void i_delete_the_Artist() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Artist information is removed$")
    public void artist_information_is_removed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    
}
