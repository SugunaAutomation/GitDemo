package musafirStepDefine;

import java.io.IOException;

import org.junit.runner.RunWith;
import Cucumber.Selenium.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pages.Flipkartpage;
@RunWith(Cucumber.class)
public class flipkart extends Base{
        Flipkartpage oFlipkartpage=new Flipkartpage(driver);
	    @Given("^user has navigated to Flipkart website$")
	    public void user_has_navigated_to_flipkart_website() throws IOException {
	    	oFlipkartpage.navigatetoFlipkartwebsite();
	    	driver.manage().window().maximize();
	      
	   //driver.findElement(By.xpath("//div[@id='container']"));
	    //Alert alerts=driver.switchTo().alert();
	    //alerts.dismiss();
	    }

	    
	    @When("^user enters \"([^\"]*)\" in the search box$")
	    public void user_enters_something_in_the_search_box(String strArg1) throws InterruptedException  {
	    	oFlipkartpage.Entersvalueinsearchbox("strArg1");
	    }
	    @And("^clicks on the search button$")
	    public void clicks_on_the_search_button()  {
	    	oFlipkartpage.ClickSearchbutton();
	    	 
	    }

	    @Then("^the mobile devices are displayed successfully on the next page$")
	    public void the_mobile_devices_are_displayed_successfully_on_the_next_page() throws InterruptedException  {
	    	Thread.sleep(5000);
	    	oFlipkartpage.MobileDevicedisplayed();
	    		 
	    }
	    @And("^the item is successfully added to the cart$")
	    public void the_item_is_successfully_added_to_the_cart() throws InterruptedException {
	    	oFlipkartpage.Itemaddedtocart();
	    }
	   
	}

	
	 
	

