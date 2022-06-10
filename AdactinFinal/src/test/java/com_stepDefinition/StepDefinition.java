package com_stepDefinition;

import org.openqa.selenium.WebDriver;

import com_Runner.Runner_com;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_manager.POM_manager;
import com_baseclass.BaseClass_com;

public class StepDefinition {
public static WebDriver driver = Runner_com.driver;
	
	POM_manager man = new POM_manager(driver);
	BaseClass_com bc = new BaseClass_com();

	@Given("user is in home page")
	public void user_is_in_home_page() {
		bc.get(man.getHomepg().home);
	}

	@When("user enters the login details username password password")
	public void user_enters_the_login_details_justademo1_password_878csb() {
		bc.sendKeys(man.getHomepg().getUsername(), "justademo1");
		bc.sendKeys(man.getHomepg().getPassword(), "123pass");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		bc.click(man.getHomepg().getLoginButton());
	}

	@Then("user goes to select hotel page page\\(validates)")
	public void user_goes_to_select_hotel_page_page_validates() {
		man.getHotelsearch().getNoOfAdults().isDisplayed();
	}

	@Given("user is in the given page")
	public void user_is_in_the_given_page() {
		System.out.println("is in the search page");
	}

	@When("user selects the fields for hotel")
	public void user_selects_the_fields_for_hotel() {
		bc.dropdown(man.getHotelsearch().getEnterLocation(), "Sydney");
		bc.dropdown(man.getHotelsearch().getEnterHotel(), "Hotel Creek");
		bc.dropdown(man.getHotelsearch().getSelectRoom(), "Double");
		bc.dropdown(man.getHotelsearch().getRoomNo(), "2");
		bc.sendKeys(man.getHotelsearch().getCheckInDate(), "07/07/2022");
		bc.sendKeys(man.getHotelsearch().getCheckOutDate(), "09/07/2022");
		bc.dropdown(man.getHotelsearch().getNoOfAdults(), "2");
		bc.dropdown(man.getHotelsearch().getNoOfChild(), "3");
	}

	@And("user clicks on search button")
	public void user_clicks_on_search_button() {
		bc.click(man.getHotelsearch().getSubmitForm());

	}

	@Then("user is navigated to the select hotel page")
	public void user_is_navigated_to_the_select_hotel_page() {
		man.getSelecthotel().getSubmit().isDisplayed();
		bc.radioButton(man.getSelecthotel().getRadiobutton(), 0);
		bc.click(man.getSelecthotel().getSubmit());
	}

}
