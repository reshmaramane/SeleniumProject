package webBasedpopupHandling;

import java.io.IOException;
import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 
		 //to handle usse method of  ChromeOptions
		 options.addArguments("--disable-notifications");
		 
		 Thread.sleep(2000);
		 WebDriver driver=new ChromeDriver(options);
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://in.puma.com/in/en");
		 //we will notification popup
		 
		 
	}

}
