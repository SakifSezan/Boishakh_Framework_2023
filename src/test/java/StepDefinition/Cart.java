package StepDefinition;

import PageAction.CartPageAction;
import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Then;

public class Cart extends BaseClass {
	HomePageAction homePageAction = new HomePageAction();
	CartPageAction cartPageAction = new CartPageAction();
	
	
	@Then("^Click Cart link$")
	public void click_Cart_link() throws Throwable {
		Thread.sleep(3000); 
		homePageAction.ClickCartlink();
		
		
	}

	@Then("^Verify user in landed in the cart page$")
	public void verify_user_in_landed_in_the_cart_page() throws Throwable {
		Thread.sleep(3000);
		cartPageAction.Verifyuserinlandedinthecartpage();
		
	}


}
