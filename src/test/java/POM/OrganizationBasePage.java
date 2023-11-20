package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import data.organizationexcel;
import data.organizationfile;
import data.organizationwebdriver;

public class OrganizationBasePage {

	@Test
	public void Organization() throws IOException, InterruptedException {
		final WebDriver d;
		
		organizationfile f=new organizationfile();
		organizationexcel ex=new organizationexcel();
		organizationwebdriver wb=new organizationwebdriver();
		
		
		String browser = f.getDataFromFile("Browser");
		String url=f.getDataFromFile("URL");
		String user=f.getDataFromFile("USERNAME");
		String pass=f.getDataFromFile("PASSWORD");
		if(browser.equals("Chrome")) {
			d=new ChromeDriver();
		}else if(browser.equals("Edge")) {
			d=new EdgeDriver();
		}else {
			d=new FirefoxDriver();
		}
		wb.maximize(d);
		wb.wait(d);
		d.get(url);
		
		OrganizationPage p=new OrganizationPage();
		PageFactory.initElements(d, p);
		p.getUsername().sendKeys(user);
		p.getPassword().sendKeys(pass);
		p.getLoginbtn().click();
		
		p.getOrglink().click();
		p.getPlusbtn().click();
		
		String orgname = ex.getDataFromExcel("Sheet1", 3, 1);
		String phone=ex.getDataFromExcel("Sheet1", 7, 1);
		String industry=ex.getDataFromExcel("Sheet1", 4, 1);
		String rating=ex.getDataFromExcel("Sheet1", 5, 1);
		String type=ex.getDataFromExcel("Sheet1", 8, 1);
		String group=ex.getDataFromExcel("Sheet1", 6, 1);
		String email=ex.getDataFromExcel("Sheet1", 9, 1);
		String random=wb.randomemail();
		
		String randomname = wb.randomname();
		p.getOrgname().sendKeys(randomname);
		p.getPhone().sendKeys(phone);
		p.getEmail().sendKeys(random+email);
		p.getIndustry().sendKeys(industry);
		p.getRating().sendKeys(rating);
		p.getType().sendKeys(type);
		p.getGroup().click();
		p.getAssignto().sendKeys(group);
		wb.javascript(d);
		p.getSave().click();
		Thread.sleep(4000);
		wb.Action(d, p.getLogout());
		p.getSignoutbtn().click();
	
	}
}
