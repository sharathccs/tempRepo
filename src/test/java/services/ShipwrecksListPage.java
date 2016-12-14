package services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.CommonMethods;

public class ShipwrecksListPage {
	
	private static final Logger logger = Logger.getLogger(ShipwrecksListPage.class);
	
	public static void _ValidateShipWrecksListPage(WebDriver driver){
			WebElement objShipWrecksListPage = CommonMethods.getElement(driver,"//h3[contains(text(), 'All Shipwrecks')]");
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Encountered an exception");
			}
			logger.info("Validate List page");
			Assert.assertEquals(objShipWrecksListPage.isDisplayed(), true,"Validated Shipwrecks List Page");
			
	}
	
	public static void _NavigateAddNewShipWreck(WebDriver driver){
		
		WebElement objAddNewShipWreck = driver.findElement(By.xpath("//a[@ui-sref='newShipwreck']"));
		System.out.println("checking for element:" + objAddNewShipWreck.isDisplayed());
		objAddNewShipWreck.click();
		logger.info("Navigate to Add New Shipwreck page");
	}
	
	public static void _NavigateViewShipWreck(WebDriver driver){	
		WebElement objViewShipWreck = CommonMethods.getElement(driver,"//a[@href='#/shipwrecks']");
		objViewShipWreck.click();
		logger.info("Navigate to View Shipwreck page");
		
	}
	
}
