package Excelonline;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class createnewsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("src\\test\\resources\\exceldata.xlsx");
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh = wb.createSheet("Aniket");
		Row rw = sh.createRow(0);
		Cell cell = rw.createCell(0);
		cell.setCellValue("Pune");
		
	
		Row rw1 = sh.createRow(1);
		Cell cell1 = rw1.createCell(1);
		cell1.setCellValue("Deccan");
		
	
//		Row rw2 = sh.createRow(1);
//		Cell cell2 = rw2.createCell(1);
//		cell2.setCellValue("Amravati");
		FileOutputStream out=new FileOutputStream("src\\test\\resources\\exceldata.xlsx");
		wb.write(out);
	}
}
