package readExcelData;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeValidText {
   public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//using  when  Java.io exception connection failed exception in chrome driver 
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
	
			//upcasting with the web driver interface
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("http://dell/login.do");
		 //to read valid username from validcreds sheet
		 FileInputStream fis = new FileInputStream("./data/ActiTime.xlsx");//provide the path of file
		    Workbook wb = WorkbookFactory.create(fis);//make the file ready for  
		    Sheet sheet= wb.getSheet("Validcreds");//get into the sheet
		    Row row = sheet.getRow(1);//
            Cell cell = row.getCell(0);//get the  desired cell
            String username=cell.getStringCellValue();//read the data from cell
           
            //to read valid password from validcreds sheet
   		 FileInputStream fis2 = new FileInputStream("./data/ActiTime.xlsx");//provide the path of file
   		    Workbook wb2 = WorkbookFactory.create(fis2);//make the file ready for  
   		    Sheet sheet2= wb2.getSheet("Validcreds");//get into the sheet
   		    Row row2 = sheet2.getRow(1);//
               Cell cell2 = row2.getCell(0);//get the  desired cell
               String password=cell2.getStringCellValue();//read the data from cell
                Thread.sleep(2000);
               
               driver.findElement(By.name("username")).sendKeys(username);
               driver.findElement(By.name("pwd")).sendKeys(password);
               driver.findElement(By.id("loginButton")).click();
               
               
            
            
            
}
}
