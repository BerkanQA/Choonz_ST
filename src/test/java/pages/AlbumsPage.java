package pages;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AlbumsPage {
	private static WebDriver driver;
	private static String URL = "http://localhost:8082/albums";
	
	@Before
	
	@Given("^I can open Choonz$")
	public void i_can_open_Choonz() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on Albums$")
	public void i_click_on_Albums() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Album Page will be displayed$")
	public void album_Page_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
}
