package operationalMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
	//using  when  Java.io exception connection failed exception in chrome driver 
	ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
	 Thread.sleep(2000);
		//upcasting with the web driver interface
	 WebDriver driver=new ChromeDriver(options);
		 //end
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
    driver.get("file:///C:/Users/91915/Desktop/seleniumdata/WebElement/multipledropdown.html");
	WebElement dropDownElement = driver.findElement(By.id("i1"));
	
	Select sel = new Select(dropDownElement);
	
	   WebElement value = sel.getWrappedElement();
	   
	   String option = value.getText();
	   System.out.println(option);
	
	
	

}

}