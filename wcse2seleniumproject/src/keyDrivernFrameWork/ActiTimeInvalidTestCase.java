package keyDrivernFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

//import keyDrivernFrameWork.BaseTest;

public class ActiTimeInvalidTestCase  extends BaseTest {
	
//private static final String EXCEL_PATH = null;

	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.setUp();

		Flib flib = new Flib();

		int rc = flib.rowCount(EXCEL_PATH,"invalidcreds");

		for(int i=1;i<=rc;i++)
		{

			String invalidUsn = flib.readExcelData(EXCEL_PATH,"invalidcreds", i, 0);
			String invalidPass = flib.readExcelData(EXCEL_PATH,"invalidcreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(invalidUsn);
			driver.findElement(By.name("pwd")).sendKeys(invalidPass);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();

		}
		
		bt.tearDown();
	}

}
