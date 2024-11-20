package testResult;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.openWebPage;
import pages.login;
import pages.searchProduct;


public class openWebTest {
	static WebDriver driver= null;
	public static void main(String[] args) throws InterruptedException {
		
		googleSearch();
		
	}
	
	public static void googleSearch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		openWebPage.textSearch(driver).sendKeys("chaldal.com",Keys.ENTER);
		openWebPage.searchReasult(driver).click();
		Thread.sleep(1000);
		
		login.logIN(driver).click();
		Thread.sleep(1000);
		login.logINEmail(driver).click();
		Thread.sleep(1000);
		login.Email(driver).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		login.PassWord(driver).sendKeys("abcde");
		login.cutlogINScreen(driver).click();
		
		searchProduct.searchPD1(driver).sendKeys("tea",Keys.ENTER);
		searchProduct.searchPD2(driver).sendKeys("tea",Keys.ENTER);
		Thread.sleep(1000);
		searchProduct.searchPOD(driver).click();
		searchProduct.productHOVER(driver).click();
		

//		openWebPage.logIn(driver).click();
//		googleSearchpage.searchReasult(driver).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
