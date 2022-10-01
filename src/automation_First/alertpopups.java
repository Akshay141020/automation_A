package automation_First;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/alerts");
/*
driver.findElement(By.id("alertButton")).click();
driver.switchTo().alert().accept();
Thread.sleep(2000);
driver.findElement(By.id("timerAlertButton")).click();
Thread.sleep(6000);
driver.switchTo().alert().accept();

driver.findElement(By.id("confirmButton")).click();
driver.switchTo().alert().dismiss();
Thread.sleep(6000);*/
driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/button")).click();

//Thread.sleep(2000);
//driver.findElement(By.id("promtButton")).sendKeys("akshay");
//driver.switchTo().alert().accept();



	}

}
