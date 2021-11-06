package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignment1Actitime 
{
	public Assignment1Actitime (WebDriver oBrowser)
{
	PageFactory.initElements(oBrowser, this);
}
	//userWebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
    //passwordWebElement
	private WebElement pwd;
	public WebElement getPassWord() 
	{
		return pwd;
	}
	//Login ButtonWebelement
	@FindBy(xpath="//*[@id=\"loginButton\"]/div")
	private WebElement ologin;
	public WebElement getLogin()
	{
		return ologin;
	}
	//Minimize flyOut Window
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyOutWindow()
		{
			return gettingStartedShortcutsPanelId;
		}
		
	//CreateUser
		@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")     
		private WebElement oCreateUser;
		public WebElement getCreateUser()
		{
			return oCreateUser;
		}
		
	//addUser
		@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
		private WebElement oAddUser;
		public WebElement getAddUser()
		{
			return oAddUser;
		}
	//CreateuserFirstname
		private WebElement firstName;
		public WebElement getCreateuserFirstname()
		{
			return firstName;
		}
	//CreateUserLastName
		private WebElement lastName;
		public WebElement getCreateUserLastName()
		{
			return lastName;
		}
	//CreateUserEmail
		private WebElement email;
		public WebElement getCreateUserEmail()
		{
			return email;
		}
	//CreateUserusername
		private WebElement userDataLightBox_usernameField;
		public WebElement getCreateUsername()
		{
			return userDataLightBox_usernameField;
		}
	//createUserpassword
		private WebElement password;
		public WebElement getCreateUserpassword()
		{
			return password;
		}
	//CreateUserConfirmPassword
		private WebElement passwordCopy;
		public WebElement getCreateUserConfirmPassword()
		{
			return passwordCopy;
		}
	//CreateUserConfirm
		@FindBy(xpath="//span[text()='Create User']")
		private WebElement oCreateUserConfirm;
		public WebElement getCreateUserConfirm()
		{
			return oCreateUserConfirm;
		}
	//CreateUsertoModify
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")
		private WebElement oCreateUsertoModify;
		public WebElement getCreateUserToModify()
		{
			return oCreateUsertoModify;
		}
	//CreateUsertoModifyPassword
		private WebElement userDataLightBox_passwordField;
		public WebElement getCreateUserToModifypassword()
		{
			return userDataLightBox_passwordField;
		}
	//CreateUsertoModifyConfirmPassword
		private WebElement userDataLightBox_passwordCopyField;
		public WebElement getCreateUserToModifyConfirmpassword()
		{
			return userDataLightBox_passwordCopyField;
		}
	//confirmModifytosavechanges
		private WebElement userDataLightBox_commitBtn;
		public WebElement getconfirmModifytosavechanges()
		{
			return userDataLightBox_commitBtn;
		}
	//selectCreateusertoDelete
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")
		private WebElement oselectCreateusertoDelete;
		public WebElement getselectCreateusertoDelete()
		{
			return oselectCreateusertoDelete;
		}
	//selectDeleteUser
		private WebElement userDataLightBox_deleteBtn;  
		public WebElement getselectDeleteUser()
		{
			return userDataLightBox_deleteBtn;
		}
	//selectLogout
		private WebElement logoutLink;
		public WebElement getLogout()
		{
			return logoutLink;
		}
	//CreateCustomertoclickonTask
		@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a")
		private WebElement ocreateCustomertoclickonTask;
		public WebElement getCreateCustomertoclickTask()
		{
			return ocreateCustomertoclickonTask;
		}
	//CreateAddNewCustomerUnderTaskbar
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")
		private WebElement oCreateAddNewCustomerUnderTaskbar;
		public WebElement getCreateAddNewCustomerUnderTaskbar()
		{
			return oCreateAddNewCustomerUnderTaskbar;
		}
	//CreateCustomertoselectNewCustomer
		@FindBy(xpath="/html/body/div[14]/div[1]")
		private WebElement oCreateCustomertoselectNewCustomer;
		public WebElement getcreateCustomertoselectNewCustomer()
		{
			return oCreateCustomertoselectNewCustomer;
		}
	//GiveCustomername
		private WebElement customerLightBox_nameField;
		public WebElement getGiveCustomername()
		{
			return customerLightBox_nameField;
		}
	//confirmCreateCustomer
		@FindBy (xpath="//*[@id=\'customerLightBox_commitBtn\']")
		private WebElement oconfirmCreateCustomer;
		public WebElement getconfirmCreateCustomer()
		{
			return oconfirmCreateCustomer;
		}
	//ClickSettingCustomertoModifyorDelete
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement oclickSettingCustomertoModifyorDelete;
		public WebElement getclickSettingCustomertoModifyorDelete()
		{
			return oclickSettingCustomertoModifyorDelete;
		}
	//clickActionButtontoDeleteCustomer
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
		private WebElement oclickActionButtontoDeleteCustomer;
		public WebElement getclickActionButtontoDeleteCustomer()
		{
			return oclickActionButtontoDeleteCustomer;
		}
	//clickDeleteCutomer
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]")
		private WebElement oclickDeleteCutomer;
		public WebElement getclickDeleteCutomer()
		{
			return oclickDeleteCutomer;
		}
	//ClickDeleteCustomerConfirm
		private WebElement customerPanel_deleteConfirm_submitTitle;
		public WebElement getClickDeleteCustomerConfirm()
		{
			return customerPanel_deleteConfirm_submitTitle;
		}
	//clickSettingCustomertDelete
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement oclickSettingCustomertDelete;
		public WebElement getclickSettingCustomertDelete()
		{
			return oclickSettingCustomertDelete;
		}
		
		//modifyCustomerclickoncustomernamefield
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")  
				private WebElement omodifyCustomerclickoncustomernamefield;
				public WebElement getmodifyCustomerclickoncustomernamefield()
				{
					return omodifyCustomerclickoncustomernamefield;
				}
				//modifyCustomerclickoncustomernamefieldtoClear
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
				private WebElement omodifyCustomerclickoncustomernamefieldtoClear;
				public WebElement getmodifyCustomerclickoncustomernamefieldtoclear()
				{
					return omodifyCustomerclickoncustomernamefieldtoClear;
				}
	//modifyCustomername
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
		private WebElement omodifyCustomername;
		public WebElement getmodifyCustomername()
		{
			return omodifyCustomername;
		}
	//AfterModifyCloseCustomerWindow
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
		private WebElement oAfterModifyCloseCustomerWindow;
		public WebElement getAfterModifyCloseCustomerWindow()
		{
			return oAfterModifyCloseCustomerWindow;
		}
	//clickAddNew
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")  
		private WebElement oclickAddNew;
		public WebElement getclickAddNew()
		{
			return oclickAddNew;
		}
	//clickNewprojectunderADDNew
		@FindBy(xpath="/html/body/div[14]/div[2]")  
		private WebElement oclickNewprojectunderADDNew;
		public WebElement getclickNewprojectunderADDNew()
		{
			return oclickNewprojectunderADDNew;
		}
	//GiveProjectnameonnameField
		private WebElement projectPopup_projectNameField ;
		public WebElement getGiveProjectnameonnameField()
		{
			return projectPopup_projectNameField;
		}
	//confirmCreateproject
		private WebElement projectPopup_commitBtn ;
		public WebElement getconfirmCreateproject()
		{
			return projectPopup_commitBtn;
		}
	//clicksettingsatProject
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")  
		private WebElement oclicksettingsatproject;
		public WebElement getclicksettingsatproject()
		{
			return oclicksettingsatproject;
		}
	//clickActionsinProject
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")  
		private WebElement oclickActionsinProject;
		public WebElement getclickActionsinProject()
		{
			return oclickActionsinProject;
		}
	//ClickDeleteonProject
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")  
		private WebElement oclickDeleteonProject;
		public WebElement getclickDeleteonProject()
		{
			return oclickDeleteonProject;
		}
	//confirmDeleteProject
		@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")  
		private WebElement oconfirmDeleteProject;
		public WebElement getconfirmDeleteProject()
		{
			return oconfirmDeleteProject;
		}
	//clickSettingstoModifyproject
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")  
		private WebElement oclickSettingstoModifyproject;
		public WebElement getclickSettingstoModifyproject()
		{
			return oclickSettingstoModifyproject;
		}
	//giveDescriptioninproject
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")  
		private WebElement ogiveDescriptioninproject;
		public WebElement getgiveDescriptioninproject()
		{
			return ogiveDescriptioninproject;
		}
	//selectNewtask
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[1]")  
		private WebElement oselectNewtask;
		public WebElement getselectNewtask()
		{
			return oselectNewtask;
		}
	//selectCreatnewTask
		@FindBy(xpath="/html/body/div[13]/div[1]")  
		private WebElement oselectCreatnewTask;
		public WebElement getselectCreatnewTask()
		{
			return oselectCreatnewTask;
		}
	//selectCreatnewTask1underTask
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")  
		private WebElement oselectCreatnewTask1underTask;
		public WebElement getselectCreatnewTask1underTask()
		{
			return oselectCreatnewTask1underTask;
		}
	//confirmtask1
		@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']")  
		private WebElement oconfirmtask1;
		public WebElement getconfirmtask1()
		{
			return oconfirmtask1;
		}
	//selectAlltasktodelete
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/table/tbody/tr/td[1]")  
		private WebElement oselectAlltasktodelete;
		public WebElement getselectAlltasktodelete()
		{
			return oselectAlltasktodelete;
		}
	//deleteTasktoselect
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]")  
		private WebElement odeleteTasktoselect;
		public WebElement getdeleteTasktoselect()
		{
			return odeleteTasktoselect;
		}
	//confirmDeleteTask  
		private WebElement deleteTaskPopup_deleteConfirm_submitTitle;
		public WebElement getconfirmDeleteTask()
		{
			return deleteTaskPopup_deleteConfirm_submitTitle;
		}
	//clickyoutubeLinkafteruser123login
		@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div")  
		private WebElement oclickyoutubeLinkafteruser123login;
		public WebElement getclickyoutubeLinkafteruser123login()
		{
			return oclickyoutubeLinkafteruser123login;
		}
	//clickonuser1tomodify
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table")  
		private WebElement oclickonuser1tomodify;
		public WebElement getclickonuser1tomodify()
		{
			return oclickonuser1tomodify;
		}
	//clickonuser2tomodify
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")  
		private WebElement oclickonuser2tomodify;
		public WebElement getclickonuser2tomodify()
		{
			return oclickonuser2tomodify;
		}
	//clickonuser3tomodify
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table")  
		private WebElement oclickonuser3tomodify;
		public WebElement getclickonuser3tomodify()
		{
		    return oclickonuser3tomodify;
		}
	//selectmodifyuser1todelete
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table")  
		private WebElement oselectmodifyuser1todelete;
		public WebElement getselectmodifyuser1todelete()
		{
			return oselectmodifyuser1todelete;
		}
		//selectmodifyuser2todelete
			@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table")  
			private WebElement oselectmodifyuser2todelete;
			public WebElement getselectmodifyuser2todelete()
			{
				return oselectmodifyuser2todelete;
			}
		//selectmodifyuser3todelete
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table")  
			private WebElement oselectmodifyuser3todelete;
			public WebElement getselectmodifyuser3todelete()
			{
				return oselectmodifyuser3todelete;
			}
		//Deleteuser3foradvscenario2
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]")  
			private WebElement odeleteuser3foradvscenario2;
			public WebElement getdeleteuser3foradvscenario2()
			{
				return odeleteuser3foradvscenario2;
			}
			//Deleteuser2foradvscenario2
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")  
			private WebElement odeleteuser2foradvscenario2;
			public WebElement getdeleteuser2foradvscenario2()
			{
				return odeleteuser2foradvscenario2;
			}

}
