package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinPopupTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Win : " + parentWin);
		WebElement tabBtn = driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]"));
		tabBtn.click();
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of windows...." + tabs.size());
		
		for(String child:tabs) {
			System.out.println("Windows..." + child);
			if(!child.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(child);
				System.out.println("Child Win title...." + driver.getWindowHandle());
			}

		}
		
		
//		driver.close();
		driver.switchTo().window(parentWin);
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
		
		Set<String> wins = driver.getWindowHandles();
		System.out.println("Number of windows...." + wins.size());
		
		for(String child:wins) {
			System.out.println("Windows..." + child);
		}
		
		driver.quit();
	}

}
