package tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;


import data.DataFile;
import driverUtilities.DriverUtilities;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.MenuPage;

import org.junit.Assert;




public class Checkout {

	WebDriver driver; // This needs to be at the class level else you can’t use it 	in the methods below

	@Before						
	public void preConditions() { 			
		// The driver instantiation is moved to the preconditions
		// Doesn’t affect the outcome of the test so should be here
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();
		driver.get(DataFile.websiteURL);
		driver.manage().window().maximize();
		// Add code to check if user is registered
	}
	
	@Test
	public void CheckoutSection() throws InterruptedException { 	
		// Method definition 		
		// Create instance of WebDriver
		
		//Step 1
		
		    HomePage.menuPageButton(driver).click();



		    MenuPage.CheckoutButtonProduct1(driver).click();

		    Thread.sleep(10000);
		    Assert.assertEquals(DataFile.checkoutPageHeading, CheckoutPage.heading(driver).getText());

			Assert.assertEquals(DataFile.emailFieldName, CheckoutPage.emailField(driver).getAttribute("Id"));
			Assert.assertEquals(DataFile.nameFieldName, CheckoutPage.nameField(driver).getAttribute("Id"));
			Assert.assertEquals(DataFile.addressFieldName, CheckoutPage.addressField(driver).getAttribute("Id"));
			Assert.assertEquals(DataFile.cardTypeFieldName, CheckoutPage.cardTypeField(driver).getAttribute("Id"));
			Assert.assertEquals(DataFile.cardNumberFieldName, CheckoutPage.cardNumberField(driver).getAttribute("Id"));
			Assert.assertEquals(DataFile.cardholderNameFieldName, CheckoutPage.cardholderNameField(driver).getAttribute("Id"));
			Assert.assertEquals(DataFile.verificationNumberFieldName, CheckoutPage.verificationNumberField(driver).getAttribute("Id"));


			Assert.assertEquals(DataFile.submitButtonName, CheckoutPage.submitButtonField(driver).getText());

			Assert.assertEquals(DataFile.cancelButtonName, CheckoutPage.cancelButtonField(driver).getText());

		    CheckoutPage.emailField(driver).sendKeys(DataFile.email);

		    Assert.assertEquals(DataFile.email, CheckoutPage.emailField(driver).getAttribute("value"));

			 CheckoutPage.nameField(driver).sendKeys(DataFile.name);

			 Assert.assertEquals(DataFile.name, CheckoutPage.nameField(driver).getAttribute("value"));

		    CheckoutPage.addressField(driver).sendKeys(DataFile.address);

			Assert.assertEquals(DataFile.address, CheckoutPage.addressField(driver).getAttribute("value"));

			CheckoutPage.cardNumberField(driver).sendKeys(DataFile.cardNumber);

			Assert.assertEquals(DataFile.cardNumber, CheckoutPage.cardNumberField(driver).getAttribute("value"));

			CheckoutPage.cardholderNameField(driver).sendKeys(DataFile.cardholderName);

			Assert.assertEquals(DataFile.cardholderName, CheckoutPage.cardholderNameField(driver).getAttribute("value"));

			CheckoutPage.verificationNumberField(driver).sendKeys(DataFile.verificationNumber);	
	
			Assert.assertEquals(DataFile.verificationNumber, CheckoutPage.verificationNumberField(driver).getAttribute("value"));

			CheckoutPage.cancelButtonField(driver).click();
			
			Thread.sleep(5000);
			Assert.assertEquals(DataFile.MenuPageHeading, MenuPage.heading(driver).getText());

	}
	

	@After					
	public void tearDown() { 			
		// Typical functionality is to close the browser after you have finished the test
		driver.quit();

	}

}
