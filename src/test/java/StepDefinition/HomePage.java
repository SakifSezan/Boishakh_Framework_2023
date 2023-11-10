package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Then;

public class HomePage extends BaseClass {
	HomePageAction homePageAction = new HomePageAction();
	
	@Then("^Click Laptop link$")
	public void click_Laptop_link() throws Throwable {
		Thread.sleep(3000);
		homePageAction.ClickLaptoplink();
		
	}
}
