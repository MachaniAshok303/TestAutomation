package com.sgtesting.actitime.scenarios;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Assignment1ObjectModel {

	public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static Logger log=Logger.getLogger("Automation Assignment1");

	
	@Test(priority=1)
	public  void launchBrowser()  
	{
		try
		{
			String path=System.getProperty("user.dir");
			log.info(path);
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
			log.info("The Browser has launched successfully in Assignment1");
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
			oBrowser.navigate().to("http://localhost:82/login.do");
			log.info(path);
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			log.info("The ActiTime page has navigated successfully in Assignment1");
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
			log.info("The ActiTime page has login successfully in Assignment1");
			Thread.sleep(5000);
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
			log.info("In ActiTime page FlyOutWindow has Minimized in Assignment1");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=5,dataProvider="createuser1Credentials")
	public void createUser1(String Fname, String Lname,String email, String Username,String pwd, String cpwd )
	{
		try
		{
			log.info("path");
			oBrowser.findElement(objectmap.getLocator("createUser1toselectUsertab")).click();
			Thread.sleep(2500);
			oBrowser.findElement(objectmap.getLocator("createUser1toselectAddUser")).click();
			oBrowser.findElement(objectmap.getLocator("giveFirstnameofUser1")).sendKeys(Fname);
			oBrowser.findElement(objectmap.getLocator("giveLastnameofUser1")).sendKeys(Lname);
			Thread.sleep(1500);
			oBrowser.findElement(objectmap.getLocator("giveEmailofUser1")).sendKeys(email);
			oBrowser.findElement(objectmap.getLocator("giveUsernmaeofUser1")).sendKeys(Username);
			oBrowser.findElement(objectmap.getLocator("givePasswordofUser1")).sendKeys(pwd);
			oBrowser.findElement(objectmap.getLocator("giveConfirmPasswordofUser1")).sendKeys(cpwd);
			oBrowser.findElement(objectmap.getLocator("giveConfirmcreateUserofUser1")).click();
			Thread.sleep(2000);
			log.info("The ActiTime page has Created User1 successfully in Assignment1");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	@Test(priority=6)
	public void deleteUser1()
	{
		try
		{
			log.info("path");
			oBrowser.findElement(objectmap.getLocator("selectUser1todelete")).click();
			Thread.sleep(2500);
			oBrowser.findElement(objectmap.getLocator("deleteuserofUser1")).click();
			Thread.sleep(2500);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();Thread.sleep(3000);
			Thread.sleep(3000);
			log.info("The ActiTime page has Deleted User1 successfully in Assignment1 ");
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
			log.info("The ActiTime page has logout successfully in Assignment1");
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
			log.info("The ActiTime page has closed Application Sucessfully in Assignment1");
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
	@DataProvider(name="createuser1Credentials")
	public Object[][] getcreateuser1Credentials()
	{
		return new Object[][]{
			{"User1","Demo1","User1@gmail.com","USER1","1234","1234"}
			};
	}

}

