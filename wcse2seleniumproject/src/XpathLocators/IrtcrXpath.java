package XpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrtcrXpath {
	public static void main(String[] args) throws InterruptedException {
	//X-path By Using Contains
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			 options.addArguments("--remote-allow-origins=*");
			 Thread.sleep(2000);
			 WebDriver driver=new ChromeDriver(options);
			 
			driver.manage().window().maximize();
			driver.get("https://www.irctc.co.in/nget/train-search");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted')]")).sendKeys("PUNE");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@class, 'ng-star-inserted')]")).sendKeys("PUNE JN - PUNE",Keys.ENTER);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ui-inputtext ui-widget ui-state-def')]")).sendKeys("MUMBAI");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ui-inputtext ui-widget ui-sta')]")).sendKeys("MUMBAI CENTRAL - MMCT",Keys.ENTER);
			
			
		
			
			
			driver.findElement(By.xpath("//input[contains(@class, 'ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted')]")).click();
			driver.findElement(By.xpath("//a[contains(@class, 'ui-state-default ng-tns-c58-10 ui-state-active ui-state-highlight ng-star-inserted')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[contains(@class, 'ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all')]")).click();
			driver.findElement(By.xpath("//span[contains(@class, 'ng-star-inserted') and (.='AC 2 Tier (2A)')]")).click();
			Thread.sleep(2000);
		
			
			driver.findElement(By.xpath("//div[contains(@class,'col-md-3 col-sm-12 col-xs-12 remove-pad')]")).click();
			
			
			
			

		



}

}
