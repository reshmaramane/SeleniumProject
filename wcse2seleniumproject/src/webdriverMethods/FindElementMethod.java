package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//using  when  Java.io exception connection failed exception in chrome driver 
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
			//upcasting with the web driver interface
		 WebDriver driver=new ChromeDriver(options);
			 //end

		 driver.get("file:///C:/Users/91915/Desktop/seleniumdata/WebElement/checkbox.html");
		 
		 WebElement automationchkBox = driver.findElement(By.id("i4"));
		 
	 System.out.println("automationchkBox");
		 automationchkBox.click();
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.get("http://dell/login.do");

		 
		  WebElement usn= driver.findElement(By.name("username"));
		  usn.sendKeys("admin");
		  Thread.sleep(2000);
		  
		  WebElement pass= driver.findElement(By.name("pwd"));
		  pass.sendKeys("manager");
		  Thread.sleep(2000);
		  
		  
		  driver.findElement(By.id("loginButton")).click();
		  
		  
		 
		 
	}

}
