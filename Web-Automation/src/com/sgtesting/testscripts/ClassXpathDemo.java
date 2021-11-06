package com.sgtesting.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ClassXpathDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		
		launchBrowser();
		navigate();
		//absolutepathDEMO();
		//relativeXpathTagnameAlone();
		//relativeXpathTAgnamewithIndex();
		//relativeXpathusingtagnamewithAttributenameandValue();
		//realtiveXpathusingAttributeValueandName();
		//relativeXpathusingAttributevalueAlone();
		//relativeXpathMultilpleAttributeValueandAttributeName();
		//relativeXpathusingMultipleAttributeValueandAttributeNameUsingAndOperator();
		//relativeXpathUsingMultipleAttributeValueandAttributeNameUsingOROperator();
		//relativeXPathUsingTagNameWithAttributeName();
		//relativeXPathUsingTagNameWithAttributeName_displayLinkNames();
		//realtivexpathUsingAttributename_clickonselectedLink();
		relativeXPathUsingTagNameWithAttributeName_PartialText();
	}
	static void launchBrowser()
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\testing\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try 
		{
			oBrowser.get("file:///D:/testing/selenium/XPATH_26th_OCT_2021/Sample.html");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void absolutepathDEMO()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'uid1user1name1\']")).sendKeys("demouser1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void relativeXpathTagnameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("demousr1");
	}
	static void relativeXpathTAgnamewithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("ashok");
	}
	static void relativeXpathusingtagnamewithAttributenameandValue()
	{
		//oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
		oBrowser.findElement(By.xpath("//input[@class='submit1btn1']")).click();
	}
	static void realtiveXpathusingAttributeValueandName()
	{
		oBrowser.findElement(By.xpath("//*[@id='btn1submit1button1']")).click();
	}
	static void relativeXpathusingAttributevalueAlone()
	{
		oBrowser.findElement(By.xpath("*//*[@*='button']")).click();
	}
	static void relativeXpathMultilpleAttributeValueandAttributeName()
	{
		oBrowser.findElement(By.xpath("//input[@class='submit1btn1'][@id='btn1submit1button1']")).click();
	}
	static void relativeXpathusingMultipleAttributeValueandAttributeNameUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' and @type='button']")).click();
	}
	static void relativeXpathUsingMultipleAttributeValueandAttributeNameUsingOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@name='submit1btn1' or @class='submit1btn1']")).click();
	}
	static void relativeXpathUsingPartialmatchingonAttributeValue()
	{
		oBrowser.findElement(By.xpath("//input[starts-with(@value,'Sub')")).click();
	}
	static void relativeXPathUsingTagNameWithAttributeName()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	static void relativeXPathUsingTagNameWithAttributeName_displayLinkNames()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			System.out.println(content);
		}
	}
	static void realtivexpathUsingAttributename_clickonselectedLink()
	{
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		oLinks.get(3).click();
	}
	static void relativeXPathUsingTagNameWithAttributeName_PartialText()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			if(content.endsWith("Tool"))
			{
				link.click();
				break;
			}
		}
	}
	}
	
