package XpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath67 {
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
//	driver.get("https://www.google.co.in/");
//	
//	driver.findElement(By.xpath("//input[contains(@class,'gLFyf')]")).sendKeys("flipkart",Keys.ENTER);
//	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("Laptop",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Brand' and (@class='_2gmUFU _3V8rao')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Operating System' and (@class='_2gmUFU _3V8rao')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 10']")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='4★ & above']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[text()='₹60,000']/ancestor::div[@class='_3pLy-c row']//*[contains( text(),'HP Core i5 7th Gen - (8 GB/256 GB SSD/Windows 10 Home) 13-V123TU Thin and Light Laptop')]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button [contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")).click();
	//driver.quit();
	
	 
	
	 
	 
}

}
