package musafirStepDefine;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
		@Before("@Searchtest")
		public void beforeSeleniumtest() {
			System.out.println("Seleniumtest before hook");
		}
		
		@After("@Searchtest")
		public void afterSeleniumtest() 
		{
			System.out.println("Seleniumtest after hook");
		}
		

	}


