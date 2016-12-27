package e2eTests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.AddNewShipwrecksPage;
import pageObjects.ShipWrecksHomepage;
import pageObjects.ShipwrecksListPage;
import utils.Constants;



public class Shipwreck_e2e_ParallelTest_2 {
	public static WebDriver driver;
	final static Logger logger = Logger.getLogger(Shipwreck_e2e_ParallelTest_2.class);
	
	@Parameters({"browser"})
	@BeforeTest
	public void beforeMethod(String browser) throws Exception { 
			try {
			if (browser.equalsIgnoreCase("Firefox")) {
				//driver = new FirefoxDriver();
				File pathToBinary = new File(Constants.pathToFFBinary);
				FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
				FirefoxProfile firefoxProfile = new FirefoxProfile();       
				driver = new FirefoxDriver(ffBinary,firefoxProfile);
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						Constants.pathToChromeBinary);
				driver = new ChromeDriver();
			} 
			
			
			logger.info("New driver instantiated");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			logger.info("Implicit wait applied on the driver for 10 seconds");
			
			driver.get(Constants.ShipWreck_URL);
		    logger.info("Launched the app");
			
			
		
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		
		}
	}	
	
	@Test
	public void AddShipWreckTest() throws Exception {
		ShipWrecksHomepage._NavigateShipwrecksPage(driver);
		ShipwrecksListPage._NavigateAddNewShipWreck(driver);
		AddNewShipwrecksPage._AddNewShipwreckDetail(driver, Constants.AddNewShipwreck_Name, Constants.AddNewShipwreck_Description, Constants.AddNewShipwreck_Condition, Constants.AddNewShipwreck_YearDiscovered, Constants.AddNewShipwreck_DepthOfWreck, Constants.AddNewShipwreck_Latitude, Constants.AddNewShipwreck_Longitude);	
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
 
        }
	
}
