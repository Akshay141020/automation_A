package automation_First;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_radio_for_lopp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2Fref%3Dnav_logo&ref_=topnav_lang");
		Thread.sleep(3000);
		List<WebElement>a=driver.findElements(By.xpath("//span[@id='icp-language-translation-hint']"));
		Thread.sleep(3000);
	for(int i=0;i<a.size();i++) 
	{
		a.get(i).click();
	}
	}

}
