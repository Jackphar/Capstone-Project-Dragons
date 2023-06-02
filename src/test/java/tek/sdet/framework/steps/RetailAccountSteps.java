package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.bouncycastle.asn1.esf.ESFAttributes;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	// Scenario: Verify User can update Profile Information
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().nameInput);
		sendText(factory.accountPage().nameInput, nameValue);
		clearTextUsingSendKeys(factory.accountPage().phoneInput);
		sendText(factory.accountPage().phoneInput, phoneValue);
		logger.info("user updated the name and the phone value");
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		factory.accountPage().personalUpdateButton.submit();
		click(factory.accountPage().personalUpdateButton);
		logger.info("user clicked on update button");
	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("user profile information updated");
	}

	// Scenario: Verify User can add a payment method
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPaymentLink);
		logger.info("User clicked on Add a payment method link");

	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> i : data) {
			clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
			sendText(factory.accountPage().cardNumberInput, i.get("cardNumber"));
			clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
			sendText(factory.accountPage().nameOnCardInput, i.get("nameOnCard"));
			selectByValue(factory.accountPage().expirationMonthInput, i.get("expirationMonth"));
			selectByValue(factory.accountPage().expirationYearInput, i.get("expirationYear"));
			clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
			sendText(factory.accountPage().securityCodeInput, i.get("securityCode"));
			logger.info("User filled Debit or credit card information");
		}
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addYourCardBtn);
		logger.info("User clicked on Add your card button");
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.accountPage().addPaymntSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addPaymntSuccessMessage));
		logger.info(string + ": message displayed");
	}

	// Scenario: Verify User can edit Debit or Credit card
//	@When("User click on the payment card that ends with {string}")
//	public void userClickOnThePaymentCardThatWantToUpdate(String string) {
////		slowDown();
//		List<WebElement> cards = factory.accountPage().cardEndingNumber;
//		for (WebElement card : cards) {
//			if (card.getText().contains(string)) {
//				System.out.println(card.getText());
//				click(card);
//				slowDown();
//				logger.info(string + " is selected");
//				break;
//			}
//		}

//	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().editButtonPayment);
		logger.info("User clicked on Edit option of card section");
	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCardBtn);
		logger.info("User clicked on Update Your Card button");

	}

	@Then("this message should be displayed {string}")
	public void thisMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.accountPage().updatePaymentMethodSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updatePaymentMethodSuccessMessage));
		logger.info(string + ": message displayed");
	}

	// Scenario: Verify User can remove Debit or Credit card
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		slowDown();
		click(factory.accountPage().removePaymentCardButton);
		logger.info("User clicked on remove option of card section");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		logger.info("The payment card removed successfully");

	}

	// Scenario: Verify User can add an Address
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddrress);
		logger.info("User clicked on Add address option");

	}

	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> i : data) {
			selectByValue(factory.accountPage().countryDropdown, i.get("country"));
			clearTextUsingSendKeys(factory.accountPage().fullNameAddress);
			sendText(factory.accountPage().fullNameAddress, i.get("fullName"));
			clearTextUsingSendKeys(factory.accountPage().phoneNumberAddress);
			sendText(factory.accountPage().phoneNumberAddress, i.get("phoneNumber"));
			clearTextUsingSendKeys(factory.accountPage().address);
			sendText(factory.accountPage().address, i.get("streetAddress"));
			clearTextUsingSendKeys(factory.accountPage().aprtmentNumber);
			sendText(factory.accountPage().aprtmentNumber, i.get("apt"));
			clearTextUsingSendKeys(factory.accountPage().cityInput);
			sendText(factory.accountPage().cityInput, i.get("city"));
			click(factory.accountPage().stateInput);
			selectByValue(factory.accountPage().stateInput, i.get("state"));
			clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
			sendText(factory.accountPage().zipCodeInput, i.get("zipCode"));
			logger.info("User filled new address form with information");
		}

	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addYourAddressBtn);
		logger.info("User clicked on Add Your Address button");

	}

	@Then("the message should be displayed {string}")
	public void theMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.accountPage().addressAddSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddSuccessMessage));
		logger.info(string + ": message displayed");
	}

	// Scenario: Verify User can edit an Address added on account
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	   click(factory.accountPage().editAddress);
	   logger.info("User clicked on edit address option");
	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().updateYourAddress);
		logger.info("User clicked update Your Address button");

	}

	@Then("This message should be displayed {string}")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully(String string) {
		waitTillPresence(factory.accountPage().addressUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdateSuccessMessage));
		logger.info(string + ": message displayed");

	}

	// Scenario: Verify User can remove Address from Account
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddress);
		slowDown();
		logger.info("User clicked on remove option of Address section");

	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		logger.info("Address removed");

	}

}
