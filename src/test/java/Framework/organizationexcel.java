package Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class organizationexcel {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new ChromeDriver();
		FileInputStream file=new FileInputStream("src\\test\\resources\\organization.xlsx");
		
		Workbook wb=WorkbookFactory.create(file);

		//to get control of the sheet
		Sheet sh=wb.getSheet("sheet1");
		
		//to get control of the row
		Row rw1 = sh.getRow(0);
		
		//to get the control of column
		Cell cl = rw1.getCell(0);
		
		//to get the value of the cell
		String data1 = cl.getStringCellValue();
		System.out.println(data1);
		
		//for url prinit
		Row rw2 = sh.getRow(0);
		Cell c2 = rw2.getCell(1);
		String data2 = c2.getStringCellValue();
		System.out.println(data2);
		
		//for username only
		Row rw3 = sh.getRow(1);
		Cell c3 = rw3.getCell(0);
		String data3 = c3.getStringCellValue();
		System.out.println(data3);
		
		//for username ans
		Row rw4 = sh.getRow(1);
		Cell c4 = rw4.getCell(1);
		String data4 = c4.getStringCellValue();
		System.out.println(data4);
		
		//for password 
		Row rw5 = sh.getRow(2);
		Cell c5 = rw5.getCell(0);
		String data5 = c5.getStringCellValue();
		System.out.println(data5);
		
		//for password ans
		Row rw6 = sh.getRow(2);
		Cell c6 = rw6.getCell(1);
		String data6 = c6.getStringCellValue();
		System.out.println(data6);
		
		//for account number
		Row rw7 = sh.getRow(3);
		Cell c7 = rw7.getCell(0);
		String data7 = c7.getStringCellValue();
		System.out.println(data7);
				
		//for password ans
		Row rw8 = sh.getRow(3);
		Cell c8 = rw8.getCell(1);
		String data8 = c8.getStringCellValue();
		System.out.println(data8);
	}
}
