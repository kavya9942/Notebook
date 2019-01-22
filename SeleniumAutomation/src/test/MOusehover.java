package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOusehover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		 driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//navigate to the URL
		
		driver.navigate().to("https://www.toolsqa.com/selenium-webdriver/mouse-hover-action/");
		Thread.sleep(2000);
		
		WebElement ele =driver.findElement(By.xpath("(//span[text()='Tutorial'])[1]"));
		
		Actions action = new Actions(driver);
//		   action.moveToElement(ele).build().perform();
//		   Thread.sleep(2000);11111111111111
//		   
//		   driver.findElement(By.xpath("(//span[text()='Software Testing Tutorial'])[1]")).click();
//		
		action.contextClick(ele).build().perform();
		
	}

}
