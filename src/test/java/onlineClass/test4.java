package onlineClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test4 {

	public WebDriver driver;
	@Test
	@Parameters("aniket")
	public void amazon(String aniket) {
		if(aniket.equalsIgnoreCase("Chrome")) {
			driver =new ChromeDriver();
		}else {
			driver=new FirefoxDriver();
		}
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
	}
}