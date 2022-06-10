package com_Runner;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com_baseclass.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com_feature", glue = "com_stepDefinition", plugin = { "pretty",
		"html:Adactin_final/reports" }, monochrome = true)
public class Runner_com {
	public static WebDriver driver;

	@BeforeClass 
	public static void browser() {
		driver = BaseClass.openB("chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}