package synchronaization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InstagramLogin {
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
		
		driver.get("https://www.instagram.com/");
		 Thread.sleep(2000); //for synchronization we provide delay 25sce for automation script..
		 driver.findElement(By.name("username")).sendKeys("Reshma");
		
    
		 driver.findElement(By.name("password")).sendKeys("Reshma@123");
		
		 driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
		 
		
		
		
	}

}
