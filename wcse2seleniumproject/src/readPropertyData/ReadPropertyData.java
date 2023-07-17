package readPropertyData;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {
public static void main(String[] args) throws IOException {
	
	FileInputStream fis = new FileInputStream("./data/config.properties");//provide the path of file
     
	
	//to read the property data 
	Properties prop = new  Properties();
	  
	
	// we need to use this methods
	
	   prop.load(fis); //make the file  ready for read
	 
	
	String data = prop.getProperty("url"); //use to read key value from property file
	 System.out.println(data);
	   
	
	
	
}
}
