package PageAction;

import PageLocator.LoginPageLocator;
import Utility.BaseClass;

public class LoginPageAction extends BaseClass {

	LoginPageLocator loginPageLocator = new LoginPageLocator(); 
	
	public void Typeusernamepasswordclicklogin(String u, String p) throws InterruptedException {
	    
		Thread.sleep(5000);
		loginPageLocator.Username.sendKeys(u);
		loginPageLocator.Password.sendKeys(p);
		loginPageLocator.Login.click();
		
		
		
	}
	
}
