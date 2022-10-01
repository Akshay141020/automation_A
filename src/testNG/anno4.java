package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class anno4 {
	@Test
	public void w() 
	{
		System.out.println("this is Test W method in anno4 class");
	}
	@BeforeMethod
	  public void e() {
		  System.out.println("this is before method E");
	  }
	  
	  @AfterMethod
	  public void f() 
	  {
		  System.out.println("this is after method F");
	  }
	  @BeforeClass
	  public void g() 
	  {
		  System.out.println("this is before class method G");
	  }
	  @AfterClass
	  public void h() 
	  {
		  System.out.println("this is after class method H");
	  }

}
