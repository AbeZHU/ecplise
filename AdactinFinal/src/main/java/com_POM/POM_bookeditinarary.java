package com_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_bookeditinarary {
	public static WebDriver driver;
	public POM_bookeditinarary(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
	}
	@FindBy(xpath="//input[contains(@onclick,'booking')]")
	private List<WebElement> cancel;
	@FindBy(xpath="//input[@value='check_all']")
	private WebElement checkAll;
	@FindBy (xpath="//input[@name='ids[]']")
	private List<WebElement> checkbox;
	@FindBy(name = "cancelall")
	private WebElement cancelselected;
	@FindBy(name="search_hotel")
	private WebElement searchhotel;
	@FindBy(xpath="//input[@name='logout']")
	private WebElement logoutbtn;
	@FindBy(name="order_id_text")
	private WebElement searchorder;
	@FindBy(id="search_hotel_id")
	private WebElement go;
	public List<WebElement> getCancel() {
		return cancel;
	}
	public WebElement getCheckAll() {
		return checkAll;
	}
	public List<WebElement> getCheckbox() {
		return checkbox;
	}
	public WebElement getCancelselected() {
		return cancelselected;
	}
	public WebElement getSearchhotel() {
		return searchhotel;
	}
	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	public WebElement getSearchorder() {
		return searchorder;
	}
	public WebElement getGo() {
		return go;
	}
	
	
}
