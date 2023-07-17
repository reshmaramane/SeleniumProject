package qsp;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class RunTimePolymorphims {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Select the required browser!!!");
			String browserValue = sc.next();
			
			if(browserValue.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); // avoid illegalstateException
				 WebDriver driver = new ChromeDriver(); //launch the browser
				 driver.manage().window().maximize(); //maximize the browser
			
			}
			
			  else if (browserValue.equals("edge"))
			  {
				  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe"); // avoid illegalstateException
					 WebDriver driver = new EdgeDriver(); //launch the firefox
					 driver.manage().window().maximize(); //maximize the firefox
			 }
			else {
				System.out.println("select valid Browser");
			}
		}
	}

}
