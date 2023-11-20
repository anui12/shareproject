package utils;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import data.contactexcel;
import data.contactfile;
import data.contactwebdriver;

public class contactdatadriven {

	public static void main(String[] args) throws IOException {
		
		final WebDriver d;
		
		contactfile f=new contactfile();
		contactwebdriver web=new contactwebdriver();
		contactexcel ex=new contactexcel();
		
		String browser=f.getDataFromFile("Browser");
		String url=f.getDataFromFile("URL");
		String user=f.getDataFromFile("UserName");
		String pass=f.getDataFromFile("Password");
		if(browser.equals("Chrome")) {
			d=new ChromeDriver();
		}else if(browser.equals("Edge")) {
			d=new EdgeDriver();
		}else {
			d=new FirefoxDriver();
		}
		web.maximize(d);
		web.timeout(d);
		
		d.get(url);
		d.findElement(By.name("user_name")).sendKeys(user);
		d.findElement(By.name("user_password")).sendKeys(pass);
		d.findElement(By.id("submitButton")).click();
		
		String nam = ex.getDataFromExcel("Sheet1", 7, 1);
		String name = ex.getDataFromExcel("Sheet1", 3, 1);
		String lastName = ex.getDataFromExcel("Sheet1", 8, 1);
		String office = ex.getDataFromExcel("Sheet1", 5, 1);
		String mobile=ex.getDataFromExcel("Sheet1", 6, 1);
		String title=ex.getDataFromExcel("Sheet1", 9, 1);
		String department=ex.getDataFromExcel("Sheet1", 10, 1);
		String email=ex.getDataFromExcel("Sheet1", 11, 1);
		d.findElement(By.xpath("//a[text()='Contacts']")).click();
		d.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		
		WebElement na = d.findElement(By.name("salutationtype"));
		web.handledropdown(na, nam);
		d.findElement(By.name("firstname")).sendKeys(name);
		d.findElement(By.name("lastname")).sendKeys(lastName);
		
		d.findElement(By.name("phone")).sendKeys(office);
		d.findElement(By.id("mobile")).sendKeys(mobile);
		
		WebElement dropdown = d.findElement(By.name("leadsource"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Self Generated");
		
		d.findElement(By.id("title")).sendKeys(title);
		d.findElement(By.id("department")).sendKeys(department);
		d.findElement(By.id("email")).sendKeys(email);
		
		d.findElement(By.id("jscal_trigger_birthday")).click();
		d.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		WebElement drop = d.findElement(By.name("assigned_group_id"));
		Select s1=new Select(drop);
		s1.selectByVisibleText("Support Group");
		d.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		WebElement signout = d.findElement(By.xpath("(//td[@class='small'])[2]"));
		web.Action(d, signout);
		d.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
}
