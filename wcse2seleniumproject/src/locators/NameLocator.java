package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NameLocator {
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

	 driver.get("file:///C:/Users/91915/Desktop/seleniumdata/WebElement/checkbox.html");
	 driver.findElement(By.name("n1")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.name("n2")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.name("n3")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.name("n4")).click();
	 Thread.sleep(2000);



}
}
