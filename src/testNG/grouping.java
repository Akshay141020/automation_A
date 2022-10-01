package testNG;

import org.testng.annotations.Test;

public class grouping {
  @Test(groups={"sanity","Regression"},priority=2)
  public void a() {
	  System.out.println("this is log in page");
  }
  @Test(groups= {"regression"})
  public void b()  {
	  System.out.println("this is F.name tab");
  }
  @Test(groups= {"sanity"})
  public void c() {
	  System.out.println("this is last name tab");
  }
  @Test
  public void d() {
	  System.out.println("this is password tab");
  }
  @Test (priority=1)
  public void e() {
	  System.out.println("this is click tab");
  }
}
