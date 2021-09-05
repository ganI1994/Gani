package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seleniumpage 
{
@FindBy(xpath="//a[@title=\"Core Java For Selenium Training\"]")
private WebElement seleniumbtn;

public seleniumpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void seleniumcoursebutton()
{
	seleniumbtn.click();
}
}
