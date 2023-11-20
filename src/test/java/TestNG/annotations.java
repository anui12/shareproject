package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {

	@Test
	public void Home() {
		System.out.println("Hello 1");
	}
	@Test
	public void Home2() {
		System.out.println("Hello 2");
	}
	@BeforeMethod
	public void before() {
		System.out.println("Before method 3");
	}
	@AfterMethod
	public void after() {
		System.out.println("After method 4");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class 5");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After class 6");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("before test 7");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("after test 8");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite 9");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("after suite 10");
	}
}