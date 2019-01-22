package test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollOperation {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//navigate to the URL
		driver.navigate().to("http://demo.guru99.com/test/guru99home/");
		Thread.sleep(3000);
////		JavascriptExecutor jse = (JavascriptExecutor)driver;
////		jse.executeScript("scroll(0, 1000);");
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//a[text()='JAVA']")).click();
//		
////		JavascriptExecutor jse = (JavascriptExecutor)driver;
////		WebElement linuxlink =driver.findElement(By.xpath("//a[text()='Linux']"));
////		 jse.executeScript("arguments[0].scrollIntoView();", linuxlink);
////		 Thread.sleep(2000);
////		 linuxlink.click();
//		
//		////h4[contains(text(),'Video Tutorials')]
//		
		
//JavascriptExecutor jse = (JavascriptExecutor)driver;	
//WebElement text = driver.findElement(By.xpath("//h4[contains(text(),'Video Tutorials')]"));;
//jse.executeScript("arguments[0].scrollIntoView();", text);	
//Thread.sleep(3000);
//
//String text1=text.getText();
//System.out.println("the text is "+text1);

		
		 
		 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 5000);");
	Thread.sleep(3000);
	jse.executeScript("scroll(0, -1500);");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[text()='JAVA']")).click();

		 
	}
}
