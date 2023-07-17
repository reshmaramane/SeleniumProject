package handleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndexMethod {
	
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
		 driver.get("file:///C:/Users/91915/Desktop/seleniumdata/WebElement/multipledropdown.html");
		 
		 WebElement dropDownElement = driver.findElement(By.id("i1"));
		 Select sel = new Select(dropDownElement);
		 // select multiple options
		 
		 for(int i=0;i<6;i++)
		 {
			 sel.selectByIndex(i);
			 Thread.sleep(2000);
		 }
		 
		 Thread.sleep(2000);
		 
		 // deselect multiple options
		 for(int i=0; i<6;i++)
		 {
			 sel.deselectByIndex(i);
			 Thread.sleep(2000);
		 }
		 
	}

}