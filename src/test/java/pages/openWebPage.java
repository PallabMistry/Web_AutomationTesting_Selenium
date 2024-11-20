package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class openWebPage {
	
	static WebElement element = null;
	
	public static WebElement textSearch(WebDriver driver) {
		WebElement element = driver.findElement(By.name("q"));
		return element;
	}
	public static WebElement searchReasult(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Chaldal'])[1]"));
		return element;
	}
//	public static WebElement name() {
//		
//	}


}
