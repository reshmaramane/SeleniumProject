package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class GetTitleMethod {
public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//using  when  Java.io exception connection failed exception in chrome driver 
	ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
	 Thread.sleep(2000);
		//upcasting with the web driver interface
	 WebDriver driver=new ChromeDriver(options);
		 //end
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.get("https://www.instagram.com/accounts/login/");
	 String titleofWebpage = driver.getTitle();
	 System.out.println(titleofWebpage);
	 
	}

}
