package automation_First;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elemenet_functions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/automation soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement w=driver.findElement(By.linkText("Today's Deals"));
		String a= w.getText();
		System.out.println(a);
		
		WebElement e=driver.findElement(By.linkText("Today's Deals"));
		boolean b=e.isEnabled();
		System.out.println(b);
		
		WebElement t=driver.findElement(By.linkText("Today's Deals"));
		boolean l=t.isEnabled();
		System.out.println(l);
	
		WebElement x=driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute' and @href='/gp/css/order-history?ref_=nav_orders_first']"));
		Boolean bx=x.isDisplayed();
	System.out.println(bx);
	}
}
