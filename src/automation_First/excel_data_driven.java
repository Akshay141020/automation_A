package automation_First;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel_data_driven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		FileInputStream f=new FileInputStream("C:/Users/SOMESH/OneDrive/Desktop/fb.xlsx");
	Sheet ss=WorkbookFactory.create(f).getSheet("Sheet1");
	String mail=ss.getRow(0).getCell(0).getStringCellValue();
	long pass=(long) ss.getRow(1).getCell(0).getNumericCellValue();
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(mail);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(""+pass);
	driver.findElement(By.xpath("//button[@value='1']")).click();
	
	}

}
