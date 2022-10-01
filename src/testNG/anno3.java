package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class anno3 {
  @BeforeTest
  public void i() {
	  System.out.println("this is before test method I");
  }
  @AfterTest
  public void j() 
  {
	  System.out.println("this after test  method J");
  }
  @BeforeSuite
  public void k() 
  {
	  System.out.println("this is before suite method K");
	  
  }
  @AfterSuite
  public void l() 
  {
	  System.out.println("this is after suite method L ");
  }
}
