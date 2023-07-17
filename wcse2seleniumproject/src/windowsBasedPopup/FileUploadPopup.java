package windowsBasedPopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//using  when io exception connection failed exception in chrome driver 
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 Thread.sleep(2000);
		 WebDriver driver=new ChromeDriver(options);
			 //end
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("http://127.0.0.1/login.do");
		 
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
		 WebElement target = driver.findElement(By.partialLinkText("Logo & Color Scheme"));
		 
		 Actions act = new Actions(driver);
		 // mouserHover Action
		 act.moveToElement(target).perform();
		 target.click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		 
		 WebElement target2 = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		 //DoubleClick Action
		 act.doubleClick(target2).perform();
		 
		 //Handle FileUploadPopup
		 File path= new File("./autoit/FileUploadPopUp.exe");
		String apath = path.getAbsolutePath();
		
		 Runtime.getRuntime().exec(apath);
		 Thread.sleep(4000);
		 Runtime.getRuntime().exec(apath);
		 
		 
		 
	}
}
