package com_POM_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com_POMs.POM_addemployee;
import com_POMs.POM_employeelistpage;
import com_POMs.POM_homepage;
import com_POMs.POM_loginpage;
import com_POMs.POM_personaldetailspage;

public class Manager_pom {
	public static WebDriver driver;
	private POM_addemployee addemp;
	private POM_employeelistpage emplist;
	private POM_homepage homepg;
	private POM_loginpage loginpg;
	private POM_personaldetailspage perdetails;
	
	public Manager_pom(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver2, this);
	}
	public POM_addemployee getAddemp() {
		addemp = new POM_addemployee(driver);
		return addemp;
	}
	public POM_employeelistpage getEmplist() {
		emplist = new POM_employeelistpage(driver);
		return emplist;
	}
	public POM_homepage getHomepg() {
		homepg = new POM_homepage(driver);
		return homepg;
	}
	public POM_loginpage getLoginpg() {
		loginpg = new POM_loginpage(driver);
		return loginpg;
	}
	public POM_personaldetailspage getPerdetails() {
		perdetails = new POM_personaldetailspage(driver);
		return perdetails;
	}
	

}
