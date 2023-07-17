package XpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath3 {
public static void main(String[] args) throws InterruptedException {
		
		//X-path By Using Contains
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//using  when  Java.io exception connection failed exception in chrome driver 
	ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
	 Thread.sleep(2000);
		//upcasting with the web driver interface
	 WebDriver driver=new ChromeDriver(options);
		 //end
	 driver.manage().window().maximize(); 
driver.get("https://www.instagram.com/accounts/login/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Reshma");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Reshu@17");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();


}
}
