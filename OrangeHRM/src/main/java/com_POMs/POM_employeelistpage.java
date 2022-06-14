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
	@FindBy (xpath="//input[@id='btnDelete']")
	private WebElement delete_btn;
	@FindBy(xpath="//input[@id='dialogDeleteBtn']")
	private WebElement ok_btn;
	public WebElement getOk_btn() {
		return ok_btn;
	}
	
	public WebElement getDelete_btn() {
		return delete_btn;
	}
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement checkbox;

	public WebElement getCheckbox() {
		return checkbox;
	}
	
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
