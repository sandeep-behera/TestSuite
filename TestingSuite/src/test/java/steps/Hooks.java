package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.BrowserDriver;

public class Hooks {

	@Before
	public static void setUp(){
		BrowserDriver.setUpDriver();
	
	}
	@After
	public static void closeApp(){
		BrowserDriver.tearDown();
	}
}
