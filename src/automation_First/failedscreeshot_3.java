package automation_First;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class failedscreeshot_3 extends failedscreenshot_1 {
public static String screeshot(String screen) throws IOException 
{
	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File d=new File("C:/Users/SOMESH/OneDrive/Desktop/New Bitmap image.bmp");
	FileUtils.copyFile(s, d);
	return screen;
	}
}
