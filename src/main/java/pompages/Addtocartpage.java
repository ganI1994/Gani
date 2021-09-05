package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage 
{
@FindBy(id="add")
private WebElement addbtn;

@FindBy(xpath="//button[@ondblclick=\"addtocart()\"]")
private WebElement addtocartbtn;

public Addtocartpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getAddbtn() {
	return addbtn;
}

public void setAddbtn(WebElement addbtn) {
	this.addbtn = addbtn;
}

public void addtocartbutton()
{
	addtocartbtn.click();
}
}
