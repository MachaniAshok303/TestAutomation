package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1POM {
	public static WebDriver oBrowser=null;
	public static Assignment1Actitime oPage=null;
    public static void main(String[] args) 
    {
    launchBrowser();
	navigate();
	login();
	minimizeFlyOutWindow();
	createUser();
	deleteUser();
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
		oPage.getCreateuserFirstname().sendKeys("ashok");
		oPage.getCreateUserLastName().sendKeys("Krishna");
		oPage.getCreateUserEmail().sendKeys("AshokMachani@gmail.com");
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
static void deleteUser()
{
	try {
	oPage.getselectCreateusertoDelete().click();
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

