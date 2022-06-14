package com_multi_stepdefinition;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import baseclass_com.BaseClass_com;
import com_runner_1.Runner;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_manager.POM_manager;
import property_file.PropertiesRead;

public class StepDefinition1 {
	public static WebDriver driver = Runner.driver;
	public static POM_manager man = new POM_manager(driver);
	public static BaseClass_com bc = new BaseClass_com();
	  PropertiesRead prop = new PropertiesRead();

	@BeforeStep
	public void readprop() {
		prop.PropertiesRead();
	}

	@Given("user is in home page")
	public void user_is_in_home_page() {
		bc.get(prop.getHomeUrl());
	}

	@When("user enters username and password in respective fields")
	public void user_enters_username_and_password_in_respective_fields() {
		bc.sendKeys(man.getHomepg().getUsername(), prop.getUserName());
		bc.sendKeys(man.getHomepg().getPassword(), prop.getPassword());
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		bc.click(man.getHomepg().getLoginButton());
	}

	@Then("user is navigated to the search hotel page")
	public void user_is_navigated_to_the_search_hotel_page() {
		man.getHotelsearch().getEnterLocation().isDisplayed();
	}

	@Given("user is in search hotel page")
	public void user_is_in_search_hotel_page() {
		System.out.println("search hotel page");
	}

	@When("user enters the needed fields of the search")
	public void user_enters_the_needed_fields_of_the_search() {
		bc.dropdown(man.getHotelsearch().getEnterLocation(), prop.getLocation());
		bc.dropdown(man.getHotelsearch().getEnterHotel(), prop.getHotel());
		bc.dropdown(man.getHotelsearch().getSelectRoom(), prop.getRoomType());
		bc.dropdown(man.getHotelsearch().getRoomNo(), prop.getRoomNo());
		bc.sendKeys(man.getHotelsearch().getCheckInDate(), prop.getCheckIn());
		bc.sendKeys(man.getHotelsearch().getCheckOutDate(), prop.getCheckOut());
		bc.dropdown(man.getHotelsearch().getNoOfAdults(), prop.getNoAdults());
		bc.dropdown(man.getHotelsearch().getNoOfChild(), prop.getNoChild());
	}

	@And("user clciks submits")
	public void user_clciks_submits() {
		bc.click(man.getHotelsearch().getSubmitForm());
	}

	@Then("user navigated to the select hotel page")
	public void user_navigated_to_the_select_hotel_page() {
		man.getSelecthotel().getSubmit().isDisplayed();
	}

	@Given("user is in the hotel selection page")
	public void user_is_in_the_hotel_selection_page() {
		System.out.println("select hotel page");
	}

	@When("user selects the hotel")
	public void user_selects_the_hotel() {
		bc.radioButton(man.getSelecthotel().getRadiobutton(), 0);
	}

	@And("user clicks on continue")
	public void user_clicks_on_continue() {
		bc.click(man.getSelecthotel().getSubmit());
	}

	@Then("user is navigated to the Book Hotel page")
	public void user_is_navigated_to_the_book_hotel_page() {
		man.getBookHotel().getBillingAddress().isDisplayed();
	}

	@Given("user is in info entering page")
	public void user_is_in_info_entering_page() {
		System.out.println("user is booking a hotel");
	}

	@When("user enters the necessary fields")
	public void user_enters_the_necessary_fields() {
		bc.sendKeys(man.getBookHotel().getFirstName(), prop.getFirstName());
		bc.sendKeys(man.getBookHotel().getLastName(), prop.getLastName());
		bc.sendKeys(man.getBookHotel().getBillingAddress(), prop.getBillAddress());
		bc.sendKeys(man.getBookHotel().getCreditCardNo(), prop.getCreditcardNo());
		bc.dropdown(man.getBookHotel().getSelectCCtype(), prop.getCardType());
		bc.dropdown(man.getBookHotel().getSelectExpMonth(), prop.getExpiryMonth());
		bc.dropdown(man.getBookHotel().getSelectYear(), prop.getExpYear());
		bc.sendKeys(man.getBookHotel().getCvvNumber(), prop.getCvvNumber());
	}

	@And("user clicks on Book now")
	public void user_clicks_on_book_now() {
		bc.click(man.getBookHotel().getBookNow());
	}

	@Then("user is navigated to Conformation page")
	public void user_is_navigated_to_conformation_page() {
		man.getConfirm().getMy_itinerary().isDisplayed();
	}

	@Given("user need to log out")
	public void user_need_to_log_out() {
		System.out.println("user proceeds to logout");
	}

	@When("user clicks on logout button")
	public void user_clicks_on_logout_button() {
		bc.click(man.getConfirm().getLogout());
	}

	@Then("user is navigated to log out page")
	public void user_is_navigated_to_log_out_page() {
		man.getLogout().getLogoutrant().isDisplayed();
	}

}
