package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demopage
{
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(xpath="//a[text()=\"Selenium Training\"]")
	private WebElement seleniumcourse;
	
	@FindBy(name="addresstype")
	private WebElement testingdd;
	
	public demopage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCoursebtn() {
		return coursebtn;
	}
	

	public WebElement getTestingdd() {
		return testingdd;
	}

	public void setCoursebtn(WebElement coursebtn) {
		this.coursebtn = coursebtn;
	}

	public void course()
	{
		seleniumcourse.click();
	}
}
