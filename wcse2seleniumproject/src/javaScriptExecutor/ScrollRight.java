package javaScriptExecutor;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollRight {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//using  when  Java.io exception connection failed exception in chrome driver 
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
			//upcasting with the web driver interface
		 WebDriver driver=new ChromeDriver(options);
			 //end
		//maximize browser
		driver.manage().window().maximize();
		//synchronaization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 //launch web page
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		 //scrollLeft
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollBy(-5000,0)");
		 
		//scrollRight
		Thread.sleep(2000);
	 jse.executeScript("window.scrollBy(5000,0)");


	 
		
		
	}
}