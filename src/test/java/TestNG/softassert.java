package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
//with the help of if else we can't fail the programm then we use assert/assertion/checkbox
//	@Test
//	public void vtigercrm() {
//		WebDriver d=new ChromeDriver();
//		d.get("http://localhost:8888/index.php?action=Login&module=Users");
//		String actualtitle = d.getTitle();
//		System.out.println(actualtitle);
//		String expectedtitle = "vtiger CRM 5 - Commercial Open Source CRMPune";
//		if(actualtitle.contains(expectedtitle)) {
//			System.out.println("title is same");
//		}else {
//			System.out.println("title is not same");
//		}
//	}
	
	//if the condition is not satisfied condition is skipped
 @Test
	public void vtigercrm() {
	 
	 SoftAssert sa=new SoftAssert();
	 
		WebDriver d=new ChromeDriver();
		d.get("http://localhost:8888/index.php?action=Login&module=Users");
		String actualtitle = d.getTitle();
		System.out.println(actualtitle);
		String expectedtitle = "vtiger CRM 5 - Commercial Open Source CRM";
	
		
		//it is for softassertion and it is only one method for fail testscript
		sa.assertEquals(actualtitle, expectedtitle);
		System.out.println("GoodMorning");
		sa.assertAll();
	}
}
