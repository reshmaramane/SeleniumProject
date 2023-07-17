package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwiggyLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//using  when io exception connection failed exception in chrome driver 
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
		 WebDriver driver=new ChromeDriver(options);
			 //end
		 driver.manage().window().maximize();
		 driver.get("https://www.swiggy.com/auth");
		  driver.findElement(By.id("mobile")).sendKeys("123");
		 
		  driver.findElement(By.xpath("//button[@class='_1vTVI _2UPEv']")).click();
	}

}
