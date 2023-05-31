package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// Scenario: Verify User can add an item to cart
	@FindBy(id = "search")
	public WebElement allDepartments;
	
	@FindBy(id = "searchInput")
	public WebElement searchInput;
	
	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//img[@class='image']")
	public WebElement productImg;
	
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement quantitySelect;
	
	@FindBy(xpath = "//span[text()='Add to Cart']")
	public WebElement addToCartBtn;
	
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartQuantity;
		
	// Scenario: Verify User can place an order with Shipping address and payment Method on file​​​​​​​
	
	@FindBy(id = "cartBtn")
	public WebElement cartBtn;
	
	@FindBy(id = "proceedBtn")
	public WebElement proceedBtn;
	
	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedMsg;
	
	// Scenario: Verify User can cancel the order
	@FindBy(id = "orderLink") 
	public WebElement orderLink;
	
	@FindBy(xpath = "//div[@class='order']//descendant::p[7]")
	public List<WebElement> listOfOrders;
	
	@FindBy(xpath = "//p[text()='Show Details']")
	public WebElement showDetailsLink;
	
	@FindBy(xpath = "//div[@class='order']//descendant::button[@id='cancelBtn']")
	public List<WebElement> cancelTheOrderBtn;
	
	@FindBy(id = "reasonInput")
	public WebElement reasonSelection;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelOrderBtn;
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancelationMessage;
	
	// scenario: Verify User can Return the order
	@FindBy(id = "returnBtn")
	public List<WebElement> returnItemsBtn;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropOffInput;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement returnOrderBtn;
	
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnMessage;
	
	// scenario: Verify User can write a review on order placed
	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;
	
	@FindBy(xpath = "//input[@name='headline']")
	public WebElement reviewHeadline;
	
	@FindBy(xpath = "//textarea[@name='comment']")
	public WebElement reviewComment;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitBtn;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewAddedMessage;
	
	
}
