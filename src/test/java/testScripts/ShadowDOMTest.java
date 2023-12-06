package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://watir.com/examples/shadow_dom.html");
		
		WebElement shadowHost = driver.findElement(By.cssSelector("div#shadow_host"));
		SearchContext context = shadowHost.getShadowRoot();
		WebElement shadowContent = context.findElement(By.cssSelector("span#shadow_content"));
//		WebElement shadowContent = driver.findElement(By.cssSelector("span#shadow_content"));
		System.out.println("Shadow DOM Content : " + shadowContent.getText());
		
		//nested CSS locator
		WebElement innerShadowHost = context.findElement(By.cssSelector("div#nested_shadow_host"));
		SearchContext innerContext = innerShadowHost.getShadowRoot();
		WebElement innerShadowContent = innerContext.findElement(By.cssSelector("div#shadow_content"));
		System.out.println("Inner Shadow DOM Content : " + innerShadowContent.getText());

	}

}
