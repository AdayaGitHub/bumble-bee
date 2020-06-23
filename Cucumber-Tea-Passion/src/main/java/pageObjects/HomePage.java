package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private static WebElement element = null;


	public static WebElement menuPageButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[13]/div/ul/li[3]/a"));
		return element;
	}

}
