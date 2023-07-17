package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OnlyCloseChildBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//using  when  Java.io exception connection failed exception in chrome driver 
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
			//upcasting with the web driver interface
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("http://omayo.blogspot.com/");
		 String parentHandle=  driver.getWindowHandle();
		 
		  driver.findElement(By.linkText("Open a popup window")).click();
		  Thread.sleep(2000);
		  Set<String>  allHandles = driver.getWindowHandles();
		  for(String wh:allHandles) {
			  if(!parentHandle.equals(wh)) {
				 driver.switchTo().window(wh).close(); 
			  }
			  else {
				  
			  }
		  }
		 
	}

}
