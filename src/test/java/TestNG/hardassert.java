package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {

	@Test
	public void vtigercrm1() {
	 
	 
		WebDriver d=new ChromeDriver();
		d.get("http://localhost:8888/index.php?action=Login&module=Users");
		String actualtitle = d.getTitle();
		System.out.println(actualtitle);
		String expectedtitle = "vtiger CRM 5 - Commercial Open Source CRMPune";
	
		//it is for hardassertion  
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("Hello");
	}
}
