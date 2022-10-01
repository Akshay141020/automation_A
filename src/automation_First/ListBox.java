package automation_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement we=driver.findElement(By.id("searchDropdownBox"));

		Select s= new Select(we);
	s.selectByIndex(2);
	String str=driver.findElement(By.id("searchDropdownBox")).getText();
	System.out.println(str);
	//System.out.println(str);
	
	driver.close();}

	}
