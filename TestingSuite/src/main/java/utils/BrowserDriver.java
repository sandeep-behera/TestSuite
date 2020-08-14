package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserDriver {

	
	private static BrowserDriver BD;
	
	private static WebDriver driver;
	
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 60;
	
	private BrowserDriver(){
		ChromeOptions optionsBeta = new ChromeOptions();
		optionsBeta.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");
		WebDriverManager.chromedriver().driverVersion("85.0.4183.38").setup();
		driver = new ChromeDriver(optionsBeta);
		driver.manage().window().maximize();
		
		waitDriver = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
		
	}
	
	public static void openApp(String url){
		driver.get(url);
	}
	public static WebDriver getDriver(){
		return driver;
	}
	public static  void setUpDriver(){
		if(BD == null){
			BD = new BrowserDriver();
		}
	
	}
	public static void tearDown(){
		if(driver != null){
			driver.close();
			driver.quit();
		}
		BD = null;
	}
	public static String readPropertiesFile(String propertyName) throws IOException {
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Config.properties");
		System.out.println(System.getProperty("user.dir"));
		Properties prop = new Properties();
		prop.load(fis);
		
	File f= new File(System.getProperty("user.dir")+"\\src\\main\\resources");
	File app=new File(f,(String) prop.get(propertyName));
	 String property= prop.getProperty(propertyName);
	 return property;
	      
	   }
}
