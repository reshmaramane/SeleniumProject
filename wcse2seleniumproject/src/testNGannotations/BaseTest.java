package testNGannotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	static WebDriver driver;

  //SETUP IS LAUNCH THE BROWSER
  //suite which can contain xml file
  
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.google.com");
		  
	 }
	 
	 @AfterMethod
	  public void tearDown() {
		  driver.quit();
		  
	  }
	 @BeforeMethod
	 public void property() {
		  
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 }
	 
  
  
  
}
