package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	
  @Test(invocationCount = 1000)
  public void ft() {
	  
	  Reporter.log("FTC is executing!!!",true);
  }
}