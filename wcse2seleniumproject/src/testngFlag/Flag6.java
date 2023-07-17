package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(enabled = false)
  public void login() {
	  
	  Reporter.log("Login method",true);
  }
  
  @Test(enabled = false)
  public void logout()
  {
	  Reporter.log("Logout method",true);
  }
}