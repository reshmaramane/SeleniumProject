package webBasedpopupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenpopupBlueStoone {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
//		 options.addArguments("--disable-notifications");
		 Thread.sleep(2000);
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://www.bluestone.com/"); 
		  Thread.sleep(2000);
		   driver.findElement(By.xpath("//span[.='Allow']")).click();
		   Thread.sleep(2000);
		 //  driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster eager-load    ']")).click();
		  //Switch To control
		   WebElement  frameElement = driver.findElement(By.id("fc-widget"));
		    driver.switchTo().frame(frameElement);
		    Thread.sleep(2000);
		   WebElement chatbox = driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster eager-load    ']"));
	         chatbox.click();
	         driver.switchTo().parentFrame();
	         WebElement nameTB =  driver.findElement(By.id("chat-fc-name"));
		    nameTB.sendKeys("Reshma");
		    WebElement emailTB =   driver.findElement(By.id("chat-fc-email"));
		    emailTB .sendKeys(".com");
		    WebElement phoneTB = driver.findElement(By.id("chat-fc-phone"));
		    phoneTB.sendKeys("");
		   driver.findElement(By.xpath("//a[@class='fc-button']")).click();
		   Thread.sleep(2000);
		   driver.quit();
		   
		   
	}
}
