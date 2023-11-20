package data;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class organizationwebdriver {

	public void maximize(WebDriver d) {
	d.manage().window().maximize();
	}
	
	public void minimize(WebDriver d) {
		d.manage().window().minimize();
	}
	public void wait(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void Handledropdown(WebElement element,String indus) {
		Select s=new Select(element);
		s.selectByVisibleText(indus);
	}
	public void Handledropdown(int number, WebElement element) {
		Select s=new Select(element);
		s.selectByIndex(number);
	}
	public void Action(WebDriver d,WebElement element) {
		Actions a=new Actions(d);
		a.moveToElement(element).perform();
	}
	public String randomname() {
		Random r=new Random();
		String random=r.toString();
		return random;
	}
	public String randomemail() {
		Random r=new Random();
		String random=r.toString();
		return random;
	}
	public void javascript(WebDriver d) {
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,800)");
	}
	public void singleclick(WebDriver d) {
		Actions a=new Actions(d);
		a.click().perform();
	}
}
