package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Takecourse 
{
@FindBy(xpath="//div[@class=\"play-icon\"]")
private WebElement playbtn;

@FindBy(id="pause-icon-title")
private WebElement pausebtn;

@FindBy(xpath="//a[text()=\" TAKE THIS COURSE \"]")
private WebElement takethiscoursebtn;

public Takecourse(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void playbutton()
{
	playbtn.click();
}
public void pausebutton()
{
	pausebtn.click();
}
public void takecoursebutton()
{
	takethiscoursebtn.click();
}
}
