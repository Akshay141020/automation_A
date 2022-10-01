package testNG;

import org.testng.annotations.Test;

public class parallelthread3 {
  @Test
  public void f() {
	  long g=Thread.currentThread().getId();
	  System.out.println("this is 3 class  ::"+g);
  }
  @Test
  public void q() 
  {
	  long q=Thread.currentThread().getId();
	  System.out.println("this is 3 class  ::"+q);
  }
}
