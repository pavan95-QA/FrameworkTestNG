package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Admin {
	WebDriver driver;
	String buildpath="http://apps.qaplanet.in/qahrm/login.php";
 @Test(enabled=true,priority=1,groups="admin")
  public void Tc2_1() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Actions acr=new Actions(driver);
		       WebElement Abutton1=driver.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"));
		       Thread.sleep(6000);
		       acr.moveToElement(Abutton1).build().perform();
		       WebElement Abutton2=driver.findElement(By.xpath("//span[contains(text(),'Company Info')]"));
		       Thread.sleep(6000);
		       acr.moveToElement(Abutton2).build().perform();
		       WebElement Abutton3=driver.findElement(By.xpath("//span[contains(text(),'General')]"));
		       Thread.sleep(6000);
		       Abutton3.click();	       
  }
  @Test(enabled=true,priority=2,groups="admin")
  public void Tc2_2() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Actions acr=new Actions(driver);
	       WebElement Abutton1=driver.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"));
	       Thread.sleep(6000);
	       acr.moveToElement(Abutton1).build().perform();
	       WebElement Abutton2=driver.findElement(By.xpath("//span[contains(text(),'Company Info')]"));
	       Thread.sleep(6000);
	       acr.moveToElement(Abutton2).build().perform();
	       WebElement Abutton3=driver.findElement(By.xpath("//span[contains(text(),'Locations')]"));
	       Thread.sleep(6000);
	       Abutton3.click();
  }
  @Test(enabled=true,priority=3,groups="admin")
  public void Tc2_3() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Actions acr=new Actions(driver);
	       WebElement Abutton1=driver.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"));
	       Thread.sleep(6000);
	        acr.moveToElement(Abutton1).build().perform();
	       WebElement Abutton2=driver.findElement(By.xpath("//span[contains(text(),'Company Info')]"));
	       Thread.sleep(6000);
	        acr.moveToElement(Abutton2).build().perform();
	       WebElement Abutton3=driver.findElement(By.xpath("//span[contains(text(),'Company Structure')]"));
	       Thread.sleep(6000);
	       Abutton3.click();
  }
  @Test(enabled=true,priority=4,groups="admin")
  public void Tc2_4() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Actions acr=new Actions(driver);
	       WebElement Abutton1=driver.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"));
	       Thread.sleep(6000);
	      acr.moveToElement(Abutton1).build().perform();
	       WebElement Abutton2=driver.findElement(By.xpath("//span[contains(text(),'Company Info')]"));
	       Thread.sleep(6000);
	        acr.moveToElement(Abutton2).build().perform();
	       WebElement Abutton3=driver.findElement(By.xpath("//span[contains(text(),'Company Property')]"));
	       Thread.sleep(6000);
	       Abutton3.click();
  } 
  @BeforeMethod
  public void BuildExecution() {
	  System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(buildpath);
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void BrowserClose() throws InterruptedException {
     driver.manage().deleteAllCookies();
	 Thread.sleep(6000);
	 driver.close();
	  
  }

}
