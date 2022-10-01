package automation_First;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Change_postion {
public static void main(String [] args) 
{
	System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
driver.manage().window().maximize();
driver.get("https://www.amazon.in/ref=nav_logo");
Point p=new Point(100,110);
driver.manage().window().setPosition(p);
Dimension d=new Dimension(224,333);
driver.manage().window().setSize(d);

driver.manage().window().maximize();

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
driver.findElement(By.id("nav-search-submit-button")).click();
driver.navigate().back();
//XPATH
driver.findElement( By.xpath("//a[@class='nav-a')")).click();


}
}