package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollUpToLocation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//using  when  Java.io exception connection failed exception in chrome driver 
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
			//upcasting with the web driver interface
		 WebDriver driver=new ChromeDriver(options);
			 //end
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://en.wikipedia.org/wiki/Singapore");
		
		
		WebElement download = driver.findElement(By.xpath("//div[@class='thumb tnone']"));
		Point loc = download.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		System.out.println(xaxis+" "+yaxis);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//scrolldown
		Thread.sleep(2000);
	 jse.executeScript("window.scrollBy(0,10071)");
	 
	 
	//scrolldup
			Thread.sleep(2000);
		 jse.executeScript("window.scrollBy(0,-10071)");
		 
	 
	}
}
