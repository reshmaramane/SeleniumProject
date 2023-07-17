package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		webdriver.gecko.driver
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
          new FirefoxDriver();
	}

}
	