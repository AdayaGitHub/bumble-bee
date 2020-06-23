package stepDefinitionFiles;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import data.DataFile;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.MenuPage;
import cucumber.api.java.en.Then;


public class CheckoutStepDefinition {
	

	private WebDriver driver = null;

	// PicoContainer injects BaseStep class
	public CheckoutStepDefinition(BaseStepDefinition baseStepDefinition) {
		this.driver = baseStepDefinition.driver;
	}

	
	@Given("^I am at the website\\.$")
	public void i_am_at_the_website() throws Throwable {
	    HomePage.menuPageButton(driver).click();

	}

	@Given("^I have checked out after selecting a product$")
	public void i_have_checked_out_after_selecting_a_product() throws Throwable {
	    MenuPage.CheckoutButtonProduct1(driver).click();

	}

	@When("^I am redirected to the checkout page$")
	public void i_am_redirected_to_the_checkout_page() throws Throwable {
		Thread.sleep(8000);
	    Assert.assertEquals(DataFile.checkoutPageHeading, CheckoutPage.heading(driver).getText());

	}

	@Then("^I verify that the input fields are present$")
	public void i_verify_that_the_input_fields_are_present() throws Throwable {
		Assert.assertEquals(DataFile.emailFieldName, CheckoutPage.emailField(driver).getAttribute("Id"));
		Assert.assertEquals(DataFile.nameFieldName, CheckoutPage.nameField(driver).getAttribute("Id"));
		Assert.assertEquals(DataFile.addressFieldName, CheckoutPage.addressField(driver).getAttribute("Id"));
		Assert.assertEquals(DataFile.cardTypeFieldName, CheckoutPage.cardTypeField(driver).getAttribute("Id"));
		Assert.assertEquals(DataFile.cardNumberFieldName, CheckoutPage.cardNumberField(driver).getAttribute("Id"));
		Assert.assertEquals(DataFile.cardholderNameFieldName, CheckoutPage.cardholderNameField(driver).getAttribute("Id"));
		Assert.assertEquals(DataFile.verificationNumberFieldName, CheckoutPage.verificationNumberField(driver).getAttribute("Id"));

	}

	@Then("^The submit button is present$")
	public void the_submit_button_is_present() throws Throwable {
		Assert.assertEquals(DataFile.submitButtonName, CheckoutPage.submitButtonField(driver).getText());
	}

	@Then("^the cancel button is present$")
	public void the_cancel_button_is_present() throws Throwable {
		Assert.assertEquals(DataFile.cancelButtonName, CheckoutPage.cancelButtonField(driver).getText());

	}

	@When("^I input \"([^\"]*)\" in the email field$")
	public void i_input_in_the_email_field(String arg1) throws Throwable {
	    CheckoutPage.emailField(driver).sendKeys(arg1);

	}

	@Then("^The \"([^\"]*)\" appears in the email field$")
	public void the_appears_in_the_email_field(String arg1) throws Throwable {
	    Assert.assertEquals(arg1, CheckoutPage.emailField(driver).getAttribute("value"));

	}

	@When("^I input the \"([^\"]*)\"$")
	public void i_input_the(String arg1) throws Throwable {
		 CheckoutPage.nameField(driver).sendKeys(arg1);

	}

	@Then("^the \"([^\"]*)\" appears in the name field$")
	public void the_appears_in_the_name_field(String arg1) throws Throwable {
		 Assert.assertEquals(arg1, CheckoutPage.nameField(driver).getAttribute("value"));

	}

	@When("^I input the address$")
	public void i_input_the_address() throws Throwable {
	    CheckoutPage.addressField(driver).sendKeys(DataFile.address);

	}

	@Then("^the address appears in the address field$")
	public void the_address_appears_in_the_address_field() throws Throwable {
		Assert.assertEquals(DataFile.address, CheckoutPage.addressField(driver).getAttribute("value"));

	}

	@When("^I input the Card number$")
	public void i_input_the_Card_number() throws Throwable {
		CheckoutPage.cardNumberField(driver).sendKeys(DataFile.cardNumber);

	}

	@Then("^The card number appears in the card number field$")
	public void the_card_number_appears_in_the_card_number_field() throws Throwable {
		Assert.assertEquals(DataFile.cardNumber, CheckoutPage.cardNumberField(driver).getAttribute("value"));

	}

	@When("^I input the cardholder_name$")
	public void i_input_the_cardholder_name() throws Throwable {
		CheckoutPage.cardholderNameField(driver).sendKeys(DataFile.cardholderName);

	}

	@Then("^The cardholder_name appears in the cadholder name field$")
	public void the_cardholder_name_appears_in_the_cadholder_name_field() throws Throwable {
		Assert.assertEquals(DataFile.cardholderName, CheckoutPage.cardholderNameField(driver).getAttribute("value"));

	}

	@When("^I input the verification_code$")
	public void i_input_the_verification_code() throws Throwable {
		CheckoutPage.verificationNumberField(driver).sendKeys(DataFile.verificationNumber);

	}

	@Then("^the verification_code appears in the verfication code field$")
	public void the_verification_code_appears_in_the_verfication_code_field() throws Throwable {
		Assert.assertEquals(DataFile.verificationNumber, CheckoutPage.verificationNumberField(driver).getAttribute("value"));

	}

	@When("^I click the Cancel button$")
	public void i_click_the_Cancel_button() throws Throwable {
		CheckoutPage.cancelButtonField(driver).click();
		Thread.sleep(10000);
	}

	@Then("^I am redirected to the menu page$")
	public void i_am_redirected_to_the_menu_page() throws Throwable {
		Assert.assertEquals(DataFile.MenuPageHeading, MenuPage.heading(driver).getText());

	}

	
}
