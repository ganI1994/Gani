package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlab.Baseclass;
import pompages.Addtocartpage;
import pompages.demopage;
import pompages.loginpage;

public class addtocart extends Baseclass
{
@Test
public void tc1() throws FileNotFoundException, IOException
{
loginpage l=new loginpage(driver);
l.gearbutton();
l.skillrarybutton();
util.switchTabs(driver);
demopage d=new demopage(driver);
util.mousehover(driver, d.getCoursebtn());
d.course();
Addtocartpage add=new Addtocartpage(driver);
util.doubleclick(driver, add.getAddbtn());
add.addtocartbutton();
util.alertpopup(driver);
Assert.assertEquals(driver.getTitle(), pdata.getData("title"));
Reporter.log(driver.getTitle(),true);
}
}