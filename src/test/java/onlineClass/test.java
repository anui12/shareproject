package onlineClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test {

	@Test
	public void home() {
		System.out.println("home");
	}
    @BeforeSuite
   	public void BS() {
	System.out.println("BS");
    }

    @AfterSuite
    public void AS() {
	System.out.println("AS");
    }
    
	@AfterClass
	public void Close() {
		System.out.println("Ac");
	}
	
	@BeforeClass
	public void Open() {
		System.out.println("BC");
	}
}
