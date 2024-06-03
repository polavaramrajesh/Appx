package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import browserInitialization.BrowserInitialization;
import homepage.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import urlClass.Url;

public class StepDefinition {
	WebDriver driver;
	Url url;
	Homepage home;

	@Given("user wants to open Appxcelerate solutions website with URL...BrowserInitialization:browserIntialization")
	public void user_wants_to_open_appxcelerate_solutions_website_with_url_url_appx() throws IOException {
		BrowserInitialization browser=new BrowserInitialization();
		driver = browser.browserIntialization("Browser");
		home= new Homepage(driver);
	}

	@Then("validate Home page content...HomePage:homevalidation")
	public void validate_home_page_content_home_page_homevalidation() {
		home.homevalidation();
	}
}

