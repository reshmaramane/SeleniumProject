package testngFlag;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	
  @Test
  public void login() {
	  
	  Assert.fail();
	  Reporter.log("login method!!",true);
  }
  
  @Test(dependsOnMethods = "login",alwaysRun = true)
  public void createUser()
  {
	  Reporter.log("createUserMethod!!",true);
  }
  
  @Test
  public void logout()
  {
	  Reporter.log("logout Method!!",true);
  }
}