package assignment;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStack {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//using  when io exception connection failed exception in chrome driver 
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
		 WebDriver driver=new ChromeDriver(options);
			 //end
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 

		driver.get("https://www.shoppersstack.com/");
 
		
   WebElement APPLE = driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__MDlEh']/descendant::img[@alt='APPLE iPhone 14 Pro']"));
   APPLE.click();
   
	driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("412412");
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

	WebElement CheckButton = driver.findElement(By.xpath("//button[text()='Check']"));
	wait.until(ExpectedConditions.elementToBeClickable(CheckButton)).click();
	

	
	}

}
