package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://uitestingplayground.com/ajax");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ajaxButton"))));
		driver.findElement(By.id("ajaxButton")).click();
		
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div#content"))));
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("div#content")), "Data loaded with AJAX get request."));
		
		
		String strText = driver.findElement(By.cssSelector("div#content")).getText();
		System.out.println(strText);

	}

}
