package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Automation");

		driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("123456789");

		driver.findElement(By.xpath("//input[@aria-label=\"New password\"]")).sendKeys("Testing");

		WebElement day = driver.findElement(By.id("day"));
		Select sel = new Select(day);
		sel.selectByVisibleText("15");
		
		WebElement month = driver.findElement(By.id("month"));
		Select sel1 = new Select(month);
		sel1.selectByVisibleText("Nov");
		
		WebElement year = driver.findElement(By.id("year"));
		Select sel2 = new Select(year);
		sel2.selectByVisibleText("1989");

		
		driver.findElement(By.xpath("//label[text()='Male']/../input")).click();
        driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
				

	}

}
