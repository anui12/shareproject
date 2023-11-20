package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class asserttrue {

	@Test
	public void vtiger() {
		WebDriver d=new ChromeDriver();
		d.get("http://localhost:8888/index.php?action=Login&module=Users");
		WebElement loginbtn = d.findElement(By.id("submitButton"));
		Assert.assertTrue(loginbtn.isEnabled()); // it gives pass result
		//Assert.assertTrue(loginbtn.isSelected()); // it gives fail result
//		Assert.assertTrue(loginbtn.isDisplayed());  // it gives the pass report 
		//and print the hello or execute next linre
		System.out.println("Hello");
		
	}
}
