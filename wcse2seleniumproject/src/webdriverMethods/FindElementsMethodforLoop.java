package webdriverMethods;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsMethodforLoop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();

		 driver.get("https://www.google.com/");
		 driver.switchTo().activeElement().sendKeys("iphone");
		 Thread.sleep(2000);
		 
		 List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'pcTkSc')]"));
		 
		 for(int i=0;i<options.size();i++)
		 {
			 WebElement opt = options.get(i);
			 String iphones = opt.getText();
			 System.out.println(iphones);
			 Thread.sleep(2000);
			 
		 }
		 
		 
	}

}
