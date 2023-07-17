package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//fileinputstream  is java io exception
		  //TO READ MULTIPLE DATA FORM  EXCEL SHEET
		for(int i=1;i<=3;i++)
		{
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the path of file
		       Workbook wb = WorkbookFactory.create(fis);//make the file ready for  
		       Sheet sheet= wb.getSheet("IPL");//get into the sheet

	                          Row row = sheet.getRow(i);//
	                           Cell cell = row.getCell(0);//get the  desired cell
		       String data=cell.getStringCellValue();//read the data from cell
		       System.out.println(data);//print the data
		       
		       Thread.sleep(2000);
		} 
		       
		    		   
		       
	}

}
