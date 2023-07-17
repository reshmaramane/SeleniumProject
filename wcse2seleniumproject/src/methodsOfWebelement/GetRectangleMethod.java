package methodsOfWebelement;


import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetRectangleMethod {
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
		
		driver.get("https://www.selenium.dev/downloads/");
		
		
		WebElement download = driver.findElement(By.xpath("//h1[text()='Downloads']"));
		Rectangle rect = download.getRect();
		int xaxis = rect.getX();
		int yaxis= rect.getY();
		System.out.println(xaxis+" "+yaxis);
		
		int h = rect.getHeight();
		int w = rect.getWidth();
		System.out.println(h+" "+w);
		
		
		
		
		
		
		
	}

}
