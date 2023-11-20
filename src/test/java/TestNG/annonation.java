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

public class annonation {

	// 1 annonation
	
	@Test
	public void Home() {
		System.out.println("Home 1");
	}
	
	@Test
	public void Home1() {
		System.out.println("Home2");
	}
	
	@BeforeMethod  // it  execute how much method you have 
	public void Before() {
		System.out.println("before method 3");
	}
	@AfterMethod
	public void After(){
		System.out.println("After method 4");
	}
	@BeforeClass // only once execute for one class 
	public void beforeclass() {
		System.out.println("before class5");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class6");
	}
	
	@BeforeTest // only one execute before the class 
	public void beforetest() {
		System.out.println("before test 7");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("after test 8");
	}
	
	@BeforeSuite // only once execute before the test 
	public void beforesuit() {
		System.out.println("before suite 9");
	}
	
	@AfterSuite
	public void aftersuit() {
		System.out.println("after suite 10");
	}
}
