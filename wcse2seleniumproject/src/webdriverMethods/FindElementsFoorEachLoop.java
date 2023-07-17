package webdriverMethods;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsFoorEachLoop {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();

		 driver.get("https://www.google.com/");
		 driver.switchTo().activeElement().sendKeys("iphone");
		 Thread.sleep(2000);
		 
		 List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'pcTkSc')]"));
		 
		 for(WebElement opt:options)
		 {
			
			 String iphones = opt.getText();
			 System.out.println(iphones);
			 Thread.sleep(2000);
			 
		 }
		 
		 
	}

}
