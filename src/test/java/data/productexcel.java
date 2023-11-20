package data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class productexcel {

	public String getDataFromExcel(String sheetname, int rownumber, int cellnumber) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("src\\test\\resources\\productvtiger.xlsx");
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh = wb.getSheet(sheetname);
		Row rw = sh.getRow(rownumber);
		Cell cl = rw.getCell(cellnumber);
		String data = cl.getStringCellValue();
		return data;
	}
}
