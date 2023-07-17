package webBasedpopupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AlertPopUp {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
		 WebDriver driver=new ChromeDriver(options);
	
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("file:///C:/Users/91915/Desktop/seleniumdata/WebElement/alertpopup.html");
		
		 //generate the alert popup
		 driver.findElement(By.xpath("//button[text()=' Click me! ']")).click();
		 
		 // switch the controls to Alert PopUp
		 Thread.sleep(2000);
		 Alert al = driver.switchTo().alert();
		 
		  //1 print of  the Alert PopUp
		 Thread.sleep(2000);
		 System.out.println(al.getText());
		 
		  //2 Accept the Alert PopUp
//		 Thread.sleep(2000);
		  //al.accept();
		 
		  //3  dismiss the Alert PopUp
		 //Thread.sleep(2000);
//		 al.dismiss();
		 
//		 4 pass the characters to alert popup
//		 Thread.sleep(2000);
//		 al.sendKeys("qqq");
	}

}
