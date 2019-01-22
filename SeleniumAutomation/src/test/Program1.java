package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximizing the browser
		driver.get("https://www.facebook.com/");//Navigate to the URL
//		
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("syed");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("test");
//		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("123456");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("XXXXX");
//		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("UUUU");
//		driver.findElement(By.xpath("//label[text()='Male']/../input")).click();
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.navigate().forward();
		
		
	}

}
