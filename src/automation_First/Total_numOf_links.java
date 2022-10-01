package automation_First;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_numOf_links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.amazon.in/");
		
		List<WebElement>s=driver.findElements(By.tagName("a"));//all links have'a'as tagname means anchor tag
	    Thread.sleep(3000);
		System.out.println(s.size());
		for(int i=0;i<s.size();i++) 
	{
		Thread.sleep(3000);
		String st=s.get(i).getText();
		System.out.println(s.get(i).getAttribute("href"));
	System.out.println(st);
	}
	}

}
