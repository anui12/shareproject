package onlineClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public void home() {
		System.out.println("Home 1");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite 1");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite 1");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class 1");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After class 1");
	}
}
