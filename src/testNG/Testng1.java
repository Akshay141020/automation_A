package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng1 {
  @Test(priority =4)
  public void a() {
	  System.out.println(" i am in a method");
  }
  @Test
  public void b()
  {
	  System.out.println(" i am in b method");
  }
  @Test
  public void c()
  {
	  System.out.println("i am in c method");
  }
  @Test
  public void d() 
  {
	  System.out.println("i am in d method");
 // Assert.assertEquals("abc", "abc");
  }
}
