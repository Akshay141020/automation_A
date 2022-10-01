package automation_First;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlingtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("messageWindowButton")).click();
		
		Set<String> ss=driver.getWindowHandles();
		Iterator<String> is = ss.iterator();
		String f1st=is.next();
		String f2st=is.next();
		
		driver.switchTo().window(f2st);
		WebElement w=driver.findElement(By.xpath("/html/body"));
		
		String str=w.getText();
	    System.out.println(str);
	     driver.close();
	}

}
