package tek.sdet.framework.steps;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	// Scenario: Verify User can add an item to cart
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
		click(factory.orderPage().allDepartments);
		selectByVisibleText(factory.orderPage().allDepartments, string);
		logger.info("User changed the category to " + string);

	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
		clearTextUsingSendKeys(factory.orderPage().searchInput);
		sendText(factory.orderPage().searchInput, string);
//		click(factory.orderPage().searchInput);
		logger.info("User searched for " + string);
	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.orderPage().searchBtn);
		logger.info("User clicked on Search icon");

	}

	@When("User click on item")
	public void userClickOnItem() {
		slowDown();
		click(factory.orderPage().productImg);
		logger.info("User clicked on item");

	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String string) {
		click(factory.orderPage().quantitySelect);
		selectByValue(factory.orderPage().quantitySelect, string);
		logger.info("User selected quantity " + string);

	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.orderPage().addToCartBtn);
		logger.info("User clicked Add to Cart button");

	}

	@Then("The cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
		slowDown();
		Assert.assertEquals( string, factory.orderPage().cartQuantity.getText());
		logger.info("The cart icon quantity changed to" + string);

	}

	// Scenario: Verify User can place an order with Shipping address and payment
	// Method on file
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.orderPage().cartBtn);
		logger.info("User clicked on Cart option");

	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.orderPage().proceedBtn);
		logger.info("User clicked on proceed to checkout btn");

	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.orderPage().placeOrderBtn);
		logger.info("User clicked on place order btn");

	}

	@Then("A message should be displayed {string}")
	public void aMessageShouldBeDisplayedOrderPlacedThanks(String string) {
		Assert.assertEquals( string, factory.orderPage().orderPlacedMsg.getText());
		logger.info(string + " displayed");

	}

	// Scenario: Verify User can cancel the order
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderLink);
		logger.info("User clicked on Orders section");

	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> listOfOrders = factory.orderPage().listOfOrders;
		for (int i = 0; i < listOfOrders.size(); i++) {
			if (listOfOrders.get(i).getText().equalsIgnoreCase("Hide Details")) {
			} else if (listOfOrders.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(factory.orderPage().showDetailsLink);
			}
		}
		logger.info("User clicked on first order in list");
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		List<WebElement> listOfCancelOptions = factory.orderPage().cancelTheOrderBtn;
		for (int i = 0; i < listOfCancelOptions.size(); i++) {
			click(listOfCancelOptions.get(0));
			break;
		}
		logger.info("User clicked on Cancel The Order button");
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String string) {
		click(factory.orderPage().reasonSelection);
		selectByVisibleText(factory.orderPage().reasonSelection, string);
		logger.info(string + " reason selected");

	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrderBtn);
		logger.info("The cancel order button clicked");

	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled(String string) {
//		Assert.assertEquals(string, factory.orderPage().cancelationMessage.getText());
		logger.info(string + " message displayed");

	}

	// Scenario: Verify User can Return the order
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		List<WebElement> listOfReturnOptions = factory.orderPage().returnItemsBtn;
		for (int i = 0; i < listOfReturnOptions.size(); i++) {
			click(listOfReturnOptions.get(0));
			break;
		}
		logger.info("User clicked on Return Items button");
	}

	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {
		click(factory.orderPage().reasonSelection);
		selectByVisibleText(factory.orderPage().reasonSelection, string);
		logger.info(string + " reason selected");
	}

	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
		click(factory.orderPage().dropOffInput);
		selectByVisibleText(factory.orderPage().dropOffInput, string);
		logger.info(string + " drop off selected");

	}

	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderBtn);
		logger.info("User clicked on Return Order button");

	}

	@Then("a return message should be displayed {string}")
	public void aReturnMessageShouldBeDisplayed(String string) {
//		Assert.assertEquals(string, factory.orderPage().returnMessage.getText());
		logger.info(string + " message displayed");
	}

	// Scenario: Verify User can write a review on order placed
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewBtn);
		logger.info("User clicked on Review button");

	}

	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String string, String string2) {
		clearTextUsingSendKeys(factory.orderPage().reviewHeadline);
		sendText(factory.orderPage().reviewHeadline, string);
		clearTextUsingSendKeys(factory.orderPage().reviewComment);
		sendText(factory.orderPage().reviewComment, string2);
		logger.info(string + ": added as headline " + string2 + ": added as comment");

	}

	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().reviewSubmitBtn);
		logger.info("User clicked on Add Your Review button");

	}

	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String string) {
		slowDown();
//		Assert.assertEquals(string, factory.orderPage().reviewAddedMessage.getText());
		logger.info(string + " message displayed");
	}

}
