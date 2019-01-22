package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		 driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//navigate to the URL
		driver.navigate().to("https://www.toolsqa.com/selenium-training/");
		Thread.sleep(2000);
		WebElement videos =driver.findElement(By.xpath("(//span[text()='VIDEOS'])[1]"));
		
		Actions action = new Actions(driver);
		action.contextClick().build().perform();
		Thread.sleep(2000);
		

	}

}
