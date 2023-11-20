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

import data.Opportunitiesexcel;
import data.Opportunitiesfile;
import data.Opportunitieswebdriver;

public class OpportunitiesBasePage {

	@Test
	public void Opportunities() throws EncryptedDocumentException, IOException {
		final WebDriver d;
		Opportunitiesfile f=new Opportunitiesfile();
		Opportunitiesexcel ex=new Opportunitiesexcel();
		Opportunitieswebdriver wb=new Opportunitieswebdriver();
		
		String browser = f.getDataFromfile("Browser");
		String url=f.getDataFromfile("URL");
		String username=f.getDataFromfile("UserName");
		String pass=f.getDataFromfile("Password");
		
		if(browser.equals("Chrome")) {
			d=new ChromeDriver();
		}else if(browser.equals("Firefox")) {
			d=new FirefoxDriver();
		}else {
			d=new EdgeDriver();
		}
		
		wb.maximize(d);
		wb.times(d);
		
		d.get(url);
		OpportunitiesPage p=new OpportunitiesPage();
		PageFactory.initElements(d, p);
		p.getUsername().sendKeys(username);
		p.getPassword().sendKeys(pass);
		p.getLogin().click();
		p.getOpplink().click();
		p.getPlusbtn().click();
		
		String related = ex.getDataFromexcel("Sheet1", 7, 1);
		String opponame=ex.getDataFromexcel("Sheet1", 15, 1);
		String search=ex.getDataFromexcel("Sheet1", 16, 1);
		String childurl=ex.getDataFromexcel("Sheet1", 14, 1);
		String parenturl=ex.getDataFromexcel("Sheet1", 13, 1);
		String type=ex.getDataFromexcel("Sheet1", 8, 1);
		String lead=ex.getDataFromexcel("Sheet1", 9, 1);
		String salesstage=ex.getDataFromexcel("Sheet1", 10, 1);
		String nextstep=ex.getDataFromexcel("Sheet1", 4, 1);
		String description=ex.getDataFromexcel("Sheet1", 6, 1);
		String random = wb.randomname();
		
		p.getOrgName().sendKeys(opponame+random);
		p.getRelatedto().sendKeys(related);
		p.getPlus().click();
		wb.switchtochild(d, childurl);
		p.getSearchtext().sendKeys(search);
		p.getSearchbtn().click();
		p.getFind().click();
		wb.switchtoparent(d, parenturl);
		p.getType().sendKeys(type);
		p.getLead().sendKeys(lead);
		p.getNextstep().sendKeys(nextstep);
		p.getSales().sendKeys(salesstage);
		p.getDescription().sendKeys(description);
		WebElement n = p.getSaveimg();
		wb.action(d, n);
		p.getSignout().click();
	}
}