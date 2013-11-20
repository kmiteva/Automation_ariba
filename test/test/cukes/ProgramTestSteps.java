package test.cukes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cuke4duke.spring.StepDefinitions;

@StepDefinitions
public class ProgramTestSteps {

	WebDriver driver = new FirefoxDriver();

	SystemSettings sysset = new SystemSettings();


	@Given("^The bueyer goes to the ws")
	public void The_bueyer_goes_to_the_ws() throws Throwable {
		driver.get(sysset.getWs_url());

	}

	@When("^The bueyer tries to log in$")
	public void The_bueyer_tries_to_log_in() throws Throwable {
		WebElement element = driver.findElement(By.name("UserName"));
		element.sendKeys(sysset.getSuccessfull_credential());
		element.submit();
	}

	@Then("^He is successfully login$")
	public void He_is_successfully_login() throws Throwable {
		WebElement element1 = driver.findElement(By.id(sysset.getHome_element()));

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}

		try {

		} finally {
			driver.close();

		}

		System.out.println(sysset.getSuccessfull_test());
	}

	@Then("^He is not successfully login$")
	public void He_is_not_successfully_login() throws Throwable {

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			

		}

		WebElement webEl = driver.findElement(By.className("errorText"));

		String a = webEl.getText();
		if (a.equals(sysset.getError_message())) {
			System.out.println(sysset.getSuccessfull_test());
		}

		else {

			System.out.println(sysset.getUnsuccessfull_test());

		}

		try {

		} finally {
			driver.close();

		}
	}

	@When("^The bueyer tries to log in with incorrect credentials$")
	public void The_bueyer_tries_to_log_in_with_incorrect_credentials()
			throws Throwable {
		WebElement element = driver.findElement(By.name("UserName"));
		element.sendKeys(sysset.getUnsuccessfull_credential());
		element.submit();

	}

	@When("^he goes to inbox$")
	public void he_goes_to_inbox() throws Throwable {

	}

	@Then("^all invoices are displayed$")
	public void all_invoices_are_displayed() throws Throwable {

	}

}
