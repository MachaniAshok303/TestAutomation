package com.sgtesting.actitime.driverscript;

import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.HomePage;
import com.sgtesting.actitime.tests.Initialization;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Projects;
import com.sgtesting.actitime.tests.Tasks;
import com.sgtesting.actitime.tests.Users;

public class DriverScript {

	public static void main(String[] args) {
		WebDriver oBrowser=null;
		
       //Create User Scenario:-
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Users.createUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		
		//Modify User Scenario
		oBrowser=Initialization.launchBrowser();
		Initialization.navigate(oBrowser);
		LoginLogout.login(oBrowser);
		HomePage.minimizeFlyOutWindow(oBrowser);
		Users.createUser(oBrowser);
		Users.modifyUser(oBrowser);
		Users.deleteUser(oBrowser);
		LoginLogout.logout(oBrowser);
		Initialization.closeApplication(oBrowser);
		

		//Create Customer Scenario
		oBrowser=Initialization.launchBrowser();
				Initialization.navigate(oBrowser);
				LoginLogout.login(oBrowser);
				HomePage.minimizeFlyOutWindow(oBrowser);
			    Customers.createCustomer(oBrowser);
			    Customers.deleteCustomer(oBrowser);
				LoginLogout.logout(oBrowser);
				Initialization.closeApplication(oBrowser);
		
				//Modify Customer Scenario
				oBrowser=Initialization.launchBrowser();
				Initialization.navigate(oBrowser);
				LoginLogout.login(oBrowser);
				HomePage.minimizeFlyOutWindow(oBrowser);
			    Customers.createCustomer(oBrowser);
			    Customers.modifyCustomer(oBrowser);
			    Customers.deleteCustomer(oBrowser);
			    LoginLogout.logout(oBrowser);
				Initialization.closeApplication(oBrowser);
				
				//create Project Scenario
				oBrowser=Initialization.launchBrowser();
				Initialization.navigate(oBrowser);
				LoginLogout.login(oBrowser);
				HomePage.minimizeFlyOutWindow(oBrowser);
			    Customers.createCustomer(oBrowser);
			    Projects.createProject(oBrowser);
			    Projects.deleteProject(oBrowser);
			    Customers.deleteCustomer(oBrowser);
			    LoginLogout.logout(oBrowser);
				Initialization.closeApplication(oBrowser);
				
				//Modify Project Scenario
				oBrowser=Initialization.launchBrowser();
				Initialization.navigate(oBrowser);
				LoginLogout.login(oBrowser);
				HomePage.minimizeFlyOutWindow(oBrowser);
			    Customers.createCustomer(oBrowser);
			    Projects.createProject(oBrowser);
			    Projects.modifyProject(oBrowser);
			    Projects.deleteProject(oBrowser);
			    Customers.deleteCustomer(oBrowser);
			    LoginLogout.logout(oBrowser);
				Initialization.closeApplication(oBrowser);
				
				//create Task Scenario
				oBrowser=Initialization.launchBrowser();
				Initialization.navigate(oBrowser);
				LoginLogout.login(oBrowser);
				HomePage.minimizeFlyOutWindow(oBrowser);
			    Customers.createCustomer(oBrowser);
			    Projects.createProject(oBrowser);
			    Tasks.createTasks(oBrowser);
			    Tasks.deleteTasks(oBrowser);
			    Projects.deleteProject(oBrowser);
			    Customers.deleteCustomer(oBrowser);
			    LoginLogout.logout(oBrowser);
				Initialization.closeApplication(oBrowser);

	}

}
