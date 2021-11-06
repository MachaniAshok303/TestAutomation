package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario01POM 
{
public static WebDriver oBrowser=null;
public static Assignment1Actitime oPage=null;
public static void main(String[] args) 
{
launchBrowser();
navigate();
login();
minimizeFlyOutWindow();
createUser();
createUser2();
createUser3();
logout();

loginasUser1();
logout();

loginasUser2();
logout();

loginasUser3();
logout();

login();
modifyUser1();
modifyUser2();
modifyUser3();
logout();

loginasModifyuser1();
logout();

loginasModifyuser2();
logout();

loginasModifyuser3();
logout();

login();
deletemodifyUser1();
deletemodifyUser2();
deletemodifyUser3();
logout();
closeApplication();
}

static void launchBrowser()
{
try
{
	System.setProperty("webdriver.chrome.driver", "D:\\testing\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
	oBrowser=new ChromeDriver();
	oPage=new Assignment1Actitime (oBrowser);
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
	oPage.getUserName().sendKeys("admin");
	oPage.getPassWord().sendKeys("manager");
	oPage.getLogin().click();
	Thread.sleep(4000);
}catch(Exception e)
{
	e.printStackTrace();		
}
}

static void minimizeFlyOutWindow()
{
try
{
	oPage.getFlyOutWindow().click();
	Thread.sleep(2000);
}catch(Exception e)
{
	e.printStackTrace();		
}
}
static void createUser()
{
try
{
	oPage.getCreateUser().click();
	oPage.getAddUser().click();
	Thread.sleep(2000);
	oPage.getCreateuserFirstname().sendKeys("ashok");
	oPage.getCreateUserLastName().sendKeys("Krishna");
	oPage.getCreateUserEmail().sendKeys("AshokMachani@gmail.com");
	Thread.sleep(2000);
	oPage.getCreateUsername().sendKeys("ASHOK");
	oPage.getCreateUserpassword().sendKeys("123456");
	oPage.getCreateUserConfirmPassword().sendKeys("123456");
	oPage.getCreateUserConfirm().click();
	Thread.sleep(3000);
}catch(Exception e)
{
	e.printStackTrace();
}
}
static void createUser2()
{
try
{
	oPage.getCreateUser().click();
	oPage.getAddUser().click();
	oPage.getCreateuserFirstname().sendKeys("Ashok2");
	oPage.getCreateUserLastName().sendKeys("Krishna2");
	oPage.getCreateUserEmail().sendKeys("AshokMachani2@gmail.com");
	Thread.sleep(2000);
	oPage.getCreateUsername().sendKeys("ASHOK2");
	oPage.getCreateUserpassword().sendKeys("1234567");
	oPage.getCreateUserConfirmPassword().sendKeys("1234567");
	oPage.getCreateUserConfirm().click();
	Thread.sleep(3000);
}catch(Exception e)
{
	e.printStackTrace();
}
}
static void createUser3()
{
try
{
	oPage.getCreateUser().click();
	oPage.getAddUser().click();
	Thread.sleep(2000);
	oPage.getCreateuserFirstname().sendKeys("Ashok3");
	oPage.getCreateUserLastName().sendKeys("Krishna3");
	oPage.getCreateUserEmail().sendKeys("AshokMachani3@gmail.com");
	Thread.sleep(2000);
	oPage.getCreateUsername().sendKeys("ASHOK3");
	oPage.getCreateUserpassword().sendKeys("12345678");
	oPage.getCreateUserConfirmPassword().sendKeys("12345678");
	oPage.getCreateUserConfirm().click();
	Thread.sleep(3000);
}catch(Exception e)
{
	e.printStackTrace();
}
}
static void loginasUser1()
{
try
{
	Thread.sleep(2000);
	oPage.getUserName().sendKeys("ASHOK");
	oPage.getPassWord().sendKeys("123456");
	oPage.getLogin().click();
	Thread.sleep(2000);
	oPage.getclickyoutubeLinkafteruser123login().click();
	Thread.sleep(2000);
}catch(Exception e)
{
	e.printStackTrace();		
}
}
static void loginasUser2()
{
try
{
	Thread.sleep(2000);
	oPage.getUserName().sendKeys("ASHOK2");
	oPage.getPassWord().sendKeys("1234567");
	oPage.getLogin().click();
	Thread.sleep(2000);
	oPage.getclickyoutubeLinkafteruser123login().click();
	Thread.sleep(2000);
}catch(Exception e)
{
	e.printStackTrace();		
}
}
static void loginasUser3()
{
try
{
	Thread.sleep(2000);
	oPage.getUserName().sendKeys("ASHOK3");
	oPage.getPassWord().sendKeys("12345678");
	oPage.getLogin().click();
	Thread.sleep(2000);
	oPage.getclickyoutubeLinkafteruser123login().click();
	Thread.sleep(2000);
}catch(Exception e)
{
	e.printStackTrace();		
}
}
static void ModifyUser()
{
	try
	{
		oPage.getCreateUserToModify().click();
		Thread.sleep(3000);
		oPage.getCreateUserToModifypassword().sendKeys("1234");
		oPage.getCreateUserToModifyConfirmpassword().sendKeys("1234");
		Thread.sleep(1000);
		oPage.getconfirmModifytosavechanges().click();
		Thread.sleep(3000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void modifyUser1()
{
	try
	{
		oPage.getCreateUser().click();
		oPage.getclickonuser1tomodify().click(); 
		Thread.sleep(3000);
		oPage.getCreateUserToModifypassword().sendKeys("1234");
		oPage.getCreateUserToModifyConfirmpassword().sendKeys("1234");
		Thread.sleep(1000);
		oPage.getconfirmModifytosavechanges().click();
		Thread.sleep(3000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void modifyUser2()
{
	try
	{
		oPage.getclickonuser2tomodify().click(); 
		Thread.sleep(3000);
		oPage.getCreateUserToModifypassword().sendKeys("12345");
		oPage.getCreateUserToModifyConfirmpassword().sendKeys("12345");
		Thread.sleep(1000);
		oPage.getconfirmModifytosavechanges().click();
		Thread.sleep(3000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void modifyUser3()
{
	try
	{
		oPage.getclickonuser3tomodify().click(); 
		Thread.sleep(3000);
		oPage.getCreateUserToModifypassword().sendKeys("123456");
		oPage.getCreateUserToModifyConfirmpassword().sendKeys("123456");
		Thread.sleep(1000);
		oPage.getconfirmModifytosavechanges().click();
		Thread.sleep(3000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void loginasModifyuser1()
{
try
{
	oPage.getUserName().sendKeys("ASHOK");
	oPage.getPassWord().sendKeys("1234");
	oPage.getLogin().click();
	Thread.sleep(2000);
	//oPage.getclickyoutubeLinkafteruser123login().click();
}catch(Exception e)
{
	e.printStackTrace();		
}
}
static void loginasModifyuser2()
{
try
{
	oPage.getUserName().sendKeys("ASHOK2");
	oPage.getPassWord().sendKeys("12345");
	oPage.getLogin().click();
	Thread.sleep(2000);
	//oPage.getclickyoutubeLinkafteruser123login().click();
}catch(Exception e)
{
	e.printStackTrace();		
}
}
static void loginasModifyuser3()
{
try
{
	oPage.getUserName().sendKeys("ASHOK3");
	oPage.getPassWord().sendKeys("123456");
	oPage.getLogin().click();
	Thread.sleep(2000);
	//oPage.getclickyoutubeLinkafteruser123login().click();
}catch(Exception e)
{
	e.printStackTrace();		
}
}
static void deletemodifyUser1()
{
try {
	oPage.getCreateUser().click();
	oPage.getselectmodifyuser1todelete().click();
	Thread.sleep(3000);
	oPage.getselectDeleteUser().click();
Thread.sleep(3000);
Alert oAlert=oBrowser.switchTo().alert();
String str=oAlert.getText();
System.out.println(str);
oAlert.accept();Thread.sleep(3000);
}catch(Exception e)
{
	e.printStackTrace();
}
}
static void deletemodifyUser2()
{
try {
	
	oPage.getselectmodifyuser2todelete().click();
	Thread.sleep(3000);
	oPage.getselectDeleteUser().click();
Thread.sleep(3000);
Alert oAlert=oBrowser.switchTo().alert();
String str=oAlert.getText();
System.out.println(str);
oAlert.accept();Thread.sleep(3000);
}catch(Exception e)
{
	e.printStackTrace();
}
}
static void deletemodifyUser3()
{
try {
	
	oPage.getselectmodifyuser3todelete().click();
	Thread.sleep(3000);
	oPage.getselectDeleteUser().click();
Thread.sleep(3000);
Alert oAlert=oBrowser.switchTo().alert();
String str=oAlert.getText();
System.out.println(str);
oAlert.accept();Thread.sleep(3000);
}catch(Exception e)
{
	e.printStackTrace();
}
}
static void logout()
{
try
{
	oPage.getLogout().click();
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




