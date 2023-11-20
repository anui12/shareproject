package TESTNG1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assertfalse {

	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username = d.findElement(By.id("username"));
		//Assert.assertFalse(username.isDisplayed());  // it gives error 
		//Assert.assertFalse(username.isEnabled());  // it gives error 
		Assert.assertFalse(username.isSelected());  // it print hii
		System.out.println("Hiiiiiiiiiii");
	}
}
