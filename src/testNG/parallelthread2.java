package testNG;

import org.testng.annotations.Test;

public class parallelthread2 {
  @Test
  public void f() {
	  long y=Thread.currentThread().getId();
	  System.out.println("this is 2 class ::"+y);
  }
  @Test
  public void x() 
  {
	  long x=Thread.currentThread().getId();
	  System.out.println("this is 2 class  ::"+x);
			  
  }
}
