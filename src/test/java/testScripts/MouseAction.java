package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		driver.get("https://demo.opencart.com/");
		
//		WebElement srcBox = driver.findElement(By.name("search"));
//		actions.contextClick(srcBox).perform();
		
		WebElement menu = driver.findElement
				(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
		//Move to element
//		actions.moveToElement(menu).perform();
		WebElement menuitem = driver.findElement
				(By.xpath("//ul[@class='list-unstyled']//a[contains(text(), 'Monitors (2)')]"));
//		actions.click(menuitem).perform();
		actions.moveToElement(menu).click(menuitem).build().perform();
		
		//Double Click
//		driver.get("https://www.stqatools.com/demo/DoubleClick.php");
//		
//		Thread.sleep(2000);
//		WebElement btn = driver.findElement(By.xpath("//button[text() = 'Click Me / Double Click Me!']"));
//		actions.doubleClick(btn).perform();
		
//		actions.doubleClick(btn).doubleClick(btn).build().perform();
		
		//Scroll methods
		Thread.sleep(3000);
		WebElement image = driver.findElement(By.xpath("//img[@alt='HP Banner']"));
		actions.scrollToElement(image).perform();
//		actions.scrollByAmount(10, 400).perform();
		
		

	}

}
