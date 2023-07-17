package pageObjectModel;

import java.io.IOException;

public class ActiTimeCreateUserTestCase  extends BestTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BestTest bt = new BestTest();
		bt.setUp();
		
		Filb flib = new Filb();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password") );
		
		Thread.sleep(2000);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnusers();
		
		Thread.sleep(2000);
		
		UserPage up = new UserPage(driver);
		up.userCreate();
		Thread.sleep(2000);
		String usn = flib.readExcelData(EXCEL_PATH, "userdata",1, 0);
		String pass = flib.readExcelData(EXCEL_PATH, "userdata",1, 1);
		//String rtp = flib.readExcelData(EXCEL_PATH, "userdata",1, 1);
		String fn = flib.readExcelData(EXCEL_PATH, "userdata",1, 2);
		String ln = flib.readExcelData(EXCEL_PATH, "userdata",1, 3);
		up.firstUser(usn,pass,fn,ln);
		
		
	}

}
