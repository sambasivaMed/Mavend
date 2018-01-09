package DEMO.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
   public static void main(String args[])
   {
	   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com");
	   driver.findElement(By.id("lst-ib")).sendKeys("Hi This is Demo");
	   try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   driver.quit();
   }
}
