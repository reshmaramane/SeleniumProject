package testNGExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestNGClass2  extends BaseTest{
	
	@Test
	public void Search2()
	{
		 driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
	}

}
