package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertfalse {

		@Test
		public void vtiger() {
			WebDriver d=new ChromeDriver();
			d.get("http://localhost:8888/index.php?action=Login&module=Users");
			WebElement loginbtn = d.findElement(By.id("submitButton"));
			
//			Assert.assertFalse(loginbtn.isSelected());  //it gives pass result and also passes testscritp
//			Assert.assertFalse(loginbtn.isDisplayed());
			Assert.assertFalse(loginbtn.isEnabled());
			System.out.println("Hello");
		}
}
