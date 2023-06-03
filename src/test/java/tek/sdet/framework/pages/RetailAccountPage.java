package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// Scenario: Verify User can update Profile Information
	@FindBy(id = "profileImage")
	public WebElement profileImage;
	
	@FindBy(id = "nameInput")
	public WebElement nameInput;

	@FindBy(id = "personalPhoneInput")
	public WebElement phoneInput;
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement personalUpdateButton;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMessage;
	
	// Scenario: Verify User can add a payment method
	@FindBy(xpath = "//p[@class='text-sm text-blue-700 hover:underline hover:text-red-700']")
	public WebElement addPaymentLink;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInput;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInput;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInput;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement addYourCardBtn;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement addPaymntSuccessMessage;
	
	
	// Scenario: Verify User can edit Debit or Credit card
	@FindBy(xpath = "//p[@class='account__payment__sub-text']")
	public WebElement debitOrCrediCard;
	
	@FindBy(xpath = "//div[@class='account__payment']//button[text()='Edit']")
	public WebElement editButtonPayment;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement updateYourCardBtn;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement updatePaymentMethodSuccessMessage;
	
	// Verify User can remove Debit or Credit card
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removePaymentCardButton;

	// Scenario: Verify User can add an Address
	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAddrress;
	
	@FindBy(id = "countryDropdown")
	public WebElement countryDropdown;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameAddress;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberAddress;
	
	@FindBy(id = "streetInput")
	public WebElement address;
	
	@FindBy(id = "apartmentInput")
	public WebElement aprtmentNumber;
	
	@FindBy(id = "cityInput")
	public WebElement cityInput;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateInput;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInput;
	
	@FindBy(id = "addressBtn")
	public WebElement addYourAddressBtn;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddSuccessMessage;
	
	// Scenario: Verify User can edit an Address added on account
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editAddress;
	
	@FindBy(id = "addressBtn")
	public WebElement updateYourAddress;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdateSuccessMessage;
	
	// Scenario: Verify User can remove Address from Account
	@FindBy(xpath = "//div[@class='account__address-single']//button[text()='Remove']")
	public WebElement removeAddress;
	

	
	
	
	

	
	
	
	
}
