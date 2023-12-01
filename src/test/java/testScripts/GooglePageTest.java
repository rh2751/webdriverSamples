package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
//		WebElement srcBox = driver.findElement(By.name("q"));
//		WebElement srcBox = driver.findElement(By.className("gLFyf"));
//		WebElement srcBox = driver.findElement(By.tagName("textarea"));
		srcBox.sendKeys("Java Tutorial");
//		Thread.sleep(2000);
//		List<WebElement> listItems = driver.findElements
//				(By.xpath("(//ul[@role='listbox'])[1]//li//descendant::div[@class='lnnVSe']"));
//		System.out.println("Number of items...." + listItems.size());
//		for (int i =0; i < listItems.size(); i++) {
//			System.out.println(listItems.get(i).getText());
//			if(listItems.get(i).getText().equalsIgnoreCase("java tutorial pdf")) {
//				listItems.get(i).click();
//				break;
//			}
		
//		}
//		srcBox.sendKeys(Keys.ENTER);
		srcBox.submit();
		System.out.println("Title..." + driver.getTitle());
//		System.out.println("URL...." + driver.getCurrentUrl());
//		driver.navigate().back();
//		System.out.println("Title..." + driver.getTitle());
//		driver.navigate().forward();
//		driver.close();
//		driver.quit();
		
	}
	
}
