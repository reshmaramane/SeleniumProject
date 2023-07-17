package pageObjectModel;

import java.io.IOException;

public class ActiTimeInvalidTestCase extends BestTest{

	public static void main(String[] args) throws IOException, InterruptedException {

		BestTest bt = new BestTest();
		bt.setUp();

		LoginPage lp = new LoginPage(driver);
		Filb flib = new Filb();
		int rc = flib.rowCount(EXCEL_PATH,"invalidcreds");

		for(int i=1;i<=rc;i++)
		{
			lp.invalidLogin(flib.readExcelData(EXCEL_PATH,"invalidcreds",i,0),flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
		}
		
		bt.tearDown();

	}
}