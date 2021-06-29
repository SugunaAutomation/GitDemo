package musafirStepDefine;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Cucumber.Selenium.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pages.Findflightspage;
@RunWith(Cucumber.class)
public class Findflights extends Base{
	WebDriver driver;
		Findflightspage oFindflights=new Findflightspage(driver);
		
	    @Given("^user has navigated to Musafir website$")
	    public void user_has_navigated_to_musafir_website() throws InterruptedException, IOException {
	    	oFindflights.navigatetoMusafirwebsite();
	    	Thread.sleep(1000);
	    }

	   @When("^user clicks on OneWay flight options$")
	   public void user_clicks_on_oneway_flight_options()  {
		   oFindflights.clickOneWayflightoptions();
	    
	   }

	    @When("^user enters (.+) and (.+)$")
	    public void user_enters_and(String source,String destination) throws InterruptedException  {
	    	Thread.sleep(1000);
	    	oFindflights.entersource(source);
	    	Thread.sleep(1000);
	 			oFindflights.enterdestination(destination);
	    }

	   
	    @Then("^user clicks Date$")
	    public void user_clicks_date() throws InterruptedException  {
	     	Thread.sleep(3000);
	     	oFindflights.enterdate();
	  	    //driver.findElement(By.xpath("//input[@name='EndDate']")).sendKeys("30/06/21");
	        
	    }

	    @And("^user clicks Find Flights$")
	    public void user_clicks_find_flights() throws InterruptedException  {
	    	oFindflights.clickfindflights();
	    	Thread.sleep(5000);
	        
	    }
	    
	    

	}


