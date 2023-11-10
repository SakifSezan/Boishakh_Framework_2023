package PageAction;



import PageLocator.HomePageLocator;

import Utility.BaseClass;

public class HomePageAction extends BaseClass {
	
	HomePageLocator homePageLocator = new HomePageLocator();
	
	
	public void Clicklogin() {
		homePageLocator.LoginLink.click();
		
	}

	public void Clickonsignuplink() {
		
		
		
	}

	public void ClickCartlink() {
		homePageLocator.CartLink.click();
		
	}
	
    public void ClickLaptoplink() {
    	homePageLocator.LaptopLink.click();
    	
    }
    public void  ClickonHomelink() throws Exception {
    	homePageLocator.AboutUsLink.click();
    	Thread.sleep(1000);
    	homePageLocator.HomeLink.click();
    }
    
	}
