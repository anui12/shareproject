package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class skipped {

	@Test
	public void Login() {
		Assert.assertEquals("Pune", "Deccan");
		System.out.println("Login successfully");
	}
	
	@Test(dependsOnMethods="Login")
	public void Home() {
		System.out.println("Home page ");
	}
	
	@Test(dependsOnMethods="Login")// for skipped first fail one and passed in another method by(dependsOnMethods)
	public void Logout() {
		System.out.println("Logout successfully");
	}
}
