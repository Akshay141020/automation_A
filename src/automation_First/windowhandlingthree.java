package automation_First;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlingthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.anhtester.com/window-popup-modal-demo.html");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a")).click();
		
		Set<String> ss=driver.getWindowHandles();
		Iterator<String> is = ss.iterator();
		String f1st=is.next();
		String f2st=is.next();
		driver.switchTo().window(f2st);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div/div/div/div/div/a/span/span/span")).click();
     	driver.close();
	}

}
