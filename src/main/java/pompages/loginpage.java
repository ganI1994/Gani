package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage 
{
@FindBy(partialLinkText=" GEARS ")
private WebElement gearbtn;

@FindBy(xpath="(//a[@class=\"ignorelink\"])[16]")
private WebElement demoskillrarybtn;

@FindBy(name="q")
private WebElement searchbtn;

@FindBy(xpath="//input[@value=\"go\"]")
private WebElement coursebtn;

public loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	public void gearbutton()
	{
		gearbtn.click();
	}
	public void skillrarybutton()
	{
		demoskillrarybtn.click();
	}
	public void searchbutton()
	{
		searchbtn.click();
	}
	public void searchcourse()
	{
		//coursebtn.sendKeys(pdata.getData("coursename"));
	}
}
