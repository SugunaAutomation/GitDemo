package pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Cucumber.Selenium.Base;

public class Flipkartpage {
	
		public WebDriver driver;

		public Flipkartpage(WebDriver driver) {
			this.driver=driver;
		}
		
		public void navigatetoFlipkartwebsite() throws IOException {
			driver=Base.getDriver();
	    		
	}
		
		
	public void Entersvalueinsearchbox(String strArg1) throws InterruptedException {
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
    	search.sendKeys("mobiles");
    	for (int i=1;i<2;i++)
    	{
    		Thread.sleep(2000);
    		search.sendKeys(Keys.DOWN);
    	}
    	search.sendKeys(Keys.ENTER);
    	Thread.sleep(4000);
	}
	public void ClickSearchbutton() {
		driver.findElement(By.xpath("//button[@type='submit']"));
		
		
	}

	public void MobileDevicedisplayed() {
		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
	}

	public void Itemaddedtocart() throws InterruptedException {
		String handle=driver.getWindowHandle();
   	 Set<String> handles=driver.getWindowHandles();
	      handles.remove(handle);
	      String newhandle=handles.iterator().next();
	      driver.switchTo().window(newhandle);
	        driver.findElement(By.cssSelector("._2KpZ6l._2U9uOA._3v1-ww")).click();
  System.out.println("the mobile devices are  successfully added to the cart");
  Thread.sleep(3000);
  driver.switchTo().window(handle);
  driver.quit();
	}
	}


