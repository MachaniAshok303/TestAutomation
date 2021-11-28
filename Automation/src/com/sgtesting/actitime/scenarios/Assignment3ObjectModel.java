package com.sgtesting.actitime.scenarios;
import java.time.Duration;

import org.apache.log4j.Logger;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment3ObjectModel {

	public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static Logger log=Logger.getLogger("Automation Assignment3");
	
	@Test(priority=1)
	public void launchBrowser()  
	{
		try
		{
			String path=System.getProperty("user.dir");
			log.info(path);
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
			log.info("The Browser has launched successfully in Assignment3");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=2)
	public void navigate()
	{
		try
		{
			log.info(path);
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			log.info("The ActiTime page has navigated successfully in Assignment3");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=3,dataProvider="credentails")
	static void login(String name,String pwd)
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("loginusernametxtfield")).sendKeys(name);
			oBrowser.findElement(objectmap.getLocator("loginpasswordtxtfield")).sendKeys(pwd);
			oBrowser.findElement(objectmap.getLocator("loginloginbtn")).click();
			Thread.sleep(5000);
			log.info("The ActiTime page has login successfully in Assignment3");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=4)
	public void minimizeFlyOutWindow()
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("homepageminimizeflyoutwin")).click();
			Thread.sleep(2000);
			log.info("In ActiTime page FlyOutWindow has Minimized in Assignment3");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=5,dataProvider="createCustomer1Credentials")
	public void createcustomer(String Customername)
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("selectTaskstocreateCustomer1")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("selectAddnewtocreateCustomer1")).click();
			oBrowser.findElement(objectmap.getLocator("selectNewCustomerunderAddnewtocreateCustomer1")).click();
			Thread.sleep(1500);
			oBrowser.findElement(objectmap.getLocator("giveCustomernameofCustomer1")).sendKeys(Customername);
			Thread.sleep(1500);
			oBrowser.findElement(objectmap.getLocator("giveConfirmCustomerofCustomer1")).click();
			log.info("The ActiTime page has Created Customer successfully in Assignment3");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=6)
	public void deletecustomer()
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("selectsettingbuttontodeleteCustomer1")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("selectActionstodeleteCustomer1")).click();   
			Thread.sleep(2500);
			oBrowser.findElement(objectmap.getLocator("selectDeletetodeleteCustomer1")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("giveDeletePermanentlyofCustomer1")).click();
			log.info("The ActiTime page has Deleted Customer successfully in Assignment3");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=7)
	public void logout()
	{
		try
		{
			log.info(path);
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(2000);
			log.info("The ActiTime page has Logout Application Sucessfully in Assignment3");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=8)
	public void closeApplication()
	{
		try
		{
			log.info(path);
			oBrowser.quit();
			log.info("The ActiTime page has closed Application Sucessfully in Assignment3");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	@DataProvider(name="credentails")
	public Object[][] getCredentials()
	{
		return new Object[][] {
			{"admin","manager"},
			};
	}
	@DataProvider(name="createCustomer1Credentials")
	public Object[][] getcreateCustomer1Credentials()
	{
		return new Object[][]{
			{"Customer1"}
			};
	}

}


