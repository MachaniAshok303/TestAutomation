package objectMap;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4ObjectModel 
{

	public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		modifycustomer();
		deletecustomer();
		logout();
		closeApplication();
	}
	static void launchBrowser()  
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginusernametxtfield")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpasswordtxtfield")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginloginbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageminimizeflyoutwin")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createcustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("selectTaskstocreateCustomer1")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("selectAddnewtocreateCustomer1")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("selectNewCustomerunderAddnewtocreateCustomer1")).click();
			Thread.sleep(1500);
			oBrowser.findElement(objectmap.getLocator("giveCustomernameofCustomer1")).sendKeys("Customer1");
			Thread.sleep(1500);
			oBrowser.findElement(objectmap.getLocator("giveConfirmCustomerofCustomer1")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifycustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("selectsettingbuttontodeleteCustomer1")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("selectnamefieldtomofiyCustomer1")).click();
			oBrowser.findElement(objectmap.getLocator("selecttoEnternamefieldtomofiyCustomer1")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("selecttoEnternamefieldtomofiyCustomer1")).sendKeys("Customer123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("selectclosetomofiyCustomer1")).click();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deletecustomer()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("selectsettingbuttontodeleteCustomer1")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("selectActionstodeleteCustomer1")).click();   
			Thread.sleep(2500);
			oBrowser.findElement(objectmap.getLocator("selectDeletetodeleteCustomer1")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("giveDeletePermanentlyofCustomer1")).click();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}