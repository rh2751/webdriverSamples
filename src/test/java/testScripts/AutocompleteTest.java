package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/autocomplete/");

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement inpBox = driver.findElement(By.className("ui-autocomplete-input"));
		inpBox.sendKeys(Keys.PAGE_DOWN);
		inpBox.sendKeys("AS");
		
//		Thread.sleep(2000);
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> listItems = driver.findElements(By.cssSelector("ul#ui-id-1 > li")); //not working
		System.out.println("Number of items...." + listItems.size());
		for (WebElement item : listItems) {
			System.out.println(item.getText());
			if(item.getText().equalsIgnoreCase("javascript")) {
				item.click();
				break;
			}
		}
		

	}

}
