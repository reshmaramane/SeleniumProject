package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//using  when io exception connection failed exception in chrome driver 
				ChromeOptions options = new ChromeOptions();
				 options.addArguments("--remote-allow-origins=*");
				 Thread.sleep(2000);
				 WebDriver driver=new ChromeDriver(options);
					 //end\
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Qspiders-Wakad/Desktop/SeleniumData/WebElement/MultiSelectDropDown.html");

		WebElement dropDownElement = driver.findElement(By.id("i1"));

		Select sel = new Select(dropDownElement);
		
		HashSet<String> hs = new HashSet<String>();
		
		// get the list of webelement
		
		List<WebElement> allOps = sel.getOptions();
		
		// Read the list & get the text 
		
		for(int i=0;i<allOps.size();i++)
		{
			WebElement option = allOps.get(i);
			String text = option.getText();
			
		   // add the text to set so that duplicates won't	be accepted and
			// insertion order is won't be maintained
			
			hs.add(text);
		}

		// Read the set
		
		for(String value:hs)
		{
			System.out.println(value);
		}
		
	}

}
