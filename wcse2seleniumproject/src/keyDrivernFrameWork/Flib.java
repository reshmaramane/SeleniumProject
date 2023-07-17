package keyDrivernFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	// to store generic reusable methods
	
	 //generic reusable  method to read  the data from excel sheet
	 public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	   {
		   FileInputStream fis = new FileInputStream(excelPath);//provide the path of file
	       Workbook wb = WorkbookFactory.create(fis);//make the file ready for  
	       Sheet sheet= wb.getSheet(sheetName);//get into the sheet

	                      Row row = sheet.getRow(rowCount);//
	                       Cell cell = row.getCell(cellCount);//get the  desired cell
	       String data=cell.getStringCellValue();//read the data from cell
	       return data;
	   }
	   
	   //  generic reusable method to  get last row count
	   public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException 
	   {
		   FileInputStream fis = new FileInputStream(excelPath);//provide the path of file
	       Workbook wb = WorkbookFactory.create(fis);//make the file ready for  
	       Sheet sheet= wb.getSheet(sheetName);//get into the sheet 
	         int rc = sheet.getLastRowNum();
	         return rc;
	        
	         }
	   
	   // generic reusable method to write the data in excel sheet 

	   
	   public void writeExclData(String excelPath,String sheetName,int rowCount, int CellCount ) throws EncryptedDocumentException, IOException 
	   {
		   FileInputStream fis = new FileInputStream(excelPath);//provide the path of file
	       Workbook wb = WorkbookFactory.create(fis);//make the file ready for  
	       Sheet sheet= wb.getSheet(sheetName);//get into the sheet 
	        Row  row= sheet.getRow(rowCount);
	        
	         Cell cell= row.createCell(CellCount);
	         cell.setCellValue(sheetName);
	       
	
	   }
	   
	   // generic reusable method to  to read the from property file
	   
	   
	     public String readPropertyData(String propPath, String key) throws IOException 
	     {
	    	 FileInputStream fis = new FileInputStream(propPath);
	    	 Properties prop = new  Properties();
	    	  prop.load(fis);
	    	  
	    	  String value = prop.getProperty(key); 
	    	  
	    	  return value;
	     }
   
	   
	
	

}
