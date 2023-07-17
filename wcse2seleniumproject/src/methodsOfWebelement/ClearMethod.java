package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		 driver=new ChromeDriver();
		//using  when  Java.io exception connection failed exception in chrome driver 
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
			//upcasting with the web driver interface
		 WebDriver driver=new ChromeDriver(options);
			 //end
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://dell/login.do");

		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("admin");
		WebElement Password = driver.findElement(By.name("pwd"));
		Password.sendKeys("manager");
		
		Thread.sleep(4000);
		userName.clear();
		Thread.sleep(1000);
		Password.clear();		
		
//		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		
}
}