package data;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class productwebdriver {

	public void maximize(WebDriver d) {
		d.manage().window().maximize();
	}
	public void minimize(WebDriver d) {
		d.manage().window().minimize();
	}
	public void time(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void javascript(WebDriver d) {
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,800)");
	}
	public void action(WebDriver d, WebElement element ) {
		Actions a=new Actions(d);
		a.moveToElement(element);
		a.perform();
	}
	public void singleClick(WebDriver d,WebElement element) {
		Actions a=new Actions(d);
		a.click(element);
		a.perform();
	}
}
