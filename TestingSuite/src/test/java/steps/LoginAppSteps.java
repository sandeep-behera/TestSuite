package steps;

import java.util.Properties;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.actions.LoginPageActions;
import utils.BrowserDriver;


public class LoginAppSteps {
	
	@Given("^user navigates to the website \"([^\"]*)\"$")
	public void user_navigates_to_the_website(String appUrl) throws Throwable {
	    appUrl = BrowserDriver.readPropertiesFile("url");
	    BrowserDriver.openApp(appUrl);
	}

	@And("^there user logs in through Login Window by using Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void there_user_logs_in_through_Login_Window_by_using_Username_as_and_Password_as(String userName, String password) throws Throwable {
		LoginPageActions loginPageActions = new LoginPageActions();
		loginPageActions.enterUserName("admin");
		loginPageActions.enterPasswor("admin");
		
	}
	@When("^User clicks Login Button$")
	public void user_clicks_Login_Button() throws Throwable {
		LoginPageActions loginPageActions = new LoginPageActions();
		loginPageActions.clickLoginButton();
	}

	@Then("^login must be successful\\.$")
	public void login_must_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("login successful");
	}
}
