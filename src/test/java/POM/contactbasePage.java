package POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import data.contactexcel;
import data.contactfile;
import data.contactwebdriver;

public class contactbasePage {
	@Test
public void contact()throws InterruptedException, IOException {
	{
		final WebDriver d;
	
		contactfile f=new contactfile();
		contactexcel ex=new contactexcel();
		contactwebdriver wb=new contactwebdriver();
		
		String browser=f.getDataFromFile("Browser");
		String url=f.getDataFromFile("URL");
		String user=f.getDataFromFile("UserName");
		String pass=f.getDataFromFile("Password");
		
		if(browser.equals("Edge")) {
			d=new EdgeDriver();
		}else if(browser.equals("Firefox")) {
			d=new FirefoxDriver();
		}else {
			d=new ChromeDriver();
		}
		
		wb.maximize(d);
		wb.timeout(d);
		
		d.get(url);
		
		contactPage p=new contactPage();
		PageFactory.initElements(d, p);
		p.getNametf().sendKeys(user);
		p.getPasstf().sendKeys(pass);
		p.getLogintf().click();
		
		String nam = ex.getDataFromExcel("Sheet1", 7, 1);
		String firstname = ex.getDataFromExcel("Sheet1", 3, 1);
		String lastName = ex.getDataFromExcel("Sheet1", 8, 1);
		String phone = ex.getDataFromExcel("Sheet1", 5, 1);
		String mobil=ex.getDataFromExcel("Sheet1", 6, 1);
		String lead=ex.getDataFromExcel("Sheet1", 12, 1);
		String titl=ex.getDataFromExcel("Sheet1", 9, 1);
		String dept=ex.getDataFromExcel("Sheet1", 10, 1);
		String mail=ex.getDataFromExcel("Sheet1", 11, 1);
		String group=ex.getDataFromExcel("Sheet1", 13,1);
		String orgname=ex.getDataFromExcel("Sheet1", 14, 1);
		String childurl=ex.getDataFromExcel("Sheet1", 15, 1);
		String parenturl=ex.getDataFromExcel("Sheet1", 16, 1);
		int random = wb.getRandonNumber();
		
		
		p.getContactlink().click();
		p.getPlusbtn().click();
		wb.handledropdown(p.getMrdrop(),nam);
		p.getFirstNametf().sendKeys(firstname+random);
		p.getLastNametf().sendKeys(lastName);
		p.getPhonetf().sendKeys(phone);
		p.getPlusorgbtn().click();
		
		//to transfer the control from child to parent
		wb.switchtowindow(d, childurl);
		p.getSearchtext().sendKeys(orgname);
		p.getSearchbtn().click();
		p.getLink().click();
		
		
		//to transfer the control from parent to child, 
		wb.switchtowindows(d, parenturl);
		
		
		d.findElement(By.name("mobile")).sendKeys(mobil);
  		p.getMobiletf().sendKeys(mobil);
  		wb.handledropdown(p.getLeaddrop(), lead);
  		p.getTitletf().sendKeys(titl);
  		p.getDepartmenttf().sendKeys(dept);
  		p.getEmailtf().sendKeys(mail);		
       	p.getGroupbtn().click();
       	wb.handledropdown(p.getGroupdrop(), group);
  		wb.takescreenshot(d);
  		wb.javascritp(d);
  		
  		
  		WebElement files = d.findElement(By.xpath("//input[@name='imagename']"));
  		wb.Action(d, files);
  		wb.singleclick(d, files);
  		Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\auto\\img.exe");	
  		Thread.sleep(6000);
     		p.getSavebtn().click();
  		wb.Action(d, p.getSignoutbtn());
  		p.getLogoutbtn().click();
		
	}
}
}

