package com_Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com_baseclass.BaseClass_com;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature", glue = "stepdefinition", plugin = { "pretty",
		"html:Adactin_final/reports" }, monochrome = true)
public class Runner_com {
	public static WebDriver driver;

	@BeforeClass 
	public static void browser() {
		driver = BaseClass_com.browserLaunch("chrome");
	}
}