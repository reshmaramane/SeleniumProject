package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	
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
		 driver.get("https://www.selenium.dev/downloads/");
		 
		WebElement target=driver.findElement(By.xpath("//h1[.='Downloads']"));
		
		           Actions act = new Actions(driver);
		           // to perform right click
		           act.contextClick(target).perform();
	}

}
