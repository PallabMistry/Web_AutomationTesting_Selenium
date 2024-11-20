package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import elements.locators;

public class searchProduct {
static WebElement element = null;



public static WebElement searchPD1(WebDriver driver) {
	WebElement element = driver.findElement(locators.SEARCH1);
	return element;
}

	public static WebElement searchPD2(WebDriver driver) {
		WebElement element = driver.findElement(locators.SEARCH2);
		return element;
	}
	
	public static WebElement searchPOD(WebDriver driver) {
		WebElement element = driver.findElement(locators.SEARCHPRODUCT);
		return element;
	}
	
	
	public static WebElement productHOVER(WebDriver driver) {
		WebElement element = driver.findElement(locators.PRODUCT_HOVER);
		return element;
	}

	public static WebElement Product(WebDriver driver) {
		WebElement element = driver.findElement(locators.PRODUCT);
		return element;
	}
}
