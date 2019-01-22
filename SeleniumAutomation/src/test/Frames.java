package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		WebElement frame =driver.findElement(By.xpath("//iframe[@id=\"a077aa5e\"]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("html/body/a/img")).click();
		driver.switchTo().defaultContent();
		
		
		WebElement home =driver.findElement(By.xpath("//li[@class=\"item101 active last\"]/a"));
		home.click();
		
	}

}
