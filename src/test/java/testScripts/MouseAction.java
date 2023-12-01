package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		driver.get("https://demo.opencart.com/");
		
//		WebElement srcBox = driver.findElement(By.name("search"));
//		actions.contextClick(srcBox).perform();
		
		WebElement menu = driver.findElement
				(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
//		actions.moveToElement(menu).perform();
		WebElement menuitem = driver.findElement
				(By.xpath("//ul[@class='list-unstyled']//a[contains(text(), 'Monitors (2)')]"));
//		actions.click(menuitem).perform();
		actions.moveToElement(menu).click(menuitem).build().perform();
		
		

	}

}
