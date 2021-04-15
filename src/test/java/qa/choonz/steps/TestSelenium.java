package qa.choonz.steps;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import qa.choonz.pages.IndexPage;
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
	
	@Test
	public void i_can_access_Choonz() throws Exception {
		
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

	
}
