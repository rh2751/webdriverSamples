package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		driver.get("https://jqueryui.com/tooltip/");

//		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("age")).sendKeys(Keys.PAGE_DOWN);
		WebElement inpBox = driver.findElement(By.id("age"));
		actions.moveToElement(inpBox).perform();
		String strTxt = driver.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println("Tooltip text is...." + strTxt);

	}

}
