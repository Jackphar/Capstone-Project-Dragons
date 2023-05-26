package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

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

}
