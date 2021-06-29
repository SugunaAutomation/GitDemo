package pages;

import org.openqa.selenium.WebDriver;

public class Searchflightspage {
public WebDriver driver;
public Searchflightspage(WebDriver driver) {
	this.driver=driver;
}


public void navigatetoFlightOptionspage() {
	// TODO Auto-generated method stub
	System.out.println("user is successfully navigated to flight options page");
    driver.quit();
	
}
}