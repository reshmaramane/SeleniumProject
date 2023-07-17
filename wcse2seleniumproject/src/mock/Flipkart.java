package mock;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.Point;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.JavascriptExecutor;


public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[.='✕']")).click();
	
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("apple smartwatch");
	 
	 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	 
 driver.findElement(By.xpath("//a[text()='APPLE Watch Series 6 GPS + Cellular']")).click();

    Thread.sleep(2000);
    Set<String> wh= driver.getWindowHandles();
    ArrayList  ar = new ArrayList(wh); 
    System.out.println(ar.get(0)); //will retrive first window handel
    System.out.println(ar.get(1)); //will retrive second window handel
    
    driver.switchTo().window((String)ar.get(1));
    Thread.sleep(2000);
    
  driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("416205",Keys.ENTER);
  Thread.sleep(2000);
  driver.findElement(By.xpath("//button[text()='Add to cart']")).click(); 
  Thread.sleep(2000);
 
  
    WebElement removeButton = driver.findElement(By.xpath("//div[text()='Remove']"));
	Point point2 = removeButton.getLocation();
	int xaxis1 = point2.getX();
	int yaxis1 = point2.getY();
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy("+xaxis1+","+yaxis1+")");
	removeButton.click();
	  Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Remove']")).click();
	
 

	}
}











