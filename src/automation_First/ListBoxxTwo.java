package automation_First;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxxTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:/automation soft/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.anhtester.com/jquery-dual-list-box-demo.html");
		WebElement wd=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div/div[1]/select"));
		
		Select s=new Select(wd);
	List<WebElement> l=s.getOptions();
			
		for(int i=1;i<l.size();i++) 
		{
		Thread.sleep(2000);
			String s1=l.get(i).getText();
			System.out.println(s1);
		}
		//String str=wd.getText();
	//System.out.println(str);
		}

}