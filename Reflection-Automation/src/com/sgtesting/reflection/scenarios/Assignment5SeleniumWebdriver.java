package com.sgtesting.reflection.scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5SeleniumWebdriver {
		public static WebDriver oBrowser=null;
		public static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "D:\\testing\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
			}catch (Exception e)
			{
				e.printStackTrace();		
				
			}
		}
		public static void navigate()
		{
			try 
			{
				oBrowser.navigate().to("http://localhost:82/login.do");
				oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
				
			}catch (Exception e)
			{
				e.printStackTrace();		
				
			}
			
		}
		public static void login()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void minimizeFlyOutWindow()
		{
			try 
			{
				Thread.sleep(2000);
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(1000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void createcustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("Customer1");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void createProject()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Project1");
				
				oBrowser.findElement(By.id("projectPopup_commitBtn")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void deleteProject()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
				Thread.sleep(2000);
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void deletecustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
				Thread.sleep(2000);
				
				
			}catch(Exception e)
			{				
				e.printStackTrace();
			}
		}
		public static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void closeapplication()
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

