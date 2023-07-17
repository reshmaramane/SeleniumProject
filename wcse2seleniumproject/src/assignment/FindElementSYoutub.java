package assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementSYoutub {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//using  when io exception connection failed exception in chrome driver 
				ChromeOptions options = new ChromeOptions();
				 options.addArguments("--remote-allow-origins=*");
				 Thread.sleep(2000);
				 WebDriver driver=new ChromeDriver(options);
					 //end
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/results?search_query=shorts+video");
		Thread.sleep(2000);
		

	   
		List<WebElement> ShortsName = driver.findElements(By.xpath("//span[@class='style-scope ytd-reel-item-renderer']"));
	    
		for(int i=0;i<ShortsName.size();i++) {
	   
			WebElement opt = ShortsName.get(i);
			 String ShortsNames = opt.getText();
			 System.out.println(ShortsNames);
			 Thread.sleep(2000);
	    }
//		 List<WebElement> priceOfMobile = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		 
		 
	}

}
