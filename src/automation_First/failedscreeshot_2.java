package automation_First;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class failedscreeshot_2 extends failedscreenshot_1 {

	@Test
	public void screenshot() 
		{
		System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();
		String expected_title="https://www.facebook.com/";
		Assert.assertEquals(title, expected_title);
		System.out.println(title);
		driver.close();
		}
}
