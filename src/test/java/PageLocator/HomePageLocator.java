package PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class HomePageLocator extends BaseClass {
	
	public HomePageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "login2")
	public WebElement LoginLink;

	@FindBy(id = "signin2")
	public WebElement HTX;
	

	@FindBy(id = "cartur")
	public WebElement CartLink;
	
	
	@FindBy(id = "itemc")
	public WebElement LaptopLink;
	
	@FindBy(id = "signin2")
	public WebElement SignupLink;
	
	@FindBy(id = "itemc")
	public WebElement Link;
	
	@FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
 	public WebElement AboutUsLink;
 	
 	@FindBy(xpath = "/html/body/div[1]/section/div/div[2]/div/div/div/nav[1]/ul/li[1]/a")
 	public WebElement HomeLink;
     
} 
