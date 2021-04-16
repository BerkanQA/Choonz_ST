package qa.choonz.steps;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import qa.choonz.pages.*;
import qa.choonz.utils.ScreenShot;

public class TestSelenium {

	
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
    
    @Given("^Test Case$")
    public void test_Case() throws Throwable {
		//Gets the info from the IndexPage
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //Driver.get goes to the index page via the given URL
        driver.get(indexPage.indexURL);

        // Checks if "Welcome to Choonz!" is anywhere on the page
        boolean success = driver.getPageSource().contains("dsadsad") == true;

        //Sets up the true or flase
        if (success) {
        	//Sets the extent test as a pass!
            test.log(LogStatus.PASS, "Success, deleteTaskTest");
        } else {
        	//Sets the extent test as a fail and takes a screenshot to the given path
        	ScreenShot.snapShot(driver, "src/test/resources/reports/Example.png");
            test.log(LogStatus.FAIL, test.addScreenCapture("src/test/resources/reports/deleteTaskTest.png") + "Test Failed, deleteTaskTest");
        }
       
        //Sets the junit test to pass or fail depending on success!
        assertTrue(success);
    }
	
	@Test
	public void i_can_access_Choonz() throws Exception {
		
		//Gets the info from the IndexPage
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //Driver.get goes to the index page via the given URL
        driver.get(indexPage.indexURL);

        // Checks if "Welcome to Choonz!" is anywhere on the page
        boolean success = driver.getPageSource().contains("Choon") == true;

        //Sets up the true or flase
        if (success) {
        	//Sets the extent test as a pass!
            test.log(LogStatus.PASS, "Success, deleteTaskTest");
        } else {
        	//Sets the extent test as a fail and takes a screenshot to the given path
        	ScreenShot.snapShot(driver, "src/test/resources/reports/Example.png");
            test.log(LogStatus.FAIL, test.addScreenCapture("src/test/resources/reports/deleteTaskTest.png") + "Test Failed, deleteTaskTest");
        }
       
        //Sets the junit test to pass or fail depending on success!
        assertTrue(success);
	}
	
	@Test
	public void CreateTrackTest() throws Exception {
		
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(AdminPage.AdminURL);
        
		AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
		
		adminPage.clickCreateTrack();
		
        new WebDriverWait(driver, 10)
        .until(ExpectedConditions.elementToBeClickable(By.id("lyricsTextBox")));
		
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
	public void CreateGenreTest() throws Exception {
		
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(AdminPage.AdminURL);
        
    	AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
    	
    	adminPage.clickCreateGenres();
    	
        new WebDriverWait(driver, 10)
        .until(ExpectedConditions.elementToBeClickable(By.id("create-genre-name")));
    	
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
	public void CreateArtistTest() throws Exception {
		
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(AdminPage.AdminURL);
        
		AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
		
		adminPage.clickCreateArtists();
		
        new WebDriverWait(driver, 10)
        .until(ExpectedConditions.elementToBeClickable(By.id("create-artist-name")));
		
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
	public void CreateAlbumTest() throws Exception {
		
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(AdminPage.AdminURL);
        
    	AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
    	
    	adminPage.clickCreateGenres();
    	
        new WebDriverWait(driver, 10)
        .until(ExpectedConditions.elementToBeClickable(By.id("create-album-name")));
    	
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

	
}
