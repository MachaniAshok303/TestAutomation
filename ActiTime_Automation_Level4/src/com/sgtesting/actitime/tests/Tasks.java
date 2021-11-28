package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tasks {
	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description
	 */
	public static void CreateCustomer(WebDriver oBrowser)
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public static void CreateProject(WebDriver oBrowser)
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
	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public static void DeleteProject(WebDriver oBrowser)
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
	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public static void DeleteCustomer(WebDriver oBrowser)
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
	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By: 
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public static void CreateTask (WebDriver oBrowser)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("Task1");
			
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")).sendKeys("Task2");
			
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[3]/td[1]/input")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[3]/td[1]/input")).sendKeys("Task3");
			
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[4]/td[1]/input")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[4]/td[1]/input")).sendKeys("Task4");
			
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[5]/td[1]/input")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[5]/td[1]/input")).sendKeys("Task5");
			
			oBrowser.findElement(By.xpath("//*[@id=\'createTasksPopup_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	/**
	 * Testcase ID:
	 * Module Name:
	 * Created By:
	 * Reviewed By:
	 * Modified By:
	 * Return Value:
	 * Parameters:
	 * Modified Date:
	 * Purpose:
	 * Description:
	 */
	public static void DeleteTask(WebDriver oBrowser)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/table/tbody/tr/td[1]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("deleteTaskPopup_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}
