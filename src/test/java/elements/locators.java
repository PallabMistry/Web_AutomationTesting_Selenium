package elements;

import java.security.PublicKey;

import org.openqa.selenium.By;

public class locators {
	public static By LOGIN = By.className("signInBtn");
	public static By cutLOGIN = By.className("close");
	public static By emailLOGIN = By.xpath("(//button[@class='loginBtn emailLoginBtn'])[1]");
	public static By EMAIL =By.xpath("(//input[@name='email'])[1]");
	public static By passWORD = By.xpath("(//input[@name='password'])[1]");
	
	public static By SEARCH1 = By.name("mainSearch");
	public static By SEARCH2 = By.xpath("(//input[@placeholder='Search for products (e.g. eggs, milk, potato)'])[2]");
	public static By SEARCHPRODUCT = By.xpath("(//button[@type='submit'])[3]");

	public static By PRODUCT_HOVER = By.xpath("(//p[contains(text(),'Add to Shopping Bag')])[1]");
	public static By PRODUCT = By.xpath("(//img)[21]");

	
}


