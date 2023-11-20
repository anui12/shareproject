package data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Opportunitiesexcel {

	public String  getDataFromexcel(String sheetname,int rownumber,int cellnumber) throws EncryptedDocumentException, IOException {
		FileInputStream excel=new FileInputStream("src\\test\\resources\\Oppornities.xlsx");
		Workbook wb=WorkbookFactory.create(excel);
		Sheet sh = wb.getSheet(sheetname);
		Row rw = sh.getRow(rownumber);
		Cell cl = rw.getCell(cellnumber);
		String data = cl.getStringCellValue();
		return data;
	}
}
