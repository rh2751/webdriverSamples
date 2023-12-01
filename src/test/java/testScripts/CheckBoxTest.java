package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		//check box
		WebElement age = driver.findElement(By.id("isAgeSelected"));
		if(age.isSelected()) {
			age.click();
		}
		driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]")).isSelected());
		
		//radio button
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		driver.findElement(By.xpath("//input[@value='5 - 15']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='5 - 15']")).isSelected());
	}

}
