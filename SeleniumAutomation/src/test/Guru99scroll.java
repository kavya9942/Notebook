package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99scroll {

	public static void main(String[] args) throws InterruptedException {
		       //launch the browser
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
				WebDriver driver = new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//navigate to the URL
				driver.navigate().to("http://demo.guru99.com/test/guru99home/");
				
//				  JavascriptExecutor js = (JavascriptExecutor) driver;
//				  js.executeScript("window.scrollBy(0,3000)");
//				  Thread.sleep(4000);
//				  js.executeScript("window.scrollBy(0,-1500)");
				 
				WebElement Element = driver.findElement(By.linkText("JAVA"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", Element);
				Element.click();
				
				String title = driver.getTitle();
				System.out.println(title);
				if(title.contains("Java")) {
					System.out.println("true");
				}
				
				
				
	}

}
