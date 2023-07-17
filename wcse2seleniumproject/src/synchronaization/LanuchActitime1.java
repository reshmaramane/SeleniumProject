package synchronaization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LanuchActitime1 {

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
		driver.get("http://dell/login.do");
		String LoginPageActualTitle = driver.getTitle();
		
		if(LoginPageActualTitle.equals("actiTIME - Login")) {
			System.out.println("Test is passed login page verified!!");
			
		}
		else {
			System.out.println("Test is failed login page not verified!!");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String HomePageActualTitle = driver.getTitle();
		if(HomePageActualTitle.equals("actiTIME - Enter Time-Track")) {
			System.out.println("Test is passed home page verified!!");
			
		}
		else {
			System.out.println("Test is failed home page not verified!!");
		}
		
		

	}
	

}
