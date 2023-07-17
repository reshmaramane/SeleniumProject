package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
  @Test(description = "This is FTC!!")
  public void search1() {
	  Reporter.log("Log in Page",true);
  }
}
