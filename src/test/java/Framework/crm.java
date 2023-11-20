package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class crm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get("http://localhost:8888/index.php?action=index&module=Home");
		d.findElement(By.name("user_name")).sendKeys("admin");
		d.findElement(By.name("user_password")).sendKeys("aniket@1432");
		d.findElement(By.id("submitButton")).click();
		d.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		d.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=EditView&return_action=DetailView&parenttab=Marketing']")).click();
		d.findElement(By.name("accountname")).sendKeys("0002");
		d.findElement(By.xpath("//input[@value='T']")).click();
		d.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
		Thread.sleep(1000);
		d.get("http://localhost:8888/index.php?action=index&module=Home");
		d.findElement(By.xpath("//a[text()='Contacts']")).click();
		d.findElement(By.xpath("(//a[@href='index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing'])[1]")).click();
		d.findElement(By.name("lastname")).sendKeys("Ingale");
		d.findElement(By.name("assigntype")).click();
		d.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		 WebElement b = d.findElement(By.xpath("(//td[@class='small'])[2]"));
		Actions a=new Actions(d);
		a.moveToElement(b).perform();
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
	}
}
