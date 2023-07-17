package XpathLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		
		//X-path By Using Unique Attribute
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//using  when  Java.io exception connection failed exception in chrome driver 
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
			//upcasting with the web driver interface
		 WebDriver driver=new ChromeDriver(options);
			 //end
		 driver.manage().window().maximize(); 
	 driver.get("https://www.nike.com/my/member/profile/login?continueUrl=https://www.nike.com/my/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("Reshma");
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Resh@27");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
	 
	 
		 
		 
		 
	}

}
