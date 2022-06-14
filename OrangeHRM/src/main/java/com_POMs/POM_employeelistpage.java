package com_POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_employeelistpage {

	public static WebDriver driver;

	public POM_employeelistpage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	@FindBy(xpath="//input[@id='empsearch_id']")
	private WebElement txt_employeeid;
	@FindBy(xpath="//input[@id='searchBtn']")
	private WebElement btn_search;
	//@FindBy(xpath="//a[contains(text(),'"+x+"')]")
	private WebElement employeeAnalyse;

	public WebElement getTxt_employeeid() {
		return txt_employeeid;
	}
	public WebElement getBtn_search() {
		return btn_search;
	}
	public WebElement getEmployeeAnalyse() {
		return employeeAnalyse;
	}
	
}
