package testNGannotations;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class GoogleLaunchTest extends BaseTest {
	 @Test
	  public void googleTest() {
		  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	  }

 @BeforeMethod
 public void beforeMethod() {
	 driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
	  
 }

 @AfterMethod
 public void afterMethod() {
	 driver.switchTo().activeElement().sendKeys("MANUAL",Keys.ENTER);
	  
 }
	
	

}
