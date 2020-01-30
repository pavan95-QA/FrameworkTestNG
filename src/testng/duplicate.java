package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class duplicate {
	
	
	 @Test(enabled=true,priority=1,groups="admin")
	  public void Tc2_1() throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://apps.qaplanet.in/qahrm/login.php");
			driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
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
}
