package com.sgtesting.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathaAxesDemo 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();
		//EntersalaryforthepersonSushmaswaraj();
		//entrythesalaryofIndianPoliticianbasedonIndianfreedomfighter();
		//makestatusactiveofIndianFreedomFighter();
		//makeNarendramodiStatusactiveBasedOnAge36();
		//basedonREFofsalaryFieldinSachinTendulkarrecordIdentifytable();
		basedontableReferenceEnterSalaryon3rdrecord();
	}
    static void launchbrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver", "D:\\\\testing\\\\ExampleAutomation\\\\Automation\\\\Web-Automation\\\\Library\\\\Drivers\\\\chromedriver.exe");
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
    		oBrowser.get("file:///D:/testing/selenium/XPathAxes_27th_OCT_2021/WebTableHTML.html");
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void EntersalaryforthepersonSushmaswaraj()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//td[text()='Sushma Swaraj']/following-sibling::td[4]/input")).sendKeys("65000");

    	}catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void entrythesalaryofIndianPoliticianbasedonIndianfreedomfighter()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/following::tr[3]/td[6]/input")).sendKeys("40000");

    	}catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void makestatusactiveofIndianFreedomFighter()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[2]/input")).click();

    	}catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void makeNarendramodiStatusactiveBasedOnAge36()
    {
    	try 
    	{
    		oBrowser.findElement(By.xpath("//td[text()='36']/preceding::tr[2]/td[1]/input")).click();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void basedonREFofsalaryFieldinSachinTendulkarrecordIdentifytable()
    {
    	try 
    	{
    		WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table"));
    		String val=oEle.getAttribute("id");
    		System.out.println(val);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    static void basedontableReferenceEnterSalaryon3rdrecord()
    {
    	try 
    	{
    		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[6]/input")).sendKeys("25000");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
