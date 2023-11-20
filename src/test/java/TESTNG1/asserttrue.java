package TESTNG1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class asserttrue {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username = d.findElement(By.id("username"));
//		Assert.assertTrue(username.isDisplayed()); // it print hiiii
		Assert.assertTrue(username.isEnabled());   // it print hiiii
//		Assert.assertTrue(username.isSelected()); // it gives error
		System.out.println("Hiiiiiiii");
	}
}
