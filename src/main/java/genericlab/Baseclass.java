package genericlab;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
public WebDriver driver;
public PropertyFile pdata=new PropertyFile();
public WebDriverutilities util=new WebDriverutilities();


@BeforeMethod
public void openApp() throws FileNotFoundException, IOException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(pdata.getData("url"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
@AfterMethod
public void closeApp(ITestResult res) throws IOException
{
 int status = res.getStatus();
 String name=res.getName();
 if(status==2)
 {
	 takescreenshot s=new takescreenshot();
	 s.getPhoto(driver, name);
 }
	
driver.quit();	
}
}
