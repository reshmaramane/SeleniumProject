package assignment;


import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//using  when io exception connection failed exception in chrome driver 
				ChromeOptions options = new ChromeOptions();
				 options.addArguments("--remote-allow-origins=*");
				 Thread.sleep(2000);
				 WebDriver driver=new ChromeDriver(options);
					 //end
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com/ap/register?openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		  driver.findElement(By.id("ap_customer_name")).sendKeys("Reshma");
	     driver.findElement(By.id("ap_email")).sendKeys("123456");
	     driver.findElement(By.id("ap_password")).sendKeys("Reshu@34");
	     driver.findElement(By.id("ap_password_check")).sendKeys("Reshu@34");
	     driver.findElement(By.id("continue")).click();
//	     driver.findElement(By.tagName("button")).click();
         
          //	     driver.close();
	   
	     
	     
	}
	

}
