package javaScriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddArgumentMethodExceptionHandling {
 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//using  when io exception connection failed exception in chrome driver 
		//start code exception improtant
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
		 WebDriver driver=new ChromeDriver(options);
			 //end
			
			
			driver.manage().window().maximize();
			
			driver.get("https://en.wikipedia.org/wiki/Singapore");

			 
	}
	
}
 