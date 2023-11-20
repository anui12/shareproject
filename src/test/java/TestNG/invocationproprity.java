package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invocationproprity {
	
	
	//invocationCount =countnumber run the appk multiple times
	
	@Test
	public void Facebook1() {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login/");
	}
	
	@Test (invocationCount=2)
	public void zomato1() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.zomato.com/india");
	}
	
	@Test
	public void instagram1() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.instagram.com/");
	}
	
	
	
	@Test(priority=2,invocationCount=2)
	public void Facebook2() {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login/");
	}
	
	@Test (priority=3)
	public void zomato2() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.zomato.com/india");
	}
	
	@Test(priority=1)
	public void instagram2() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.instagram.com/");
	}
}
