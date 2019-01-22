package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath("//label[text()='Female']/../input")).click();
		
		boolean result =driver.findElement(By.xpath("//button[text()='Sign Up']")).isEnabled();
		System.out.println(result);
	}

}
