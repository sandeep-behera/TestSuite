package page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(id="inputEmail")
	public WebElement userNameTextBox;
	
	@FindBy(id="inputPassword")
	public WebElement passwordTextBox;
	
	@FindBy(xpath="//button[text()='Login']")
	public WebElement loginButton;

}
