package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.StartUpInitilize;

public class LoginpageLocators {
		
	public LoginpageLocators() {
		StartUpInitilize initilize = new StartUpInitilize();
		PageFactory.initElements(initilize.getDriver(),this);
		}

	@FindBy(xpath="//span[text()='Hello. Sign in']")
	public WebElement loginBtn;

	@FindBy(xpath="//input[@id=('ap_email')]")
	public WebElement username;

	@FindBy(xpath="//input[@id=('continue')]")
	public WebElement submit;

	@FindBy(xpath="//input[@id=('ap_password')]")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement login;

	@FindBy(xpath="//*[@id='nav-item-signout']/span")
	public WebElement logout;

	/*public class MouseActions{
	StartUpInitilize initilize = new StartUpInitilize();
	Actions action=new Actions(initilize.getDriver());
	}*/

}
