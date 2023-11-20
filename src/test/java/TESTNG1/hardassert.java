package TESTNG1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class hardassert {

	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.vtiger.com/vtigercrm/index.php");
		String actualtitle=d.getTitle();
		System.out.println("actualtitle");
//		String expectedtitle1="vtiger";  // it execute println line bcz actual title is same as expected 
//		
//		Assert.assertEquals(actualtitle, expectedtitle1);
//		System.out.println("hard assert");
		
		
		String expectedtitle="vtigerpune";   // it does not print hard assert bcz vtigerpune is not 
		//actual title
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("hard assert");
	}
}
