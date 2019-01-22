package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDownValues {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//navigate to the URL
		driver.navigate().to("https://www.google.com");
		WebElement text = driver.findElement(By.xpath("//input[@title='Search']"));
		text.sendKeys("selenium"+Keys.ENTER);
    	Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}
		
		

	

}
