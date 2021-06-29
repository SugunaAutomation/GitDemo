package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import Cucumber.Selenium.Base;

public class Findflightspage {
	public WebDriver driver;
	
	
	public Findflightspage(WebDriver driver) {
		//PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	
	//@FindBy(xpath="//label[@for='trip_one']")
//	WebElement onewayflight;
	
	By onewayflight =(By.xpath("//label[@for='trip_one']"));
			
			
	public void navigatetoMusafirwebsite() throws IOException {
		try {
			driver=Base.getDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	}
	
	
public void clickOneWayflightoptions() {
	  // driver.findElement((By) Hotel).click();
//driver.findElement(By.xpath("//label[@for='trip_one']")).click();
driver.findElement(onewayflight).click();
}
public void entersource(String source) {
	driver.findElement(By.xpath("//input[@name='Origin']")).sendKeys(source);
	
	
}

public void enterdestination(String destination) {
	 driver.findElement(By.xpath("//input[@name='Destination']")).sendKeys(destination);
}

public void enterdate() {
	driver.findElement(By.xpath("//input[@name='StartDate']")).sendKeys("22/06/21");
}

public void clickfindflights() {
	driver.findElement(By.cssSelector(".optional.submit.button.yellow.flightsOnly_all.buttonBound.customButton")).click();
}

}
