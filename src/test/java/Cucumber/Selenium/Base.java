package Cucumber.Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static WebDriver getDriver() throws IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sreev\\eclipse-workspace\\Seleniumnew\\chromedriver.exe" );
   	 driver=new ChromeDriver();
   	Properties property=new Properties();
   	FileInputStream fis=new	FileInputStream("C:\\Users\\sreev\\eclipse-workspace\\Selenium\\src\\test\\java\\Cucumber\\Selenium\\global.properties");
   	property.load(fis);
   	driver.get(property.getProperty("musafirurl"));
 	//driver.get(property.getProperty("flipkarturl"));
   	 return driver;
	}

}
