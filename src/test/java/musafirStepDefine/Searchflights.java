package musafirStepDefine;

import Cucumber.Selenium.Base;
import io.cucumber.java.en.And;
import pages.Searchflightspage;


public class Searchflights extends Base{
	Searchflightspage oSearchflights=new Searchflightspage(driver);
	
	
@And("^user is successfully navigated to flight options page$")
public void user_is_successfully_navigated_to_flight_options_page() throws InterruptedException  {
		    	//driver.findElement(By.cssSelector(".message.error"));
		    	//driver.findElement(By.linkText("Perhaps try different travel dates."));
		     //System.out.println(driver.findElement(By.linkText("Perhaps try different travel dates.")).getText());
		     Thread.sleep(3000);
		     oSearchflights.navigatetoFlightOptionspage();
		     
	}





}
