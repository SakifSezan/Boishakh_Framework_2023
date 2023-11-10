 package PageAction;

import org.testng.Assert;

import PageLocator.ProfilePageLocator;
import Utility.BaseClass;

public class ProfilePageAction extends BaseClass {

	ProfilePageLocator profilePageLocator = new ProfilePageLocator();
	
	public void Usercanlogin() throws InterruptedException {
	
	 Thread.sleep(5000);
	 boolean profilevefification =	profilePageLocator.profile.isDisplayed();
	 Assert.assertTrue(profilevefification);
	}
	
}
