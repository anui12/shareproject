package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class prority {

	
	//without proprity it execute alphabetically
	@Test(priority=2)
	public void Facebook() {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login/");
	}
	
	@Test (priority=3)
	public void zomato() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.zomato.com/india");
	}
	
	@Test(priority=1)
	public void instagram() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.instagram.com/");
	}
}
