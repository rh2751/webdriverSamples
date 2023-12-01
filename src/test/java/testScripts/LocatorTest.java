package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.className("radius")).click();
		driver.findElement(By.cssSelector(".radius")).click();
//		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		driver.findElement(By.linkText("Elemental Selenium")).click();
		String strUrl = driver.findElement(By.linkText("Elemental Selenium")).getAttribute("href");
		System.out.println("Link URL...." + strUrl);
//		driver.findElement(By.partialLinkText("Elemental")).click();

	}

}
