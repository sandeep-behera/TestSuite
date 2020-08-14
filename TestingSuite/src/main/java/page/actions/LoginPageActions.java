package page.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import page.locators.LoginPageLocators;
import utils.BrowserDriver;

public class LoginPageActions {
 
	LoginPageLocators loginPageLocators = null;
	
	public LoginPageActions(){
		this.loginPageLocators = new LoginPageLocators();
		PageFactory.initElements(BrowserDriver.getDriver(), loginPageLocators);
	}
	
	public void enterUserName(String userName) throws InterruptedException{
		loginPageLocators.userNameTextBox.sendKeys(userName);
		
		Thread.sleep(2000);
	}
	public void enterPasswor(String password) throws InterruptedException{
		loginPageLocators.passwordTextBox.sendKeys(password);
		Thread.sleep(2000);
	}
	public void clickLoginButton(){
		loginPageLocators.loginButton.click();
	}
}
