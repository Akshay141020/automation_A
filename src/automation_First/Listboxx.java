package automation_First;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxx {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/automation soft/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("akshay");
		driver.findElement(By.name("lastname")).sendKeys("ghadge");
		driver.findElement(By.name("reg_email__")).sendKeys("9730833310");
		driver.findElement(By.name("reg_passwd__")).sendKeys("aks777455");
		
		
		WebElement webday=driver.findElement(By.name("birthday_day"));
		WebElement webmonth=driver.findElement(By.name("birthday_month"));
		WebElement webyear=driver.findElement(By.name("birthday_year"));
		
		Select sday=new Select(webday);
		Select smonth=new Select(webmonth);	
		Select syear=new Select(webyear);
		
		    sday.selectByIndex(13);
			smonth.selectByVisibleText("Sep");		
			syear.selectByValue("1989"); 
			
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
			driver.findElement(By.name("websubmit")).click();	
		
	}
}