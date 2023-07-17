package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	
  @Test(priority = 3)
  public void login() {
	  Reporter.log("Logged in!!",true);
  }
  
  @Test(priority = 2)
  public void createUser()
  {
	  Reporter.log("UserCreated",true);
  }
  
  @Test(priority = 1)
  public void logOut()
  {
	  Reporter.log("Logged Out!!",true);
  }
  
   
}