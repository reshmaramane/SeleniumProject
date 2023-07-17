package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartCartlogin {
	
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
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // timeout is a method within 30sec login button is working
		
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		
		
//		driver.findElement(By.xpath("//div[@class='YUhWwv']")).click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='_1psGvi _3BvnxG']")).click();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
//		Thread.sleep(2000);
//		driver.quit();
		
	}
	

}
