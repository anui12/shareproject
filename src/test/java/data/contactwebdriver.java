package data;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class contactwebdriver {

	public void maximize(WebDriver d) {
		d.manage().window().maximize();
	}
	public void minimize(WebDriver d) {
		d.manage().window().minimize();;
	}
	public void timeout(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void handledropdown(WebElement element,int number) {
		Select s=new Select(element);
		s.selectByIndex(number);;
	}
	public void handledropdown(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	public void Action(WebDriver d, WebElement element) {
		Actions a=new Actions(d);
		a.moveToElement(element).perform();
		a.click();
	}
	public void takescreenshot(WebDriver d) throws IOException {
		LocalDateTime dt=LocalDateTime.now();
		String timedate = dt.toString().replace(':','-');
		TakesScreenshot ts=(TakesScreenshot)d;
		File n = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./pics/vtiger"+timedate+".png");
		FileUtils.copyFile(n, destination);
	}
	public void javascritp(WebDriver d) {
  		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,800)");
	}
	
	public void singleclick(WebDriver d, WebElement element) {
		Actions a=new Actions(d);
		a.click(element);
		a.perform();
	}
	public void switchtowindow(WebDriver d,String childurl) {
		Set<String> allid = d.getWindowHandles();
		System.out.println(allid);
		for(String b:allid) {
			String c = d.switchTo().window(b).getCurrentUrl();
			System.out.println(c);
			String childurls=childurl;
			if(c.contains(childurls)) {
				break;
			}
		}
	}
	public void switchtowindows(WebDriver d,String parenturl) {
		Set<String> allid = d.getWindowHandles();
		System.out.println(allid);
		for(String b:allid) {
			String c = d.switchTo().window(b).getCurrentUrl();
			System.out.println(c);
			String childurls=parenturl;
			if(c.contains(childurls)) {
				break;
			}
		}
	}
	public int getRandonNumber() {
		Random r=new Random();
		int data = r.nextInt();
		return data;
	}
}
