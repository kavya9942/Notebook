package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		String text =driver.findElement(By.xpath("//a[@data-g-label=\"Sign in\"]")).getText();
       System.out.println(text);
       if(text.equalsIgnoreCase("SIGN IN")) {
    	   System.out.println("now we are on sign in page");
       }
       
		
		
	
	}

}
