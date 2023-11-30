package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		String salElem = driver.findElement
				(By.xpath("//td[contains(text(), 'B. Wagner')]//following-sibling::td[5]")).getText();
		System.out.println("Salary...." + salElem);
		
		List<WebElement> items = driver.findElements
				(By.xpath("//td[text() = 'B. Wagner']//following-sibling::td"));
		System.out.println("Number of items...." + items.size());
		for (WebElement cell: items) {
			System.out.println(cell.getText());
		}

	}

}
