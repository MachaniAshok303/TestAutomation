package com.sgtesting.testscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2SeleniumWebdriver 
 {
			public static WebDriver oBrowser=null;
			public static void main(String[] args) 
			{
				launchBrowser();
				navigate();								
				login();
				MinimizeFlyOutWindow();
				Createuser();
				ModifyUser();
				deleteuser();
				Logout();
				Closeapplication();
			}
			static void launchBrowser()
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
			static void navigate()
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
			static void login()
			{
				try
				{
					oBrowser.findElement(By.id("username")).sendKeys("admin");
					oBrowser.findElement(By.name("pwd")).sendKeys("manager");
					oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			static void MinimizeFlyOutWindow()
			{
				try 
				{
					oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
					Thread.sleep(1000);
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			static void Createuser()
			{
				try 
				{
					oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
					Thread.sleep(1000);
					oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[1]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo2");
					oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User2");
					oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("Demouser2@gmail.com");
					oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("DemoAshok2");
					oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345678");
					oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345678");
					
					oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
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
					oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[2]/div[1]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.id("userDataLightBox_firstNameField")).clear();
					oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo1");
					oBrowser.findElement(By.id("userDataLightBox_lastNameField")).clear();
					oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User1");
					oBrowser.findElement(By.id("userDataLightBox_emailField")).clear();
					oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("Demouser1@gmail.com");
					oBrowser.findElement(By.id("userDataLightBox_usernameField")).clear();
					oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("DemoAshok1");
					oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
					oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456789");
					oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
					oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456789");
					Thread.sleep(3000);
					oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
					Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			static void deleteuser()
			{
				try
				{
					oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
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
			static void Logout()
			{
				try 
				{
					oBrowser.findElement(By.id("logoutLink")).click();
					Thread.sleep(2000);		
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			static void Closeapplication()
			{
				try 
				{
					oBrowser.quit();
					Thread.sleep(2000);		
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
