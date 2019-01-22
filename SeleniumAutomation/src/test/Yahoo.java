package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create");
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("SSSS");
		driver.findElement(By.xpath("//input[@name='yid']")).sendKeys("sandeep@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("llll");
		
		

	}

}
