package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderr {
  public WebDriver driver;
  @BeforeMethod
  public void Weblaunch() 
  {
    System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
  }
	@DataProvider(name="Testdata")
	public Object[][] data() 
	{
		Object data[][] =new Object[1][2];
		data[0][0]="ghadgeakshay77@gmail.com";
		data[0][1]="aks777455";
		return data;
	}
@Test (dataProvider="Testdata")
public void login(String Username,String Password) 
{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Username);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@id='u_0_5_a1']")).click();
}	
	
	
	@Test
  public void f() {
  }
}
