package assignment1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartIphoneHandle {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[.='✕']")).click();
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 13");
	 
	 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
//	  Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Pink, 128 GB)']")).click();
//	 driver.findElement(By.xpath("//button[text()='Add to cart']")).sendKeys("416205");
//
//	 driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	 Thread.sleep(2000);
	    Set<String> wh= driver.getWindowHandles();
	    ArrayList  ar = new ArrayList(wh);
	    System.out.println(ar.get(0));
	    System.out.println(ar.get(1));
	    
	    driver.switchTo().window((String)ar.get(1));
	    Thread.sleep(2000);
	    
	  driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("416205",Keys.ENTER);
	  Thread.sleep(2000);
	 
	 
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click(); 
	  Thread.sleep(2000);

}
}
