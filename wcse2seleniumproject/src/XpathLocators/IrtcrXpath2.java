package XpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrtcrXpath2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//using  when  Java.io exception connection failed exception in chrome driver 
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
			//upcasting with the web driver interface
		 WebDriver driver=new ChromeDriver(options);
			 //end
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext ui-widget ui-state')]")).sendKeys("pune");
		driver.findElement(By.xpath("//span[contains(@class,'ng-star-inserted') and (.='PUNE JN - PUNE')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ui-inputtext ui-widget ui-')]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-9 ng-star-inserted' and ( text()='MUMBAI CENTRAL - MMCT' )]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-10 ui-')]")).click();
		driver.findElement(By.xpath("//a[.='11']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-11 ui-')]")).click();
		driver.findElement(By.xpath("//span[@class='ng-star-inserted' and (text()='AC First Class (1A) ')]")).click();
		
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//label[.='Flexible With Date']")).click();
		driver.findElement(By.xpath("//button[.='Search']")).click();
		
		
	}
	

}