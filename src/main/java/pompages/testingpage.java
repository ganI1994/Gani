package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testingpage 
{
@FindBy(xpath="(//i[@class=\"fa fa-facebook\"])[2]")
private WebElement facebookbtn;

public testingpage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}
public void facebooklink()
{
	facebookbtn.click();
}
}
