package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenshotTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		driver.get("https://demo.opencart.com/");
				
		WebElement menu = driver.findElement
				(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
		
		WebElement menuitem = driver.findElement
				(By.xpath("//ul[@class='list-unstyled']//a[contains(text(), 'Monitors (2)')]"));

		actions.moveToElement(menu).click(menuitem).build().perform();
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png";
		FileUtils.copyFile(src, new File(path));
		
		Thread.sleep(3000);
		WebElement image = driver.findElement(By.xpath("//img[@alt='HP Banner']"));
		actions.scrollToElement(image).perform();
		
		File src1 = image.getScreenshotAs(OutputType.FILE);
		String path1 = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png";
		FileUtils.copyFile(src1, new File(path1));
		
		

	}

}