package TESTNG1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class skipped {

	@Test
	public void home1() {
		Assert.assertEquals("pune", "punet");
		System.out.println("Login ");
	}
	
	@Test(dependsOnMethods="home1")
	public void fb() {
		System.out.println("fb");
	}
	@Test(dependsOnMethods="home1")
	public void hii(){
		System.out.println("Hii");
	}
}
