 package StepDefinition;

import PageAction.HomePageAction;
import PageAction.LoginPageAction;
import PageAction.ProfilePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login extends BaseClass{
	
	HomePageAction homePageAction = new HomePageAction();
	LoginPageAction loginPageAction = new LoginPageAction();
	ProfilePageAction profilePageAction = new ProfilePageAction();
	
	@Given("^Launch <\"([^\"]*)\">$")
	public void launch(String URL) throws Throwable {
		LaunchURL(URL);
		
	}
	@Then("^Click login$")
	public void click_login() throws Throwable {
		homePageAction.Clicklogin();
		
	}

	@Then("^Type username password and click login$")
	public void type_username_password_and_click_login() throws Throwable {
		loginPageAction.Typeusernamepasswordclicklogin(Prop.getProperty("Username"), Prop.getProperty("Password"));
	}

	

	@Then("^User can login$")
	public void user_can_login() throws Throwable {
	   profilePageAction.Usercanlogin();
	   
	   
	}


}
