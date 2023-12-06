package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		//simple alert
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text : " + alert.getText());
		alert.accept();
				
		//confirmation alert
		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println("Alert Text : " + confirm.getText());
		confirm.dismiss();
		
		//prompt alert
		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
		Alert prompt = driver.switchTo().alert();
		System.out.println("Alert Text : " + prompt.getText());
		prompt.sendKeys("Hello World");
		prompt.accept();
//		prompt.dismiss();
	}

}
