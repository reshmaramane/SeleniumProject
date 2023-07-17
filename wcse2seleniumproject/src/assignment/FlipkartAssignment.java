package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartAssignment {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//using  when io exception connection failed exception in chrome driver 
				ChromeOptions options = new ChromeOptions();
				 options.addArguments("--remote-allow-origins=*");
				 Thread.sleep(2000);
				 WebDriver driver=new ChromeDriver(options);
					 //end
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 
		// driver.findElement(By.xpath("//button[.='✕']")).click();
		 
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
		 
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 //Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[.='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
		
		 WebElement brand = driver.findElement(By.xpath("//div[.='Brand' and (@class='_2gmUFU _3V8rao')]"));
		 brand.click();
		 driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
		
		 driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Operating System')]")).click();
		
		 driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Windows 10']")).click();
		
		 driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='3★ & above']")).click();
		
		// driver.quit();
		 
	}

}
