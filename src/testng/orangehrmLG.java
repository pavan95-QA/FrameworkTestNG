package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class orangehrmLG {
	WebDriver driver;
	String buildpath="http://apps.qaplanet.in/qahrm/login.php";
 @Test(enabled=true,priority=1,groups="login")
  public void TC1_1(){
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	  
  }
  @Test(enabled=true,priority=2,groups="login")
  public void TC1_2() {
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebElement invalid=driver.findElement(By.xpath("//font[contains(text(),'Invalid Login')]"));
        String expected="Invalid Login";
        Assert.assertEquals(invalid.getText(),expected );
  }   
        
  @Test(enabled=true,priority=3,groups="homepage")
        public void TC1_3(){
      	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
      		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
      		driver.findElement(By.xpath("//input[@name='Submit']")).click();
      		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
      		
      		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
  
  }
  @BeforeMethod
  public void BuildExecution() {
	  System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(buildpath);
  }

  @AfterMethod
  public void BrowserClose() {
	  driver.manage().deleteAllCookies();
	  driver.close();
	  
  }

}
