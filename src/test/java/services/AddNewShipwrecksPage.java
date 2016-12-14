package services;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.CommonMethods;

public class AddNewShipwrecksPage {
			
	private static final Logger logger = Logger.getLogger(AddNewShipwrecksPage.class);
	
	public static void _AddNewShipwreckDetail(WebDriver driver, String Name, String Description, String Condition, String YearDiscovered, String DepthOfWreck, String Latitude, String Longitude ){
		
		WebElement objAddNewShipwreck_Name = CommonMethods.getElement(driver,"//input[@id='name']");
		WebElement objAddNewShipwreck_Description = CommonMethods.getElement(driver,"//input[@id='description']");
		WebElement objAddNewShipwreck_Condition = CommonMethods.getElement(driver,"//input[@id='condition']");
		WebElement objAddNewShipwreck_YearDiscovered = CommonMethods.getElement(driver,"//input[@id='yearDiscovered']");
		WebElement objAddNewShipwreck_DepthOfWreck = CommonMethods.getElement(driver,"//input[@id='depth']");
		WebElement objAddNewShipwreck_Latitude = CommonMethods.getElement(driver,"//input[@id='latitude']");
		WebElement objAddNewShipwreck_Longitude = CommonMethods.getElement(driver,"//input[@id='longitude']");
		WebElement objAddNewShipwreck_Save = CommonMethods.getElement(driver,"//input[@value='Save']");
		
		
		
		
		
		objAddNewShipwreck_Name.sendKeys(Name);
		objAddNewShipwreck_Description.sendKeys(Description);
		objAddNewShipwreck_Condition.sendKeys(Condition);
		objAddNewShipwreck_YearDiscovered.sendKeys(YearDiscovered);
		objAddNewShipwreck_DepthOfWreck.sendKeys(DepthOfWreck);
		objAddNewShipwreck_Latitude.sendKeys(Latitude);
		objAddNewShipwreck_Longitude.sendKeys(Longitude);
		
		objAddNewShipwreck_Save.click();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			System.out.println("Encountred an excecption");
		}
		
		
		
		logger.info("Saved Details of shipwreck");
	}


		
}
