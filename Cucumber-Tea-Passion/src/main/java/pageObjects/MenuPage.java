package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
	
	private static WebElement element = null;

	public static WebElement CheckoutButtonProduct1(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[16]/div/a/span"));
		return element;
	}

	public static WebElement heading(WebDriver driver) {
		element  = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[3]/div/ul/li[3]/a"));
        return element;
	}

}
