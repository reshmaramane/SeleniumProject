package pageObjectModel;

import java.io.IOException;

public class ActiTimeValidTestCase extends BestTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BestTest bt = new BestTest();
		bt.setUp();
		Filb flib = new Filb();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password") );
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(2000);
		hp.logOut();
		Thread.sleep(2000);
		bt.tearDown();
	}

}