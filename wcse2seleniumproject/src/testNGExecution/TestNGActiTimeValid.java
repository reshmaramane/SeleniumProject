package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGActiTimeValid {
	//ActitimeValidLogin
	 static WebDriver driver;
	 
	 @Test
	 @Parameters({"browser","url","usename","password"})
	 public void validLogin(String browser,String url, String username,String password)
	 {
		 
		 if(browser.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
//		 Thread.sleep(2000);
		  driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get(url);
		 
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  driver.findElement(By.name("loginButton")).click();
		  
		 
		 
	 }
		 
		 else if(browser.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
//		 Thread.sleep(2000);
		  driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get(url);
		 
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  driver.findElement(By.name("loginButton")).click();
		  
		 
		 
	 }
		 
	 }

}
