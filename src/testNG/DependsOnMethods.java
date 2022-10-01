package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
  @Test
  public void a() {
	  System.out.println("this is A method");
	  
  }
  @Test
  public void b() 
  {
	  System.out.println("this is B method");
  }
@Test(dependsOnMethods= {"d"},alwaysRun=true)
public void c()
{System.out.println("this is C method ");
	}
@Test
public void d() 
{
Assert.assertEquals("aks", "pall");	//here C method is depend on D method which is failing because assert values are  not equal but
}                                   //that will result in C method failing because it will not be executed it will be skipped        
}                                    //bcoz method which is C depends on is failing.
         //if we give alwaysRun run method to depending method it will be EXECUTED.....