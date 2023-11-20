package data;

import java.time.Duration;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Opportunitieswebdriver {

	public void maximize(WebDriver d) {
		d.manage().window().maximize();
	}
	public void minimize(WebDriver d) {
		d.manage().window().minimize();;
	}
	public void times(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public String randomname() {
		Random r=new Random();
		String random=r.toString();
		return random;
	}
	public void switchtochild(WebDriver d,String childurl) {
		Set<String> allid = d.getWindowHandles();
		for(String b:allid) {
			String c = d.switchTo().window(b).getCurrentUrl();
			System.out.println(c);
			String childurls=childurl;
			if(c.contains(childurls)) {
				break;
			}
		}
	}
	public void switchtoparent(WebDriver d,String parent) {
		Set<String> a = d.getWindowHandles();
		for(String b:a) {
			String currenturl= d.switchTo().window(b).getCurrentUrl();
			System.out.println(currenturl);
		String  parenturl =parent;
			if(currenturl.contains(parenturl)) {
				break;
			}
		}
	}
	public void action(WebDriver d,WebElement element) {
		Actions a=new Actions(d);
		a.moveToElement(element);
		a.perform();
	}
}