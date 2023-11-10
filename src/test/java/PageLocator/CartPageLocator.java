package PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class CartPageLocator extends BaseClass {

	public CartPageLocator() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Place Order']")
	public WebElement VerifyCartPage;
}
