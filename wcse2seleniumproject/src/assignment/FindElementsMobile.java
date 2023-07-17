package assignment;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsMobile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//using  when io exception connection failed exception in chrome driver 
				ChromeOptions options = new ChromeOptions();
				 options.addArguments("--remote-allow-origins=*");
				 Thread.sleep(2000);
				 WebDriver driver=new ChromeDriver(options);
					 //end
		driver.manage().window().maximize();
//		driver.get("https://www.google.co.in/");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		Thread.sleep(2000);
		
	
		driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("mobiles",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
	
		
	 List<WebElement> mobiles = driver.findElements(By.xpath("//div[contains(@class,'_4rR01T')]"));
	 
	 List<WebElement> priceOfMobile = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
	 

	
	 for(int i=0;i<mobiles.size();i++)
	 {
		 
		 String op = mobiles.get(i).getText();

		 
		 for(int j=i;j<=i;j++) {
			 String opt = priceOfMobile.get(j).getText();
			 System.out.print(op+" :"+opt);
			 Thread.sleep(2000);
		 }
		  System.out.println( );
		 
	 }
		 
	}

}
