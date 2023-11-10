package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomeLink extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();

	@Given("^Launch <\"([^\"]*)\"> NET$")
	public void launch_NET(String URL) throws Throwable {
		LaunchURL(URL);
	}

	@Then("^Click on Home link$")
	public void click_on_Home_link() throws Throwable {
		homePageAction.ClickonHomelink();
	}

	@Then("^Verify user can see Home page$")
	public void verify_user_can_see_Home_page() throws Throwable {
	   
	}



}
