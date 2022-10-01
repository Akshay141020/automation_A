package automation_First;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.amazon.in/");
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d=new File("C:/Users/SOMESH/OneDrive/Desktop/a.bmp");
		FileUtils.copyFile(s, d);
		
	}

}
