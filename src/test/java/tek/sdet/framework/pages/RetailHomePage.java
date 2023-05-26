package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
	public WebElement retailLogo;
	
	@FindBy(id = "signinLink")
	public WebElement signInOption;
	
	@FindBy(linkText = "Account")
	public WebElement accountOption;
	
	@FindBy(linkText = "Orders")
	public WebElement ordersOption;
	
	@FindBy(id = "logoutBtn")
	public WebElement logOutOption;
	
	// Scenario: Verify Shop by Department sidebar & 
	// Scenario Outline: Verify department sidebar options
	@FindBy(id = "hamburgerBtn")
	public WebElement allSection;
	
	@FindBy(xpath = "//div[@class='sidebar_content-item']")
	public List<WebElement> departments;
	
}
