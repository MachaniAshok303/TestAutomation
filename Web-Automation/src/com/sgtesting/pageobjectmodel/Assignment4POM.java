package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4POM 
{
public static WebDriver oBrowser=null;
public static Assignment1Actitime oPage=null;
public static void main(String[] args) 
{
launchBrowser();
navigate();
login();
minimizeFlyOutWindow();
createCustomer();
modifyCustomer();
deleteCustomer();
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
static void createCustomer()
{
try
{
	oPage.getCreateCustomertoclickTask().click();
	Thread.sleep(1000);
	oPage.getCreateAddNewCustomerUnderTaskbar().click();
	oPage.getcreateCustomertoselectNewCustomer().click();
	oPage.getGiveCustomername().sendKeys("ashok");
	Thread.sleep(1000);
	oPage.getconfirmCreateCustomer().click();
	Thread.sleep(3000);
}catch(Exception e)
{
	e.printStackTrace();
}
}
static void modifyCustomer()
{
try {
oPage.getclickSettingCustomertDelete().click();
Thread.sleep(3000);
oPage.getmodifyCustomerclickoncustomernamefield().click();
Thread.sleep(3000);
oPage.getmodifyCustomerclickoncustomernamefieldtoclear().clear();
Thread.sleep(2000);
oPage.getmodifyCustomername().sendKeys("Machani");
Thread.sleep(1000);
oPage.getAfterModifyCloseCustomerWindow().click();
Thread.sleep(3000);
}catch(Exception e)
{
	e.printStackTrace();
}
}
static void deleteCustomer()
{
try {
oPage.getclickSettingCustomertDelete().click();
Thread.sleep(3000);
oPage.getclickActionButtontoDeleteCustomer().click();
oPage.getclickDeleteCutomer().click();
Thread.sleep(1000);
oPage.getClickDeleteCustomerConfirm().click();
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


