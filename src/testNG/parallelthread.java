package testNG;

import org.testng.annotations.Test;

public class parallelthread {
  @Test
  public void f() {
	  long a=Thread.currentThread().getId();
	  System.out.println("this is 1st method::" +a);
  }
  @Test
  public void h() 
  {
	  long b=Thread.currentThread().getId();
	  System.out.println("this is 2nd method::" +b);
  }
@Test
public void s() 
{
long c=Thread.currentThread().getId();
System.out.println("this is 3nd method::" +c);
}
@Test
public void sr()
{
	long d=Thread.currentThread().getId();
	  System.out.println("this is 4nd method::" +d);
}
}

