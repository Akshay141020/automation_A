package automation_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBOx_ismultiple {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/automation soft/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
     Thread.sleep(5000);
	driver.manage().window().maximize();

	driver.get("https://www.amazon.in/");
	WebElement we=driver.findElement(By.id("searchDropdownBox"));

	Select s= new Select(we);
   
	s.selectByIndex(1);
     Thread.sleep(1000);
    s.selectByIndex(2);
    Thread.sleep(1000);
    s.selectByIndex(3);
    
    Boolean bs=s.isMultiple();
    System.out.println(bs);
}
}