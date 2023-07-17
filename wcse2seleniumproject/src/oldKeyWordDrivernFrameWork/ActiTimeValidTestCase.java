package oldKeyWordDrivernFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

import keyDrivernFrameWork.Flib;

public class ActiTimeValidTestCase  extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData("./data/config.properties","username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData("./data/config.properties","password"));
		driver.findElement(By.id("loginButton")).click();		
		Thread.sleep(2000);
		bt.tearDown();
		
		
	}

}
