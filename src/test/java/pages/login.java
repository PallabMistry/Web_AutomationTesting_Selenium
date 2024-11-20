package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import elements.locators;

public class login {
	static WebElement element = null;
	
	public static WebElement logIN(WebDriver driver) {
		WebElement element = driver.findElement(locators.LOGIN);
		return element;
	}
	
	public static WebElement cutlogINScreen(WebDriver driver) {
		WebElement element = driver.findElement(locators.cutLOGIN);
		return element;
	}
	
	public static WebElement  logINEmail (WebDriver driver) {
		WebElement element = driver.findElement(locators.emailLOGIN);
		return element ;
	}
	
	public static WebElement  Email (WebDriver driver) {
		WebElement element = driver.findElement(locators.EMAIL);
		return element ;
	}
	
	public static WebElement  PassWord (WebDriver driver) {
		WebElement element = driver.findElement(locators.passWORD);
		return element ;
	}
	
	public static WebElement Number (WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("(//input[@value='+88'])[1]"));
		return element ;
	}
	
	public static WebElement finalLogin (WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("(//button[normalize-space()='SIGN UP / LOGIN'])[1]"));
		return element ;
	}

}


