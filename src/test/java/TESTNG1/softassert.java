package TESTNG1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {

	@Test
	public void softassert(){
		
		SoftAssert sa=new SoftAssert();
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://demo.vtiger.com/vtigercrm/index.php");
		String actualtitle = d.getTitle();
		System.out.println(actualtitle);
//		String expectedtitle="vtigerpune"; 			//actual and expected title is not same
		//hence softassert is not print
//		sa.assertEquals(actualtitle, expectedtitle);
//		sa.assertAll();
//		System.out.println("Soft assert");
		
		String expectedtitle="vtiger"; 			// actual and expected title is same 
		//hence it is printed soft assert
		sa.assertEquals(actualtitle, expectedtitle);
		sa.assertAll();
		System.out.println("Soft assert");
	}
}
