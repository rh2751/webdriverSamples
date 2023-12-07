package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframesTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		//from mainpage to frame1
		driver.switchTo().frame("frame1");
		WebElement inpBox = driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.sendKeys("Hello World");
		
		//from frame1 to frame3
		driver.switchTo().frame("frame3");
//		driver.switchTo().frame(0); ---index starts from 0
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//from frame3 to frame1
		driver.switchTo().parentFrame();
//		driver.switchTo().frame("frame1"); ---will not work as focus is within frame3 at this point
		inpBox = driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.clear();
		inpBox.sendKeys("Welcome to World");
		
		//from frame1 to main page
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//label//span")).getText());
		
		//from main page to frame2
		driver.switchTo().frame("frame2");
		Select singSel = new Select(driver.findElement(By.id("animals")));
		singSel.selectByValue("avatar");
		System.out.println(driver.findElement(By.id("animals")).getText());
	}

}
