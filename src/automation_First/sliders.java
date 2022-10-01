package automation_First;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sliders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/automation soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.amazon.in/");
		Thread.sleep(8000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		//j.executeScript("window.scrollBy(0,1000)", "");
   j.executeScript("window.scrollTo(0,document.body.scrollHeight)");//This method is used to scroll window to END POINT.
	}

}
