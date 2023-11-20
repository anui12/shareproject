package data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class contactexcel {

	public String getDataFromExcel(String sheetname,int rownumber, int cellnumber) throws EncryptedDocumentException, IOException {
		FileInputStream excel=new FileInputStream("src\\test\\resources\\contactexcel.xlsx");
		Workbook wb=WorkbookFactory.create(excel);
		Sheet r = wb.getSheet(sheetname);
		Row row1 = r.getRow(rownumber);
		Cell cell1 = row1.getCell(cellnumber);
		String  value = cell1.getStringCellValue();
		return value;
	}
}
