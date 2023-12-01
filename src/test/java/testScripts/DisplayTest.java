package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.automationbookstore.dev/");
//		driver.findElement(By.id("searchBar")).sendKeys("test");
		String strPlaceholder = driver.findElement(By.id("searchBar")).getAttribute("placeholder");
		System.out.println(strPlaceholder);
		WebElement clsIcon = driver.findElement(By.xpath("//a[@title='Clear text']"));
		System.out.println(clsIcon.isDisplayed());
		if(clsIcon.isDisplayed()) {
			clsIcon.click();
		}
		

	}

}
