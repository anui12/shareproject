package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import data.productexcel;
import data.productfile;
import data.productwebdriver;

public class productBasePage {

	@Test
	
	public void Product() throws EncryptedDocumentException, IOException, InterruptedException {
		
		final WebDriver d;
		
		productfile f=new productfile();
		productexcel ex=new productexcel();
		productwebdriver wb=new productwebdriver();
		
		String url = f.getDataFromFile("URL");
		String user=f.getDataFromFile("USERNAME");
		String pass=f.getDataFromFile("PASSWORD");
		String browser=f.getDataFromFile("Browser");
		
		if(browser.equals("Chrome")) {
			d=new ChromeDriver();
		}else if(browser.equals("Firefox")) {
			d=new FirefoxDriver();
		}else {
			d=new EdgeDriver();
		}
		
		String productname = ex.getDataFromExcel("Sheet1", 3, 1);
		String part=ex.getDataFromExcel("Sheet1", 4, 1);
		String drop=ex.getDataFromExcel("Sheet1", 5, 1);
		String usage=ex.getDataFromExcel("Sheet1", 6, 1);
		String handler=ex.getDataFromExcel("Sheet1", 7, 1);
		wb.maximize(d);
		wb.time(d);
		productPage p=new productPage();
		PageFactory.initElements(d, p);
		d.get(url);
		p.getUsername().sendKeys(user);
		p.getPass().sendKeys(pass);
		p.getClick().click();
		p.getProductlink().click();
		p.getPlusbtn().click();
		p.getProductname().sendKeys(productname);
		p.getProcode().sendKeys(part);
		p.getDrop().sendKeys(drop);
		wb.javascript(d);
		p.getUsageunit().sendKeys(usage);
		p.getHandler().click();
		p.getGroup().sendKeys(handler);
		WebElement abc = p.getFiles();
		wb.action(d, abc);
		wb.singleClick(d, abc);
		Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\auto\\productvtiger.exe");
		Thread.sleep(15000);
		p.getSave().click();
		WebElement ab = p.getLogo();
		wb.action(d, ab);
		p.getSignout().click();
	}
}
