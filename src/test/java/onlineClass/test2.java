package onlineClass;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test2 {

	@Test
	public void home() {
		System.out.println("Home 2");
	}
	@BeforeSuite
	public void bm() {
		System.out.println("bs 1");
	}
	@AfterSuite
	public void af() {
		System.out.println("As 1");
	}
}
