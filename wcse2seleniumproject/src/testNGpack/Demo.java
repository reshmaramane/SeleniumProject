package testNGpack;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  
	 Reporter.log("Sunday!!!",true);
  }
  
  @Test
  public void m1()
  {
	  Reporter.log("method name is m1",true);
  }
  @Test
  public void m2()
  {
	  Reporter.log("method name is m2",true);
  }
}
