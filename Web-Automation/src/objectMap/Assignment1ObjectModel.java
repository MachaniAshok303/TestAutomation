package objectMap;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1ObjectModel {

	public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		deleteUser1();
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
	
	static void createUser1()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("createUser1toselectUsertab")).click();
			Thread.sleep(2500);
			oBrowser.findElement(objectmap.getLocator("createUser1toselectAddUser")).click();
			oBrowser.findElement(objectmap.getLocator("giveFirstnameofUser1")).sendKeys("User1");
			oBrowser.findElement(objectmap.getLocator("giveLastnameofUser1")).sendKeys("demo1");
			Thread.sleep(1500);
			oBrowser.findElement(objectmap.getLocator("giveEmailofUser1")).sendKeys("User1@gmail.com");
			oBrowser.findElement(objectmap.getLocator("giveUsernmaeofUser1")).sendKeys("USER1");
			oBrowser.findElement(objectmap.getLocator("givePasswordofUser1")).sendKeys("1234");
			oBrowser.findElement(objectmap.getLocator("giveConfirmPasswordofUser1")).sendKeys("1234");
			oBrowser.findElement(objectmap.getLocator("giveConfirmcreateUserofUser1")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("selectUser1todelete")).click();
			Thread.sleep(2500);
			oBrowser.findElement(objectmap.getLocator("deleteuserofUser1")).click();
			Thread.sleep(2500);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();Thread.sleep(3000);
			Thread.sleep(3000);
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

