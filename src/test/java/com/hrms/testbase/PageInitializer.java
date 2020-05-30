package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElement;
import com.hrms.pages.DashboardPageElement;
import com.hrms.pages.LoginPageElement;
import com.hrms.pages.PersonalDetailsPageElements;

public class PageInitializer extends BaseClass{

		public static LoginPageElement login;
		public static AddEmployeePageElement addEmp;
		public static DashboardPageElement dashboard;
		public static PersonalDetailsPageElements pdetails;
		
		public static void initialize() {
			
			login=new LoginPageElement();
			dashboard=new DashboardPageElement();
			addEmp=new AddEmployeePageElement();
			pdetails=new PersonalDetailsPageElements();
		}
	}

