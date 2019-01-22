package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		
		     //launch the browser
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//navigate to the URL
				driver.navigate().to("https://www.google.com");
				driver.findElement(By.xpath("//a[text()='Gmail']")).click();
				driver.findElement(By.xpath("//a[text()='Sign In']")).click();
				
				driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("#############");
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("************");
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[contains(@aria-label,'Google Account: sandeep reddy ')]")).click();
				driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	}

}
