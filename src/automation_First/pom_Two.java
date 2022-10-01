package automation_First;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_Two {
@FindBy(xpath="//input[@type='text']")
WebElement Email_Add;

@FindBy(xpath="//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi'] ")
WebElement Pass_word;

@FindBy(xpath="//button[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']")
WebElement Log_button;

pom_Two(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
public void Email() {
	Email_Add.sendKeys("ghadgeakshay77@gmail.com");
}
public void Pass_word() {
	Email_Add.sendKeys("aks777455");
}
public void Log_button() {
	Email_Add.click();
}
}