package ParellelExecution;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class groups {

		@Test
		public void facebook() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		}
		@Test(groups="Shopping")
		public void flipkart() {
			WebDriver d=new ChromeDriver();
			d.get("https://www.flipkart.com/");
		}
		@Test(groups="Shopping")
		public void myntra() {
			WebDriver d=new ChromeDriver();
			d.get("https://www.myntra.com/shop/men");
		}
		@Test
		public void instagram() {
			WebDriver d=new ChromeDriver();
			d.get("https://www.instagram.com/direct/inbox/");
		}
	}


