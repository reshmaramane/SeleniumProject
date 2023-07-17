package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HotStarLoginPage {

	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		//using  when io exception connection failed exception in chrome driver 
				ChromeOptions options = new ChromeOptions();
				 options.addArguments("--remote-allow-origins=*");
				 Thread.sleep(2000);
				 WebDriver driver=new ChromeDriver(options);
					 //end
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='phoneNo']")).sendKeys("8888888888");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='submit-button']")).click();
	}
}
