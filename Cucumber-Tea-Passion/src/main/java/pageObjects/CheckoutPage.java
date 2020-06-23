package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	
	private static WebElement element = null;

	public static WebElement heading(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[8]/div/ul/li[5]/a"));
        return element;
	}

	public static WebElement submitButtonField(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button"));
        return element;
	}

	public static WebElement emailField(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/fieldset[1]/div[1]/div/input"));
        return element;
	}

	public static WebElement nameField(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/fieldset[1]/div[2]/div/input"));
        return element;
	}

	public static WebElement addressField(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/fieldset[1]/div[3]/div/textarea"));
        return element;
	}

	public static WebElement cardTypeField(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/fieldset[2]/div[1]/div/select"));
        return element;
	}

	public static WebElement cardNumberField(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/fieldset[2]/div[2]/div/input"));
        return element;
	}

	public static WebElement cardholderNameField(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/fieldset[2]/div[3]/div/input"));
        return element;
	}

	public static WebElement verificationNumberField(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/fieldset[2]/div[4]/div/input"));
        return element;
	}

	public static WebElement cancelButtonField(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/a"));
        return element;
	}

}
