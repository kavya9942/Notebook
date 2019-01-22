package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup {

	public static void main(String[] args) {
		       //launch the browser
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//navigate to the URL
				driver.navigate().to("http://www.facebook.com");
				
				driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Syed");
				driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("Salman");
	            driver.findElement(By.xpath("//div[text()='Mobile number or email address']/parent::div/input")).sendKeys("123456789");
				
	}

}
