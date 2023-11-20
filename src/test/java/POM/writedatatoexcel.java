package POM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writedatatoexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("src\\test\\resources\\contactexcel.xlsx");
		Workbook wb=WorkbookFactory.create(file);
//		Sheet sh = wb.getSheet("Sheet1");
		
		Sheet sh = wb.createSheet("Aniket");
		Row rw = sh.createRow(17);
		Cell cl = rw.createCell(0);
		
		cl.setCellValue("Aniket");
		 
		FileOutputStream out=new FileOutputStream("src\\test\\resources\\contactexcel.xlsx");
		wb.write(out);
	}
}
