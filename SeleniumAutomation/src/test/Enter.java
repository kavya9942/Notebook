package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver;
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		 driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//navigate to the URL
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("selenium 3"+Keys.ENTER);
		
//		Robot robo = new Robot();
//		Thread.sleep(2000);
//		robo.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
//		robo.keyRelease(KeyEvent.VK_ENTER);
		Robot robot = new Robot(); 
		  
        // Press keys using robot. A gap of 
        // of 500 mili seconds is added after 
        // every key press 
		
		//TUTORIAL
		
//		robot.keyPress(KeyEvent.VK_SPACE);
//		robot.keyRelease(KeyEvent.VK_SPACE);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_3);
//		robot.keyRelease(KeyEvent.VK_3);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
        
        
        

	}

}
