package automation_First;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/automation soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.anhtester.com/basic-checkbox-demo.html");
	
	List <WebElement> all=driver.findElements(By.xpath("//input[@type='checkbox']"));
	int size=all.size();
	System.out.println(size);
	for(int i=0;i<size;i++)
	{
		all.get(i).click();
	}
	}

}
