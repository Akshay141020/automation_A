package automation_First;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/automation soft/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		// String title = driver.findElement(By.("")).getText();
		
		String title = driver.getTitle();
		String Actualtitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		System.out.println(driver.getTitle());
		driver.close();
		if (title.equals(Actualtitle))

		{
			System.out.println("test case is passed ");
		} else {
			System.out.println("test case failed");
		}

	}
}