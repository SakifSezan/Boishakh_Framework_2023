package PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class ProfilePageLocator extends BaseClass {

public ProfilePageLocator () {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "nameofuser")
	public WebElement  profile;

	@FindBy(id = "")
	public WebElement Password;
	

	@FindBy(id = "")
	public WebElement Login;
	
	
 
} 
	

