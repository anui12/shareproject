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

public class putdatainexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream  in =new FileInputStream("src\\test\\resources\\exceldata.xlsx");
		Workbook wb=WorkbookFactory.create(in);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.createRow(12);
		Cell cell = rw.createCell(0);
		cell.setCellValue("Pune");
		FileOutputStream out=new FileOutputStream("src\\test\\resources\\exceldata.xlsx");
		wb.write(out);
		
	}
}
