package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
//		WebElement srcBox = driver.findElement(By.id("APjFqb"));
//		WebElement srcBox = driver.findElement(By.name("q"));
//		WebElement srcBox = driver.findElement(By.className("gLFyf"));
		WebElement srcBox = driver.findElement(By.tagName("textarea"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.sendKeys(Keys.ENTER);
		System.out.println("Title..." + driver.getTitle());
		System.out.println("URL...." + driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("Title..." + driver.getTitle());
		driver.navigate().forward();

	}

}
