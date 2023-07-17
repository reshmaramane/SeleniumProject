package oldKeyWordDrivernFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import keyDrivernFrameWork.IAutoConstant;

public class BaseTest {
	static WebDriver driver;

	public void setUp() throws IOException
	{// open the browser

		Flib flib = new Flib();
		String browserValue = flib.readPropertyData("./data/config.properties","browser");
		String url = flib.readPropertyData("./data/config.properties","url");
		if(browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}
		else if(browserValue.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
		}
		else
		{
			System.out.println("invalid browserValue!!");
		}

	}

	public void tearDown()
	{
		driver.quit();
	}

}
