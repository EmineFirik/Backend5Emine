package com.neotech.testbase;

import com.neotech.pages.AddEmployeePage;
import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.EmployeListPage;
import com.neotech.pages.LoginPage;
import com.neotech.pages.PersonalDetailPageElement;

public class PageInitializer extends BaseClass {
	
	public static LoginPage login;
	public static DashboardPageElements dahsboard;
	public static AddEmployeePage addEmployee;
    public static PersonalDetailPageElement personelDetails;
    public static EmployeListPage employeList;
    
    public static void  initialize() {
    	
    	login = new LoginPage();
    	dahsboard = new DashboardPageElements();
    	addEmployee = new AddEmployeePage();
    	personelDetails = new PersonalDetailPageElement();
    	employeList = new EmployeListPage();
    }
    
}
