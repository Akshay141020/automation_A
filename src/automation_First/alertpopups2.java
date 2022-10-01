package automation_First;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopups2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.anhtester.com/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/button")).click();		
		
	 Alert a=driver.switchTo().alert();
	 Thread.sleep(3000);
	 System.out.println(a.getText());
	 a.sendKeys("akshay");
	 Thread.sleep(3000);
	  a.accept();
	
	driver.close();
	}

}
