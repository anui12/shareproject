package utils;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import data.organizationexcel;
import data.organizationfile;
import data.organizationwebdriver;

public class organizationDataDriverproperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		final WebDriver d;

		organizationfile f=new organizationfile();
		organizationwebdriver web=new organizationwebdriver();
		organizationexcel ex=new organizationexcel();
		
		String browser=f.getDataFromFile("Browser");
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
		web.maximize(d);
		web.wait(d);
		d.get(url);
		d.findElement(By.name("user_name")).sendKeys(user);
		d.findElement(By.name("user_password")).sendKeys(pass);
		d.findElement(By.id("submitButton")).click();
		
		 String url1 = ex.getDataFromExcel("Sheet1", 1, 0);
		String industry=ex.getDataFromExcel("Sheet1", 4, 1);
		String rat=ex.getDataFromExcel("Sheet1", 5, 1);
		String group=ex.getDataFromExcel("Sheet1", 6, 1);
		
		d.findElement(By.name("accountname")).sendKeys(url1);
		
		WebElement dropdown = d.findElement(By.name("industry"));
		web.Handledropdown(dropdown, industry);
		
		WebElement rating = d.findElement(By.name("rating"));
		web.Handledropdown(rating, rat);  // dropdown by storing value in excel  
//		web.Handledropdown(2, rating);  // dropdown by index 
		
		 d.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		 WebElement assign=d.findElement(By.name("assigned_group_id"));
		 web.Handledropdown(assign, group);
		 
		d.findElement(By.xpath("//input[@value='T']")).click();
		d.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
		Thread.sleep(2000);
		WebElement c = d.findElement(By.xpath("(//td[@class='small'])[2]"));
		
		web.Action(d, c);
		d.findElement(By.xpath("//a[text()='Sign Out']")).click();
		

	}
}
