package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	// Scenario: Verify Shop by Department sidebar
	@When("When User click on All section")
	public void whenUserClickOnAllSection() throws InterruptedException {
		click(factory.homePage().allSection);
		logger.info("User clicked on All departments section");
		Thread.sleep(2000);

	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<WebElement> allDepartments = factory.homePage().departments;
		for (WebElement department : allDepartments) {
			department.isDisplayed();

		}
	}

	// Scenario Outline: Verify department sidebar options
	@When("User is on {string}")
	public void userIsOn(String string) {
		List<WebElement> allDepartments = factory.homePage().departments;
		for (WebElement department : allDepartments) {
			department.click();
			break;
		}

	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> options = dataTable.asLists(String.class);
		List<WebElement> allDepartments = factory.homePage().departments;
		for(int i = 0; i < options.get(0).size(); i++) {
			for(WebElement department : allDepartments) {
				if(department.getText().equals(options.get(0).get(i))) {
					Assert.assertTrue(department.isDisplayed());
					logger.info(department.getText() + " is displayed");
				}
			}
		}

	}
	public static void main(String[] args) {
		  int[] evenNumberArray = { 13,  25, 58,  42,  34,  27,  65,  18 };
		  int[] oddNumberArray = { 23, 34, 21, 43, 98, 11, 16 };

		    int evenSum = 0;
		    int oddSum = 0;
		    int evenAndOddSum = 0;

		    for(int i : evenNumberArray) {
		    	if(i %2 == 0) {
		      evenSum += i;
		    	}
		    }
		    System.out.println("Even sum: " + evenSum);
		    
			for (int t : oddNumberArray) {
				if (t %2 == 1) {
					oddSum += t;
				}
			}
		    System.out.println("Odd sum: " + oddSum);

		    evenAndOddSum = evenSum + oddSum;
		    System.out.println("Total sum: " + evenAndOddSum);
		   
	}

}
