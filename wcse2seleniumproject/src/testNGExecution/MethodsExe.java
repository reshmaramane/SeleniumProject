package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodsExe {
	
	@Test
	public  void mathod1()
	{
		 long threadid = Thread.currentThread().getId();
		  Reporter.log(threadid + "is the threadid",true);
		  Reporter.log("Method1", true);
		  
	}
	@Test
	public  void mathod2()
	{
		 long threadid = Thread.currentThread().getId();
		  Reporter.log(threadid + "is the threadid",true);
		  Reporter.log("Method2", true);
		  
	}

}
