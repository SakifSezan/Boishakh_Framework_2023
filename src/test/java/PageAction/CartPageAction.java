package PageAction;

import org.testng.Assert;

import PageLocator.CartPageLocator;
import Utility.BaseClass;
import Utility.UtilityClass;

public class CartPageAction extends BaseClass {

	CartPageLocator cartPageLocator = new CartPageLocator();
	
	public void Verifyuserinlandedinthecartpage() {
		
		System.out.println("User is in Cart Page");
		boolean cartpageverification = cartPageLocator.VerifyCartPage.isDisplayed();
		Assert.assertTrue(cartpageverification);
		UtilityClass.takeMyScreenshot(driver, "Profile Page");
		
	}
}
