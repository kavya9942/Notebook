package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//navigate to the URL
		driver.navigate().to("http://www.facebook.com");
		
		
		
		WebElement day =driver.findElement(By.id("day"));
		Select dd = new Select(day);
		dd.selectByIndex(5); // 5
		Thread.sleep(4000);
		dd.selectByValue("7"); // 7
		Thread.sleep(4000);
		dd.selectByVisibleText("10");//10
		
	WebElement month=	driver.findElement(By.id("month"));
	Select ss = new Select(month);
	ss.selectByIndex(7); // JUl
	Thread.sleep(4000);
	ss.selectByValue("6"); // JUN
	Thread.sleep(4000);
	ss.selectByVisibleText("Dec"); //Dec
	
	
	
	WebElement year =	driver.findElement(By.id("year"));
	Select yy = new Select(year);
	yy.selectByIndex(5); // 2015
	Thread.sleep(4000);
	yy.selectByValue("2017"); //
	Thread.sleep(4000);
	yy.selectByVisibleText("2001"); //2001
		
	
	WebElement month1=	driver.findElement(By.id("month"));
	Select ss1 = new Select(month1);
	List<WebElement> values =ss1.getOptions();
	
	for(int i=0;i<values.size();i++) {
		
		values.get(i).click();
		Thread.sleep(2000);
	}

	}

}
