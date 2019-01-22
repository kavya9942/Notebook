package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//navigate to the URL
		driver.navigate().to("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
//		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
//		Thread.sleep(3000);
//		Alert alert =driver.switchTo().alert();
//		alert.accept();

		driver.findElement(By.xpath("//button[text()='Confirm Pop up']")).click();
		Thread.sleep(3000);
		Alert alert =driver.switchTo().alert();
		String text =alert.getText();
		System.out.println(text);
		alert.dismiss();
		
//		driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
//		Thread.sleep(3000);
//		Alert alert =driver.switchTo().alert();
//		Thread.sleep(3000);
//		String text =alert.getText();
//		System.out.println(text);
		
		
	}
	

}
