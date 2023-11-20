
package Excelonline;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getastrownumber {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

	

				//read data from excel
				
				FileInputStream fis = new FileInputStream("src\\test\\resources\\contactexcel.xlsx");   
			     Workbook wb = WorkbookFactory.create(fis);
			   Sheet sheet = wb.getSheet("Sheet1");
			   
			   
//			  Row rw = sheet.getRow(0);
//			 Cell cell1= rw.getCell(0);
//			   String dat = cell1.getStringCellValue();
//			   System.out.println(dat);
			   
			   
			 //to get last row number
			   
				  int count = sheet.getLastRowNum();	
				  for (int i = 0; i < count; i++) {
					  Row row = sheet.getRow(i);
					 Cell cl0=row.getCell(0);
					System.out.println(cl0);
					String cl1=row.getCell(1).getStringCellValue();
					System.out.println(cl1);
				  }
			}
		}
