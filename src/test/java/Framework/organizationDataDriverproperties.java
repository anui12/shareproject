package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class organizationDataDriverproperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		final WebDriver d;

		FileInputStream file=new FileInputStream("src\\test\\resources\\organization.properties");
		Properties p=new Properties();
		p.load(file);
		
		String browser = p.getProperty("Browser");
		String url=p.getProperty("URL");
		String user=p.getProperty("USERNAME");
		String pass=p.getProperty("PASSWORD");
		String account=p.getProperty("AccountName");
		String last=p.getProperty("LastName");
		if(browser.equals("Chrome")) {
			d=new ChromeDriver();
		}else if(browser.equals("Edge")) {
			d=new EdgeDriver();
		}else {
			d=new FirefoxDriver();
		}
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get(url);
		d.findElement(By.name("user_name")).sendKeys(user);
		d.findElement(By.name("user_password")).sendKeys(pass);
		d.findElement(By.id("submitButton")).click();
		
		FileInputStream excel=new FileInputStream("src\\test\\resources\\organization.xlsx");
		Workbook wb=WorkbookFactory.create(excel);
		Sheet r = wb.getSheet("Sheet1");
		Row row = r.getRow(3);
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		d.findElement(By.name("accountname")).sendKeys(account);
		d.findElement(By.xpath("//input[@value='T']")).click();
		d.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
		Thread.sleep(2000);
		WebElement c = d.findElement(By.xpath("(//td[@class='small'])[2]"));
		Actions a=new Actions(d);
		a.moveToElement(c).perform();
		d.findElement(By.xpath("//a[text()='Sign Out']")).click();
		

	}
}
