package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelectorLocator {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//using  when  Java.io exception connection failed exception in chrome driver 
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
			//upcasting with the web driver interface
		 WebDriver driver=new ChromeDriver(options);
			 //end
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.instagram.com");
		 Thread.sleep(2000);
		 driver.findElement(By.name("username")).sendKeys("Reshma");
		 driver.findElement(By.name("password")).sendKeys("Reshma123");
		 driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
		 Thread.sleep(2000);
		 driver.quit();
		
	}
}
