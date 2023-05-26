package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "email")
	public WebElement emailField;
	
	@FindBy(id = "password")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement loginButton;
	
	@FindBy(id = "newAccountBtn")
	public WebElement createNewAccountBtn;
	
	@FindBy(id = "nameInput")
	public WebElement nameInputSignup;
	
	@FindBy(id = "emailInput")
	public WebElement emailInputSignup;
	
	@FindBy(id = "passwordInput")
	public WebElement passwordInputSignup;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassInputSignup;
	
	@FindBy(id = "signupBtn")
	public WebElement signupBtn;
}
