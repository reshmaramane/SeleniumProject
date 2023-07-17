package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveAction {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//using  when io exception connection failed exception in chrome driver 
				ChromeOptions options = new ChromeOptions();
				 options.addArguments("--remote-allow-origins=*");
				 Thread.sleep(2000);
				 WebDriver driver=new ChromeDriver(options);
					 //end
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.bluestone.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.id("denyBtn")).click();
		 
		 WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch J')]"));
		 
		 // To Perform Mouse Action Create Obj of Actions Class
		 
		   Actions act = new Actions(driver);
		   
		   // to pefrom mouseHover action
		   act.moveToElement(target).build().perform();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//a[.='Band']")).click();
		   
		 
	}

}
