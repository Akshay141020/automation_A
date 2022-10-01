package automation_First;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement m=driver.findElement(By.linkText("Mobiles"));
		Actions a=new Actions(driver);
		a.moveToElement(m).build().perform();
		
		WebElement b=driver.findElement(By.linkText("Books"));
		a.moveToElement(b).build().perform();
		a.click(b).build().perform();

		WebElement advSerach=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[6]/div/a[2]/span"));
		a.moveToElement(advSerach).build().perform();
		a.contextClick(advSerach).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.ARROW_LEFT).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();

	}

}
