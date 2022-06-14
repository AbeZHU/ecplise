package com_stepDefinition;

import org.openqa.selenium.WebDriver;

import com_FileManager.Com_filemanager;
import com_POM_manager.Manager_pom;
import com_baseclass.BaseClass;
import com_runner.Orange_runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orange_stepdefinition {
	public static WebDriver driver = Orange_runner.driver;
	BaseClass bc = new BaseClass();
	Com_filemanager file = new Com_filemanager();
	Manager_pom pom = new Manager_pom(driver);

	@Given("user is in the login page of OrangeHRM")
	public void user_is_in_the_login_page_of_orange_hrm() {
		bc.get(file.getInstance_Login_config().getUrl());
	}

	@When("user enter the user name and password")
	public void user_enter_the_user_name_and_password() {
		bc.sendKeys(pom.getLoginpg().getTxt_username(), file.getInstance_Login_config().getUsername());
		bc.sendKeys(pom.getLoginpg().getTxt_password(), file.getInstance_Login_config().getPassword());
	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() {
		bc.clickElement(pom.getLoginpg().getBtn_login());
	}

	@Then("navigated to the Dashboard page")
	public void navigated_to_the_dashboard_page() {
		pom.getHomepg().getMenu_PIM().isDisplayed();
	}

	@When("user click on Add employee in PIM tree")
	public void user_click_on_add_employee_in_pim_tree() {
		
	}

	@Then("navigated to the add Employee page")
	public void navigated_to_the_add_employee_page() {

	}

	@Given("user is in the add employee page")
	public void user_is_in_the_add_employee_page() {

	}

	@When("user enters the first, middle, last name")
	public void user_enters_the_first_middle_last_name() {

	}

	@And("user chooses photograph")
	public void user_chooses_photograph() {

	}

	@And("user creates login details")
	public void user_creates_login_details() {

	}

	@And("user clicks on submit")
	public void user_clicks_on_submit() {

	}

	@Then("navigated to the Personl details page")
	public void navigated_to_the_personl_details_page() {

	}

	@Given("user clicks on employee list on PIM dropdown")
	public void user_clicks_on_employee_list_on_pim_dropdown() {

	}

	@And("user is in employee list page")
	public void user_is_in_employee_list_page() {

	}

	@When("user enters the details on search fields")
	public void user_enters_the_details_on_search_fields() {

	}

	@And("user clicks on recently added employee")
	public void user_clicks_on_recently_added_employee() {

	}

	@Then("validate the information given there")
	public void validate_the_information_given_there() {

	}

}
