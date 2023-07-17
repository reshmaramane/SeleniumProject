package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NetflixLoginPage {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//using  when io exception connection failed exception in chrome driver 
	ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
	 Thread.sleep(2000);
	 WebDriver driver=new ChromeDriver(options);
		 //end
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/Login");
	driver.findElement(By.id("id_userLoginId")).sendKeys("user");
	Thread.sleep(2000);
	driver.findElement(By.id("id_password")).sendKeys("user123");
	Thread.sleep(2000);

	driver.findElement(By.tagName("buttton")).click();
	Thread.sleep(2000);
driver.close();
	

	}

}
